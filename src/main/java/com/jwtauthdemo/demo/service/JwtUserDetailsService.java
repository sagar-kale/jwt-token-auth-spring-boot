package com.jwtauthdemo.demo.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("sagar".equals(username)) {
            return new User("sagar", "$2a$12$hDy6O/ps5dxsb/N9rWORRuPT08ZJyk2SG.h.HTmIvVXvJBuEwE1Iu", Collections.emptyList());
        }
        throw new UsernameNotFoundException("User Not Found with Username:" + username);
    }
}
