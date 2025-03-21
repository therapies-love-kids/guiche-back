package com.tlk.br.api.services;

import com.tlk.br.api.domain.dtos.ContratoDTO;
import com.tlk.br.api.domain.entitites.Contrato;

public interface ContratoService {

    Contrato save(ContratoDTO contratoDTO);
    Contrato update(ContratoDTO contratoDTO);
    Contrato findById(Long id);
    void delete(ContratoDTO contratoDTO);
    Contrato findByPacienteId(Long id);
}
