package com.tlk.br.api.services.impl;

import com.tlk.br.api.domain.dtos.AgendamentoDTO;
import com.tlk.br.api.domain.entities.Agendamento;
import com.tlk.br.api.repositories.AgendamentoRepository;
import com.tlk.br.api.services.AgendamentoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgendamentoServiceImpl implements AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @Override
    public List<AgendamentoDTO> getCurrentAgendamentos(Long especialistaColaboradorId) {
        return agendamentoRepository.findCurrentAgendamentosByEspecialistaColaboradorId(especialistaColaboradorId)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<AgendamentoDTO> getPreviousAgendamentos(Long especialistaColaboradorId) {
        return agendamentoRepository.findPreviousAgendamentosByEspecialistaColaboradorId(especialistaColaboradorId)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<Agendamento> getWaitingAgendamentos() {
        return agendamentoRepository.findWaitingAgendamentos();
    }

    @Override
    public Agendamento save(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public Agendamento updateStatus(Long id, String status) {
        Agendamento agendamento = agendamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agendamento não encontrado"));
        agendamento.setStatus(status);
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public Agendamento updateAgendamentoDetails(Long id, String sala, String tipo, String observacoes) {
        Agendamento agendamento = agendamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agendamento não encontrado"));
        agendamento.setSala(sala);
        agendamento.setTipo(tipo);
        agendamento.setObservacoes(observacoes);
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public List<AgendamentoDTO> getAgendamentosByDateAndColaborador(Long especialistaColaboradorId, Timestamp data) {
        return agendamentoRepository.findByEspecialistaColaboradorIdAndData(especialistaColaboradorId, data)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<AgendamentoDTO> getAllAgendamentosEmAtendimento() {
        return agendamentoRepository.findAllAgendamentosEmAtendimento()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<AgendamentoDTO> getAllAgendamentos() {
        return agendamentoRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<AgendamentoDTO> byUnidadePrefixo(String unidadePrefixo) {
        return agendamentoRepository.findByUnidadePrefixo(unidadePrefixo)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private AgendamentoDTO convertToDTO(Agendamento agendamento) {
        AgendamentoDTO dto = new AgendamentoDTO();
        BeanUtils.copyProperties(agendamento, dto);
        return dto;
    }
}