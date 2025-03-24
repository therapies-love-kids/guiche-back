package com.tlk.br.api.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.tlk.br.api.domain.dtos.ContratoDTO;
import com.tlk.br.api.domain.entitites.Contrato;
import com.tlk.br.api.repositories.ContratoRepository;

@Service
public class ContratoServiceImpl implements ContratoService {

    private final ContratoRepository contratoRepository;

    public ContratoServiceImpl(ContratoRepository contratoRepository) {
        this.contratoRepository = contratoRepository;
    }

    @Override
    public Contrato save(ContratoDTO contratoDTO) {
        Contrato contrato = new Contrato();
        BeanUtils.copyProperties(contratoDTO, contrato);
        return contratoRepository.save(contrato);
    }

    @Override
    public Contrato update(ContratoDTO contratoDTO) {
        Contrato contrato = findById(contratoDTO.getId());
        BeanUtils.copyProperties(contratoDTO, contrato);
        return contratoRepository.save(contrato);
    }

    @Override
    public Contrato findById(Long id) {
        return contratoRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(ContratoDTO contratoDTO) {
        contratoRepository.deleteById(contratoDTO.getId());
    }

    @Override
    public Contrato findByPacienteId(Long id) {
        return contratoRepository.findByPacienteId(id).orElseThrow();
    }
}
