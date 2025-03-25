package com.tlk.br.api.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlk.br.api.domain.dtos.ConvenioDTO;
import com.tlk.br.api.domain.entitites.Convenio;
import com.tlk.br.api.services.ConvenioService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/convenios")
@Tag(name = "Convênios", description = "API de Convênios")
public class ConvenioController {
    private final ConvenioService convenioService;

    public ConvenioController(ConvenioService convenioService) {
        this.convenioService = convenioService;
    }

    @PostMapping
    public Convenio save(ConvenioDTO convenioDTO) {
        return convenioService.save(convenioDTO);
    }

    @PutMapping
    public Convenio update(ConvenioDTO convenioDTO) {
        return convenioService.update(convenioDTO);
    }

    @DeleteMapping
    public Convenio delete(ConvenioDTO convenioDTO) {
        return convenioService.delete(convenioDTO);
    }

    @GetMapping
    public Convenio findById(Long id) {
        return convenioService.findById(id);
    }

    @GetMapping("/paciente/{id}")
    public Convenio findByPacienteId(Long id) {
        return convenioService.findByPacienteId(id);
    }
}
