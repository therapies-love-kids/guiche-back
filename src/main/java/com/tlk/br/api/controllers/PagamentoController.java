package com.tlk.br.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlk.br.api.domain.dtos.PagamentoDTO;
import com.tlk.br.api.services.PagamentoService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/pagamentos")
@Tag(name = "Pagamentos", description = "Operações relacionadas aos pagamentos")
public class PagamentoController {

    private PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping
    public void save(PagamentoDTO pagamentoDTO) {
        pagamentoService.save(pagamentoDTO);
    }

    @PutMapping
    public void update(PagamentoDTO pagamentoDTO) {
        pagamentoService.update(pagamentoDTO);
    }

    @GetMapping
    public void findById(PagamentoDTO pagamentoDTO) {
        pagamentoService.findById(pagamentoDTO.getId());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        pagamentoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
