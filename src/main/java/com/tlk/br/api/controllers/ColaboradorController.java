package com.tlk.br.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlk.br.api.domain.dtos.ColaboradorDTO;
import com.tlk.br.api.domain.entities.Colaborador;
import com.tlk.br.api.services.ColaboradorService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/colaborador")
@Tag(name = "Colaborador", description = "API de Colaborador")
public class ColaboradorController {
    private final ColaboradorService colaboradorService;

    public ColaboradorController(ColaboradorService colaboradorService) {
        this.colaboradorService = colaboradorService;
    }

    @PostMapping 
    @Operation(summary = "Criar um novo colaborador")
    public ResponseEntity<Colaborador> save(@RequestBody ColaboradorDTO colaboradorDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(colaboradorService.save(colaboradorDTO));
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar um colaborador pelo ID")
    public ResponseEntity<Colaborador> findById(@PathVariable Long id) {
        return ResponseEntity.ok(colaboradorService.findById(id));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar um colaborador pelo ID")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        colaboradorService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar um colaborador existente")
    public ResponseEntity<Colaborador> update(@PathVariable Long id, @RequestBody ColaboradorDTO colaboradorDTO) {
        return ResponseEntity.ok(colaboradorService.update(id, colaboradorDTO));
    }

    @GetMapping
    @Operation(summary = "Buscar todos os colaboradores")
    public ResponseEntity<List<Colaborador>> findAll() {
        return ResponseEntity.ok(colaboradorService.findAll());
    }

    @GetMapping("/email/{email}")
    @Operation(summary = "Buscar um colaborador pelo email")
    public ResponseEntity<Colaborador> findByEmail(@PathVariable String email) {
        return ResponseEntity.ok(colaboradorService.findByEmail(email));
    }

    @GetMapping("/cpf/{cpf}")
    @Operation(summary = "Buscar um colaborador pelo CPF")
    public ResponseEntity<Colaborador> findByCpf(@PathVariable String cpf) {
        return ResponseEntity.ok(colaboradorService.findByCpf(cpf));
    }
}
