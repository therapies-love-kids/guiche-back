package com.tlk.br.api.services;

import com.tlk.br.api.domain.entitites.Agendamento;
import com.tlk.br.api.domain.dtos.AgendamentoDTO;
import com.tlk.br.api.repositories.AgendamentoRepository;
import com.tlk.br.api.services.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgendamentoServiceImpl implements AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @Override
    public List<AgendamentoDTO> getCurrentAgendamentos(Long especialistaColaboradorId) {
        LocalDate today = LocalDate.now();
        LocalDateTime startOfDay = today.atStartOfDay();
        LocalDateTime endOfDay = today.atTime(LocalTime.MAX);

        Timestamp startTimestamp = Timestamp.valueOf(startOfDay);
        Timestamp endTimestamp = Timestamp.valueOf(endOfDay);

        System.out.println("Buscando agendamentos com status 'em atendimento' para o colaborador " + especialistaColaboradorId + " entre " + startTimestamp + " e " + endTimestamp);

        List<Agendamento> agendamentos = agendamentoRepository.findByStatusAndEspecialistaColaboradorIdAndDataHoraSalaBetweenOrderByDataHoraSalaDesc(
                "em atendimento", especialistaColaboradorId, startTimestamp, endTimestamp);

        if (agendamentos.isEmpty()) {
            System.out.println("Nenhum agendamento encontrado com status 'em atendimento' para o colaborador " + especialistaColaboradorId + " no dia atual.");
            return List.of();
        }

        System.out.println("Agendamentos encontrados: " + agendamentos.size());
        return agendamentos.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public List<AgendamentoDTO> getPreviousAgendamentos(Long especialistaColaboradorId) {
        LocalDate today = LocalDate.now();
        LocalDateTime startOfDay = today.atStartOfDay();
        LocalDateTime endOfDay = today.atTime(LocalTime.MAX);

        Timestamp startTimestamp = Timestamp.valueOf(startOfDay);
        Timestamp endTimestamp = Timestamp.valueOf(endOfDay);

        System.out.println("Buscando agendamentos anteriores com status 'finalizado' para o colaborador " + especialistaColaboradorId + " entre " + startTimestamp + " e " + endTimestamp);

        List<Agendamento> agendamentos = agendamentoRepository.findByStatusAndEspecialistaColaboradorIdAndDataHoraSalaBetweenOrderByDataHoraSalaDesc(
                "finalizado", especialistaColaboradorId, startTimestamp, endTimestamp);

        return agendamentos.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public List<Agendamento> getWaitingAgendamentos() {
        LocalDate today = LocalDate.now();
        LocalDateTime startOfDay = today.atStartOfDay();
        LocalDateTime endOfDay = today.atTime(LocalTime.MAX);

        Timestamp startTimestamp = Timestamp.valueOf(startOfDay);
        Timestamp endTimestamp = Timestamp.valueOf(endOfDay);

        System.out.println("Buscando agendamentos com status 'em espera' entre " + startTimestamp + " e " + endTimestamp);

        List<Agendamento> agendamentos = agendamentoRepository.findByStatusAndDataHoraSalaBetweenOrderByDataHoraSalaAsc(
                "em espera", startTimestamp, endTimestamp);

        if (agendamentos.isEmpty()) {
            System.out.println("Nenhum agendamento encontrado com status 'em espera' no dia atual.");
            return List.of();
        }

        System.out.println("Agendamentos em espera encontrados: " + agendamentos.size());
        return agendamentos;
    }

    @Override
    public Agendamento save(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public Agendamento updateStatus(Long id, String status) {
        Agendamento agendamento = agendamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agendamento não encontrado com ID: " + id));
        agendamento.setStatus(status);
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public List<AgendamentoDTO> getAgendamentosByDateAndColaborador(Long especialistaColaboradorId, Timestamp data) {
        System.out.println("Buscando agendamentos para o colaborador " + especialistaColaboradorId + " na data " + data);

        List<Agendamento> agendamentos = agendamentoRepository.findByEspecialistaColaboradorIdAndDataHoraSalaDate(
                especialistaColaboradorId, data);

        if (agendamentos.isEmpty()) {
            System.out.println("Nenhum agendamento encontrado para o colaborador " + especialistaColaboradorId + " na data " + data);
            return List.of();
        }

        System.out.println("Agendamentos encontrados: " + agendamentos.size());
        return agendamentos.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private AgendamentoDTO convertToDTO(Agendamento agendamento) {
        AgendamentoDTO dto = new AgendamentoDTO();
        String codigo = agendamento.getTipo() + agendamento.getPk();
        dto.setCodigo(codigo);
        dto.setSala(agendamento.getSala());
        dto.setDataHoraSala(agendamento.getDataHoraSala());
        return dto;
    }
}