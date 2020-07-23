package cn.com.boe.b5.fwp.poserver.config;

import cn.com.boe.b5.fwp.poserver.model.UserInfo;
import cn.com.boe.b5.fwp.poserver.model.UserRole;
import cn.com.boe.b5.fwp.poserver.repository.UserInfoRepository;
import com.alibaba.csb.sdk.HttpCaller;
import com.alibaba.csb.sdk.HttpParameters;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

// 用Portal账户名密码登录
public class PortalAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {
    @Autowired
    public UserInfoRepository userInfoRepository;

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {

    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        String password = authentication.getCredentials().toString();
        String encodePwd = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] md5Bytes = md5.digest(password.getBytes());
            encodePwd = "{MD5}" + Base64.getEncoder().encodeToString(md5Bytes);
        } catch (NoSuchAlgorithmException e) {
            encodePwd = password;
        }
        HashMap<String, String> kvs = new HashMap<String, String>();
        kvs.put("appId", "bidm-web");
        kvs.put("userName", username);
        kvs.put("password", encodePwd);

        HttpParameters.Builder builder = HttpParameters.newBuilder();
        builder
                .requestURL("http://10.252.65.63:9900/UC_userAuth")
                .api("UC_userAuth")
                .version("1.0.0")
                .method("post")
                .accessKey("aeb481b4669f4c4c9c46bcc922b3f0df")
                .secretKey("ulSRQ97NlbGhRmTgvOJgoG2idvs=")
                .putParamsMapAll(kvs);
        try {
            String result = HttpCaller.invoke(builder.build());
            System.out.println(result);
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(result);
            if (rootNode.path("result").asBoolean()) {

                UserDetails u = User.builder().username(username).password(password).roles("user").build();
                return u;
            } else {
                throw new BadCredentialsException(messages.getMessage(
                        "AbstractUserDetailsAuthenticationProvider.badCredentials",
                        "Bad credentials"));
            }
        } catch (BadCredentialsException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new AuthenticationServiceException(ex.getMessage(), ex);
        }
    }
}
