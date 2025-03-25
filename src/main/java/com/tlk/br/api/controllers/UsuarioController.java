package com.tlk.br.api.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlk.br.api.domain.dtos.UsuarioDTO;
import com.tlk.br.api.domain.entitites.Usuario;
import com.tlk.br.api.services.UsuarioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/usuarios")
@Tag(name = "Usuários", description = "Usuários")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    @Operation(summary = "Criar um novo usuário")
    public ResponseEntity<Usuario> save(@RequestBody UsuarioDTO usuarioDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuarioDTO));
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar um usuário pelo ID")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.findById(id));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar um usuário pelo ID")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        usuarioService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar um usuário existente")
    public ResponseEntity<Usuario> update(@PathVariable Long id, @RequestBody UsuarioDTO usuarioDTO) {
        return ResponseEntity.ok(usuarioService.update(id, usuarioDTO));
    }

    @GetMapping
    @Operation(summary = "Buscar todos os usuários")
    public ResponseEntity<List<Usuario>> findAll() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @PutMapping("/validateUserPassword")
    public ResponseEntity<Boolean> validateUserPassword(String nome, String password) {
        return ResponseEntity.ok(usuarioService.validateUserPassword(nome, password));
    }

    @PutMapping("/activateUser/{id}")
    public ResponseEntity<Usuario> activateUser(@PathVariable Long id) {
        usuarioService.activateUser(id);
        return ResponseEntity.noContent().build();
    }
    
    @PutMapping("/deactivateUser/{id}")
    public ResponseEntity<Usuario> deactivateUser(@PathVariable Long id) {
        usuarioService.deactivateUser(id);
        return ResponseEntity.noContent().build();
    }

}
