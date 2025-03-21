package com.tlk.br.api.services;

import com.tlk.br.api.domain.dtos.EmpresaDTO;
import com.tlk.br.api.domain.entitites.Empresa;

public interface EmpresaService {
    Empresa findById(Long id);
    Empresa save(EmpresaDTO empresaDTO);
    Empresa update(EmpresaDTO empresaDTO);
    void delete(Long Id);
    Empresa findByCnpj(String cnpj);
    Empresa findByRazaoSocial(String razaoSocial);
    Empresa findByNomeFantasia(String nomeFantasia);
    Empresa findByEmail(String email);
    Empresa findByTelefone(String telefone);
    Empresa findByCep(String cep);
    Empresa findByCidade(String cidade);
}
