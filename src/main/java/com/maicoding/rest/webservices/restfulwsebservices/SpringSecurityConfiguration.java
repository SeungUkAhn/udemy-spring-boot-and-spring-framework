package com.maicoding.rest.webservices.restfulwsebservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        //모든 요청은 인증과정을 거쳐야한다.
        http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
        //인증되지 않은 경우 인증 팝업을 출력
        http.httpBasic(Customizer.withDefaults());
        //CSRF -> POST, PUT
        http.csrf().disable();
        return http.build();
    }
}
