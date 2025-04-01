package com.tlk.br.api.services;

import com.tlk.br.api.domain.entitites.Agendamento;
import com.tlk.br.api.domain.dtos.AgendamentoDTO;
import java.util.List;

public interface AgendamentoService {
    List<AgendamentoDTO> getCurrentAgendamentos(Long especialistaColaboradorId); // Adicionado parâmetro
    List<AgendamentoDTO> getPreviousAgendamentos(Long especialistaColaboradorId); // Adicionado parâmetro
    List<Agendamento> getWaitingAgendamentos(); // Novo método para agendamentos em espera
    Agendamento save(Agendamento agendamento);
    Agendamento updateStatus(Long id, String status); // Novo método para atualizar o status
}