package com.tlk.br.api.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.tlk.br.api.domain.dtos.PagamentoDTO;
import com.tlk.br.api.domain.entitites.Pagamento;
import com.tlk.br.api.repositories.PagamentoRepository;

@Service
public class PagamentoServiceImpl implements PagamentoService {

    private final PagamentoRepository pagamentoRepository;

    public PagamentoServiceImpl(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    @Override
    public Pagamento save(PagamentoDTO pagamentoDTO) {
        Pagamento pagamento = new Pagamento();
        BeanUtils.copyProperties(pagamentoDTO, pagamento);
        return pagamentoRepository.save(pagamento);
    }

    @Override
    public Pagamento update(PagamentoDTO pagamentoDTO) {
        Pagamento pagamento = findById(pagamentoDTO.getId());
        BeanUtils.copyProperties(pagamentoDTO, pagamento);
        return pagamentoRepository.save(pagamento);
    }

    @Override
    public Pagamento findById(Long id) {
        return pagamentoRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        pagamentoRepository.deleteById(id);
    }
}
