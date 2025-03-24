package com.tlk.br.api.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlk.br.api.domain.dtos.PacienteDTO;
import com.tlk.br.api.services.PacienteService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/paciente")
@Tag(name = "Paciente", description = "Paciente")
public class PacienteController {
    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @PostMapping
    public void save(PacienteDTO pacienteDTO) {
        pacienteService.save(pacienteDTO);
    }

    @GetMapping
    public void findById(PacienteDTO pacienteDTO) {
        pacienteService.findById(pacienteDTO.getId());
    }

    @PutMapping
    public void update(PacienteDTO pacienteDTO) {
        pacienteService.update(pacienteDTO);
    }

    @DeleteMapping
    public void delete(PacienteDTO pacienteDTO) {
        pacienteService.delete(pacienteDTO.getId());
    }
}
