package com.tlk.br.api.services;

import com.tlk.br.api.domain.dtos.ConvenioDTO;
import com.tlk.br.api.domain.entities.Convenio;

public interface ConvenioService {
    Convenio save (ConvenioDTO convenioDTO);
    Convenio update (ConvenioDTO convenioDTO);
    Convenio findById(Long id);
    Convenio delete (ConvenioDTO convenioDTO);
    Convenio findByPacienteId(Long id);
}
