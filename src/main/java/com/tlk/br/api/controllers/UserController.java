package com.tlk.br.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlk.br.api.domain.dtos.UserDTO;
import com.tlk.br.api.domain.entitites.User;
import com.tlk.br.api.services.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService UserService;

    public UserController(UserService userService) {
        this.UserService = userService;
    }
    @PostMapping 
    public ResponseEntity<User> save(@RequestBody UserDTO userDTO) {
        //TODO: process POST request
        return ResponseEntity.status(HttpStatus.CREATED).body(UserService.save(userDTO));
    }
   
    
}
