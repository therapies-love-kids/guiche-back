package com.tlk.br.api.services;

import com.tlk.br.api.domain.dtos.AgendamentoDTO;
import com.tlk.br.api.domain.entitites.Agendamento;

import java.util.List;

public interface AgendamentoService {
    Agendamento save(AgendamentoDTO agendamentoDTO);
    List<Agendamento> findAll();
    Agendamento findById(Long id);
    void delete(Long Id);
    Agendamento update(Long id, AgendamentoDTO agendamentoDTO);
}
