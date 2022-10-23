package com.techfest.project.security;

import com.techfest.project.service.HouseService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(
                        "/",
                        "/index/**",
                        "/img/**",
                        "/css/**",
                        "/js/**",
                        "/template/fragments/**",
                        "/fragments/**",
                        "/signup/**",
                        "/signup",
                        "/login/**",
                        "/login",
                        "/contact",
                        "/courses",
                        "/houses",
                        "/houses/add"
                       )
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .clearAuthentication(true)
                .invalidateHttpSession(true)
                .logoutSuccessUrl("/");

    }



    @Bean
    public HouseService houseService(){
        HouseService service = new HouseService();
        return service;
    }

}

