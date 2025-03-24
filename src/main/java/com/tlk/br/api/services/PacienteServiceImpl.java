package com.tlk.br.api.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.tlk.br.api.domain.dtos.PacienteDTO;
import com.tlk.br.api.domain.entitites.Paciente;
import com.tlk.br.api.repositories.PacienteRepository;

@Service
public class PacienteServiceImpl implements PacienteService {

    private final PacienteRepository pacienteRepository;

    public PacienteServiceImpl(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public Paciente save(PacienteDTO pacienteDTO) {
        Paciente paciente = new Paciente();
        BeanUtils.copyProperties(pacienteDTO, paciente);
        return pacienteRepository.save(paciente);
    }

    @Override
    public Paciente update(PacienteDTO pacienteDTO) {
        Paciente paciente = findById(pacienteDTO.getId());
        BeanUtils.copyProperties(pacienteDTO, paciente);
        return pacienteRepository.save(paciente);
    }

    @Override
    public Paciente findById(long id) {
        return pacienteRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        pacienteRepository.deleteById(id);
    }
}
