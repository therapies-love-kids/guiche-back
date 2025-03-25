package com.tlk.br.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlk.br.api.domain.dtos.EmpresaDTO;
import com.tlk.br.api.domain.entitites.Empresa;
import com.tlk.br.api.services.EmpresaService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/empresa")
@Tag(name = "Empresa", description = "API de Empresa")
public class EmpresaController {
    private EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @PostMapping
    public Empresa save(EmpresaDTO empresaDTO) {
        return empresaService.save(empresaDTO);
    }

    @GetMapping
    public Empresa findById(Long id) {
        return empresaService.findById(id);
    }

    @PutMapping
    public Empresa update(EmpresaDTO empresaDTO) {
        return empresaService.update(empresaDTO);
    }

    @DeleteMapping
    public void delete(EmpresaDTO empresaDTO) {
        empresaService.delete(empresaDTO.getId());
    }

    @GetMapping("/cnpj/{cnpj}")
    public Empresa findByCnpj(String cnpj) {
        return empresaService.findByCnpj(cnpj);
    }

    @GetMapping("/razao_social/{razao_social}")
    public Empresa findByrazao_social(String razao_social) {
        return empresaService.findByrazao_social(razao_social);
    }

    @GetMapping("/nome_fantasia/{nome_fantasia}")
    public List<Empresa> findBynome_fantasia(String nome_fantasia) {
        return empresaService.findBynome_fantasia(nome_fantasia);
    }

    // @GetMapping("/email/{email}")
    // public Empresa findByEmail(String email) {
    // return empresaService.findByEmail(email);
    // }

    @GetMapping("/numero/{numero}")
    public Empresa findByNumero(String numero) {
        return empresaService.findByNumero(numero);
    }

    @GetMapping("/cep/{cep}")
    public Empresa findByCep(String cep) {
        return empresaService.findByCep(cep);
    }

    @GetMapping("/cidade/{cidade}")
    public Empresa findByCidade(String cidade) {
        return empresaService.findByCidade(cidade);
    }
}
