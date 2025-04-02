package com.tlk.br.api.services;

import java.util.List;

import com.tlk.br.api.domain.dtos.EmpresaDTO;
import com.tlk.br.api.domain.entities.Empresa;

public interface EmpresaService {
    Empresa findById(Long id);
    Empresa save(EmpresaDTO empresaDTO);
    Empresa update(EmpresaDTO empresaDTO);
    void delete(Long Id);
    Empresa findByCnpj(String cnpj);
    Empresa findByrazao_social(String razao_social);
    List<Empresa> findBynome_fantasia(String nome_fantasia);
    // Empresa findByEmail(String email);
    Empresa findByNumero(String numero);
    Empresa findByCep(String cep);
    Empresa findByCidade(String cidade);
}
