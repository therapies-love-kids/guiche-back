package com.tlk.br.api.services;

import com.tlk.br.api.domain.dtos.AgendamentoDTO;
import com.tlk.br.api.domain.entities.Agendamento;

import java.sql.Timestamp;
import java.util.List;

public interface AgendamentoService {

    List<AgendamentoDTO> getCurrentAgendamentos(Long especialistaColaboradorId);
    List<AgendamentoDTO> getPreviousAgendamentos(Long especialistaColaboradorId);
    List<Agendamento> getWaitingAgendamentos();
    Agendamento save(Agendamento agendamento);
    Agendamento updateStatus(Long id, String status);
    Agendamento updateAgendamentoDetails(Long id, String sala, String tipo, String observacoes);
    List<AgendamentoDTO> getAgendamentosByDateAndColaborador(Long especialistaColaboradorId, Timestamp data);
    List<AgendamentoDTO> getAllAgendamentosEmAtendimento();
    List<AgendamentoDTO> getAllAgendamentos();
    List<AgendamentoDTO> byUnidadePrefixo(String unidadePrefixo);
}