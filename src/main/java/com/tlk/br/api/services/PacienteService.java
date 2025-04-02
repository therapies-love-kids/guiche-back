package com.tlk.br.api.services;

import com.tlk.br.api.domain.dtos.PacienteDTO;
import com.tlk.br.api.domain.entities.Paciente;

public interface PacienteService {
    Paciente save(PacienteDTO pacienteDTO);
    PacienteDTO findById(Long pk);
    Paciente update(PacienteDTO pacienteDTO);
    boolean delete(Long pk);
}