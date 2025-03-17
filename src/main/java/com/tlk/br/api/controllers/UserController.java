package com.tlk.br.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlk.br.api.domain.dtos.UserDTO;
import com.tlk.br.api.domain.entitites.User;
import com.tlk.br.api.services.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/user")
@Tag(name = "Usuário", description = "API de Usuário")
public class UserController {

    private final UserService UserService;

    public UserController(UserService userService) {
        this.UserService = userService;
    }
    @PostMapping 
    @Operation(summary = "Criar um novo usuário")
    public ResponseEntity<User> save(@RequestBody UserDTO userDTO) {
        //TODO: process POST request
        return ResponseEntity.status(HttpStatus.CREATED).body(UserService.save(userDTO));
    }
   
    @GetMapping("/{id}")
    @Operation(summary = "Buscar um usuário pelo ID")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok(UserService.findById(id));
    }
    
}
