package com.example.internetprovider.service;

import com.example.internetprovider.dto.UserDTO;
import com.example.internetprovider.entity.User;
import com.example.internetprovider.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public Optional<User> findByUserLogin (UserDTO userDTO) {
//        return userRepository.findByEmail(userDTO.getEmail());
//    }

    public void saveNewUser (User user) {
        log.info("Show the code " + user.toString());

        try {
            userRepository.save(user);
        } catch (Exception ex) {
            log.info("{Email address already exists}");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        log.info(username);
        User user = userRepository.findByUsername(username).orElseThrow(() -> {
            log.warn(username + " is not found in DB");
            return new UsernameNotFoundException(username + " not found.");
        });
        log.info("User from UserService: " + user);
        return user;
    }
}
