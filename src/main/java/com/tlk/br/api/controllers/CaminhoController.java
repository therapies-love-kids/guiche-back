package com.tlk.br.api.controllers;

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

import com.tlk.br.api.domain.dtos.CaminhoDTO;
import com.tlk.br.api.domain.entities.Caminho;
import com.tlk.br.api.services.CaminhoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/caminho")
@Tag(name = "Caminho", description = "Caminho")
public class CaminhoController {

    private final CaminhoService caminhoService;

    public CaminhoController(CaminhoService caminhoService) {
        this.caminhoService = caminhoService;
    }
    
    @PostMapping 
    @Operation(summary = "Criar um novo caminho")
    public ResponseEntity<Caminho> save(@RequestBody CaminhoDTO caminhoDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(caminhoService.save(caminhoDTO));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar um caminho existente")
    public ResponseEntity<Caminho> update(@PathVariable Long id, @RequestBody CaminhoDTO caminhoDTO) {
        return ResponseEntity.ok(caminhoService.update(caminhoDTO));
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar um caminho pelo ID")
    public ResponseEntity<Caminho> findById(@PathVariable Long id) {
        return ResponseEntity.ok(caminhoService.findById(id));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar um caminho pelo ID")
    public void delete(@PathVariable Long id) {
        caminhoService.delete(id);
    }
}
