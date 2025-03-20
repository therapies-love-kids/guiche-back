package com.tlk.br.api.services;

import com.tlk.br.api.domain.dtos.ColaboradorDTO;
import com.tlk.br.api.domain.entitites.Colaborador;

import java.util.List;

public interface ColaboradorService {
    Colaborador save(ColaboradorDTO colaboradorDTO);
    List<Colaborador> findAll();
    Colaborador findById(Long id);
    Colaborador findByEmail(String email);
    Colaborador findByCpf(String cpf);
    Colaborador update(Long id,ColaboradorDTO colaboradorDTO);
    void delete(Long id);
}
