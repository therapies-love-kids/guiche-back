package com.tlk.br.api.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.tlk.br.api.domain.dtos.ConvenioDTO;
import com.tlk.br.api.domain.entities.Convenio;
import com.tlk.br.api.repositories.ConvenioRepository;
import com.tlk.br.api.services.ConvenioService;

@Service
public class ConvenioServiceImpl implements ConvenioService {

    private final ConvenioRepository convenioRepository;

    public ConvenioServiceImpl(ConvenioRepository convenioRepository) {
        this.convenioRepository = convenioRepository;
    }

    @Override
    public Convenio save(ConvenioDTO convenioDTO) {
        Convenio convenio = new Convenio();
        BeanUtils.copyProperties(convenioDTO, convenio);
        return convenioRepository.save(convenio);
    }

    @Override
    public Convenio update(ConvenioDTO convenioDTO) {
        Convenio convenio = findById(convenioDTO.getId());
        BeanUtils.copyProperties(convenioDTO, convenio);
        return convenioRepository.save(convenio);
    }

    @Override
    public Convenio findById(Long id) {
        return convenioRepository.findById(id).orElseThrow();
    }

    @Override
    public Convenio delete(ConvenioDTO convenioDTO) {
        convenioRepository.deleteById(convenioDTO.getId());
        return new Convenio(); // Return a new object or handle the response as needed
    }

    @Override
    public Convenio findByPacienteId(Long id) {
        return convenioRepository.findById(id).orElseThrow();
    }
}
