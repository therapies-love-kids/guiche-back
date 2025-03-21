package com.tlk.br.api.services;

import com.tlk.br.api.domain.dtos.DocumentoDTO;
import com.tlk.br.api.domain.entitites.Documento;

public interface DocumentoService {
    Documento save (DocumentoDTO documentoDTO);
    Documento update (DocumentoDTO documentoDTO);
    Documento findById (Long id);
    void delete (DocumentoDTO documentoDTO);
    Documento findByPacienteId (Long id);
}
