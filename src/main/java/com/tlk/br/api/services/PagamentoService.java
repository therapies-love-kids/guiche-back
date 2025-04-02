package com.tlk.br.api.services;

import com.tlk.br.api.domain.dtos.PagamentoDTO;
import com.tlk.br.api.domain.entities.Pagamento;

public interface PagamentoService {
    Pagamento save (PagamentoDTO PagamentoDTO);
    Pagamento update (PagamentoDTO PagamentoDTO);
    Pagamento findById (Long Id);
    void delete (Long Id);
}
