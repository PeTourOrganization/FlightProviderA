//package com.example.app.flightprovidera.config;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@ConditionalOnWebApplication
//public class SecurityConfig {
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authz -> authz
//                        .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").permitAll()
//                        .requestMatchers("/providerA/**").permitAll()
//                        .requestMatchers("/ws/**").permitAll()
//                        .requestMatchers("/flights/**").permitAll()
//                        .requestMatchers("/**").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .csrf(AbstractHttpConfigurer::disable);
//        return http.build();
//    }
//
//    @Bean
//    public WebSecurityCustomizer webSecurityCustomizer(){
//        return (web -> web.ignoring().requestMatchers("/swagger-ui/**", "/v3/api-docs/**"));
//    }
//}
