package com.tlk.br.api.services;

import com.tlk.br.api.domain.dtos.CaminhoDTO;
import com.tlk.br.api.domain.entities.Caminho;

public interface CaminhoService {
    Caminho save(CaminhoDTO caminhoDTO);
    Caminho update(CaminhoDTO caminhoDTO);
    Caminho findById(Long id);
    void delete(Long id);
}
