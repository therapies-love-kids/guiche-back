package com.tlk.br.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tlk.br.api.domain.dtos.UsuarioDTO;
import com.tlk.br.api.domain.entities.Usuario;
import com.tlk.br.api.services.UsuarioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://localhost:5173")
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

    @PostMapping("/validateUserPassword")
    public ResponseEntity<Map<String, String>> validateUserPassword(@RequestParam String nome, @RequestParam String senha) {
        boolean isValid = usuarioService.validateUserPassword(nome, senha);
        if (isValid) {
            Map<String, String> response = new HashMap<>();
            response.put("perfil", usuarioService.getProfileByUserName(nome));
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error", "Usuário ou senha inválidos"));
        }
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

    @GetMapping("/getProfileByUserName/{nome}")
    public ResponseEntity<Usuario> getProfileByUserName(@PathVariable String nome) {
        Usuario usuario = usuarioService.findByNome(nome);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping("/checkAccess")
    public ResponseEntity<Map<String, Boolean>> checkAccess(@RequestParam String nome, @RequestParam String pageProfile) {
        boolean hasAccess = usuarioService.checkAccess(nome, pageProfile);
        return ResponseEntity.ok(Map.of("hasAccess", hasAccess));
    }

    @PostMapping("/setUserOnline")
    public ResponseEntity<Void> setUserOnline(@RequestParam String nome) {
        usuarioService.setUserOnline(nome);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/setUserOffline")
    public ResponseEntity<Void> setUserOffline(@RequestParam String nome) {
        usuarioService.setUserOffline(nome);
        return ResponseEntity.ok().build();
    }
}
