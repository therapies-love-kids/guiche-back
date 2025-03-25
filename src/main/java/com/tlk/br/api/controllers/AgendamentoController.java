package com.tlk.br.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlk.br.api.domain.dtos.AgendamentoDTO;
import com.tlk.br.api.domain.entitites.Agendamento;
import com.tlk.br.api.services.AgendamentoService;

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
@RequestMapping("/agendamento")
@Tag(name = "Agendamento", description = "API de Agendamento")
public class AgendamentoController {
    private final AgendamentoService agendamentoService;

    public AgendamentoController(AgendamentoService agendamentoService) {
        this.agendamentoService = agendamentoService;
    }

    @PostMapping
    @Operation(summary = "Criar um novo agendamento")
    public ResponseEntity<Agendamento> save(@RequestBody AgendamentoDTO agendamentoDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(agendamentoService.save(agendamentoDTO));
    }

    @GetMapping
    @Operation(summary = "Buscar todos os agendamentos")
    public ResponseEntity<List<Agendamento>> findAll() {
        return ResponseEntity.ok(agendamentoService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar um agendamento pelo ID")
    public ResponseEntity<Agendamento> findById(@PathVariable Long id) {
        return ResponseEntity.ok(agendamentoService.findById(id));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar um agendamento pelo ID")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        agendamentoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar um agendamento existente")
    public ResponseEntity<Agendamento> update(@PathVariable Long id, @RequestBody AgendamentoDTO agendamentoDTO) {
        return ResponseEntity.ok(agendamentoService.update(id, agendamentoDTO));
    }
}
