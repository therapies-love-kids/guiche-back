package com.tlk.br.api.services;

import com.tlk.br.api.domain.dtos.LacoDTO;
import com.tlk.br.api.domain.entities.Laco;

public interface LacoService {
    Laco save (LacoDTO LacoDTO);
    Laco findById (LacoDTO LacoDTO);
    void delete (LacoDTO LacoDTO);
    Laco update (LacoDTO LacoDTO);
    Laco findByPacienteId (Long id);
}
