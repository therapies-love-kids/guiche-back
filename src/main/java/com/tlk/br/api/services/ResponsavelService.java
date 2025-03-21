package com.tlk.br.api.services;

import java.util.List;

import com.tlk.br.api.domain.dtos.ResponsavelDTO;
import com.tlk.br.api.domain.entitites.Responsavel;

public interface ResponsavelService {
    Responsavel save (ResponsavelDTO ResponsavelDTO);
    Responsavel findById (Long Id);
    List <Responsavel> findAll();
    Responsavel update (ResponsavelDTO ResponsavelDTO);
    void delete (Long Id);
}
