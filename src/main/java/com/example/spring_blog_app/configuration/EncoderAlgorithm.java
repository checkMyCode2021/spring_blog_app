package com.example.spring_blog_app.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class EncoderAlgorithm {

    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

