package com.tlk.br.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlk.br.api.domain.dtos.ContratoDTO;
import com.tlk.br.api.domain.entities.Contrato;
import com.tlk.br.api.services.ContratoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/contratos")
@Tag(name = "Contrato" , description = "Contrato")
public class ContratoController {
    private final ContratoService contratoService;

    public ContratoController(ContratoService contratoService) {
        this.contratoService = contratoService;
    }

    @PostMapping
    @Operation(summary = "Criar um novo contrato")
    public Contrato save(ContratoDTO contratoDTO) {
        return contratoService.save(contratoDTO);
    }

    @PutMapping
    @Operation(summary = "Atualizar um contrato existente")
    public Contrato update(ContratoDTO contratoDTO) {
        return contratoService.update(contratoDTO);
    }

    @GetMapping
    @Operation(summary = "Buscar um contrato pelo ID")
    public ResponseEntity<Contrato> findById(ContratoDTO contratoDTO) {
        return ResponseEntity.ok(contratoService.findById(contratoDTO.getId()));
    }
    
    @DeleteMapping
    @Operation(summary = "Deletar um contrato pelo ID")
    public void delete(ContratoDTO contratoDTO) {
        contratoService.delete(contratoDTO);
    }
}
