package com.example.internetprovider.controller;

import com.example.internetprovider.dto.UserDTO;
import com.example.internetprovider.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value="/")
public class LoginFormController {
    private final UserService userService;

    @Autowired
    public LoginFormController(UserService userService) {
        this.userService = userService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value="login")
    public void loginFormController(UserDTO user){
//        log.info("{}", userService.findByUsername(user));
        log.info("{}", user);
        userService.saveNewUser(User.builder()
                .username("nickfollow")
                .firstName("Nick")
                .email("nick@testing.ua")
                .tariff()
                .build());
    }
}
