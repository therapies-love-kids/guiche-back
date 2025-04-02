package com.tlk.br.api.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlk.br.api.domain.dtos.DocumentoDTO;
import com.tlk.br.api.domain.entities.Documento;
import com.tlk.br.api.services.DocumentoService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/documento")
@Tag(name = "Documento", description = "API de Documento")
public class DocumentoController {
    private final DocumentoService documentoService;

    public DocumentoController(DocumentoService documentoService) {
        this.documentoService = documentoService;
    }

    @PostMapping
    public Documento save(DocumentoDTO documentoDTO) {
        return documentoService.save(documentoDTO);
    }

    @GetMapping ("/{id}")
    public Documento findById(Long id) {
        return documentoService.findById(id);
    }

    @PutMapping
    public Documento update(DocumentoDTO documentoDTO) {
        return documentoService.update(documentoDTO);
    }

    @DeleteMapping
    public void delete(DocumentoDTO documentoDTO) {
        documentoService.delete(documentoDTO);
    }

    @GetMapping("/paciente/{id}")
    public Documento findByPacienteId(Long id) {
        return documentoService.findByPacienteId(id);
    }
}
