package cn.com.boe.b5.fwp.poserver.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class LoginSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//        String res = "登陆成功";
//        response.setContentType("text/html;charset=UTF-8");
//        response.setContentLength(res.getBytes(StandardCharsets.UTF_8).length);
//        response.getWriter().write(res);
//
//        response
    }
}
