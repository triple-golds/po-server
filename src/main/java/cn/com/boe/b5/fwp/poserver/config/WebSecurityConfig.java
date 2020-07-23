package cn.com.boe.b5.fwp.poserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.support.JpaEvaluationContextExtension;
import org.springframework.data.spel.spi.EvaluationContextExtension;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.expression.SecurityExpressionRoot;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    public EvaluationContextExtension evaluationContextExtension{
//        return new JpaEvaluationContextExtension();
//    }

    @Bean
    EvaluationContextExtension securityExtension() {
        return new EvaluationContextExtension() {
            @Override
            public String getExtensionId() {
                return "security";
            }

            @Override
            public SecurityExpressionRoot getRootObject() {
                return new SecurityExpressionRoot(SecurityContextHolder.getContext().getAuthentication()) {
                };
            }
        };
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(new PortalAuthenticationProvider());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .cors(cors -> cors.configurationSource(corsConfigurationSource()))
                .exceptionHandling(exceptionHandling -> exceptionHandling
                        .authenticationEntryPoint(new MyAuthenticationEntryPoint()))
                .formLogin(formLogin -> formLogin
                        .loginProcessingUrl("/login")
                        .successHandler(new LoginSuccessHandler())
                        .failureHandler(new LoginFailureHandler()))
                .logout(logout -> logout
                        .logoutSuccessHandler(new HttpStatusReturningLogoutSuccessHandler(HttpStatus.ACCEPTED)))
                .authorizeRequests(authorizeRequests -> authorizeRequests
//                        .antMatchers("/login").permitAll()
                        .anyRequest().authenticated())
        ;
    }

    private CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowCredentials(true);
        configuration.addAllowedOrigin("*");
        configuration.addAllowedHeader("*");
        configuration.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }


}
