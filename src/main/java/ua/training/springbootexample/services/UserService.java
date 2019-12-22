package ua.training.springbootexample.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.training.springbootexample.entity.Role;
import ua.training.springbootexample.entity.User;

import java.util.Collections;

@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        return User.builder()
                .authorities(Collections.singletonList(Role.USER))
                .username(username)
                .password("{noop}password")
                .accountNonExpired(true)
                .accountNonLocked(true)
                .credentialsNonExpired(true)
                .enabled(true)
                .build();
    }

}
