package com.tlk.br.api.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlk.br.api.domain.dtos.LacoDTO;
import com.tlk.br.api.services.LacoService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/laco")
@Tag(name = "Laco", description = "API de Laco")
public class LacoController {
    private final LacoService lacoService;

    public LacoController(LacoService lacoService) {
        this.lacoService = lacoService;
    }

    @PostMapping
    public void save(LacoDTO lacoDTO) {
        lacoService.save(lacoDTO);
    }

    @GetMapping
    public void findById(LacoDTO lacoDTO) {
        lacoService.findById(lacoDTO);
    }

    @DeleteMapping
    public void delete(LacoDTO lacoDTO) {
        lacoService.delete(lacoDTO);
    }

    @PutMapping
    public void update(LacoDTO lacoDTO) {
        lacoService.update(lacoDTO);
    }

    @GetMapping("/paciente/{id}")
    public void findByPacienteId(Long id) {
        lacoService.findByPacienteId(id);
    }

}
