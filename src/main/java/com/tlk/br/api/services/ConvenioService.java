package com.tlk.br.api.services;

import com.tlk.br.api.domain.dtos.ConvenioDTO;
import java.util.List;

public interface ConvenioService {

    ConvenioDTO save(ConvenioDTO convenioDTO);
    ConvenioDTO update(Integer pk, ConvenioDTO convenioDTO);
    ConvenioDTO findByPk(Integer pk);
    void delete(Integer pk);
    List<ConvenioDTO> findAll();
}