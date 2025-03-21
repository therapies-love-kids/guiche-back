package com.tlk.br.api.services;

import com.tlk.br.api.domain.dtos.PacienteDTO;
import com.tlk.br.api.domain.entitites.Paciente;

public interface PacienteService {
    Paciente save (PacienteDTO PacienteDTO);
    Paciente update (PacienteDTO PacienteDTO);
    Paciente findById (long Id);
    void delete (Long Id);
}
