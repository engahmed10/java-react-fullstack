package com.pack.main.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter {

      @Override
     public void configure(HttpSecurity http) throws Exception { 
	  // http.authorizeRequests().antMatchers("/","/appointments").permitAll();
	  // http.authorizeRequests().antMatchers("/","/users").permitAll();
    	  //to enablle some request
       http.csrf().disable().authorizeRequests().anyRequest().permitAll();	  
       //TO enable h2 console
       http.headers().frameOptions().disable();
     }
}
