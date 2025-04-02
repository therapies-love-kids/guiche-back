package com.tlk.br.api.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlk.br.api.domain.dtos.ResponsavelDTO;
import com.tlk.br.api.domain.entities.Responsavel;
import com.tlk.br.api.services.ResponsavelService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/responsavel")
@Tag(name = "Responsavel", description = "Responsavel")
public class ResponsavelController {
    private final ResponsavelService responsavelService;

    public ResponsavelController(ResponsavelService responsavelService) {   
        this.responsavelService = responsavelService;
    }

    @PostMapping
    public void save(ResponsavelDTO responsavelDTO) {
        responsavelService.save(responsavelDTO);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Responsavel>> findAll() {
        return ResponseEntity.ok(responsavelService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Responsavel> findById(@PathVariable Long id) {
        return ResponseEntity.ok(responsavelService.findById(id));
    }

    @PutMapping
    public void update(ResponsavelDTO responsavelDTO) {
        responsavelService.update(responsavelDTO);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        responsavelService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
