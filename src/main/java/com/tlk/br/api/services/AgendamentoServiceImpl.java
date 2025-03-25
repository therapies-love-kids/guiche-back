package com.tlk.br.api.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.tlk.br.api.domain.dtos.AgendamentoDTO;
import com.tlk.br.api.domain.entitites.Agendamento;
import com.tlk.br.api.repositories.AgendamentoRepository;

@Service
public class AgendamentoServiceImpl implements AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    public AgendamentoServiceImpl(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    @Override
    public Agendamento save(AgendamentoDTO agendamentoDTO) {
        Agendamento agendamento = new Agendamento();
        BeanUtils.copyProperties(agendamentoDTO, agendamento);
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public List<Agendamento> findAll() {
        return agendamentoRepository.findAll();
    }

    @Override
    public Agendamento findById(Long id) {
        return agendamentoRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        agendamentoRepository.deleteById(id);
    }

    @Override
    public Agendamento update(Long Id, AgendamentoDTO agendamentoDTO) {
        Agendamento agendamento = findById(agendamentoDTO.getId());
        BeanUtils.copyProperties(agendamentoDTO, agendamento);
        return agendamentoRepository.save(agendamento);
    }
}