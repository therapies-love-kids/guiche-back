package com.tlk.br.api.services.impl;

import com.tlk.br.api.domain.dtos.ConvenioDTO;
import com.tlk.br.api.domain.entities.Convenio;
import com.tlk.br.api.repositories.ConvenioRepository;
import com.tlk.br.api.services.ConvenioService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConvenioServiceImpl implements ConvenioService {

    @Autowired
    private ConvenioRepository convenioRepository;

    @Override
    public ConvenioDTO save(ConvenioDTO convenioDTO) {
        Convenio convenio = new Convenio();
        BeanUtils.copyProperties(convenioDTO, convenio);
        convenio = convenioRepository.save(convenio);
        BeanUtils.copyProperties(convenio, convenioDTO);
        return convenioDTO;
    }

    @Override
    public ConvenioDTO update(Integer pk, ConvenioDTO convenioDTO) {
        Convenio convenio = convenioRepository.findById(pk)
                .orElseThrow(() -> new RuntimeException("Convênio não encontrado"));
        BeanUtils.copyProperties(convenioDTO, convenio, "pk");
        convenio = convenioRepository.save(convenio);
        BeanUtils.copyProperties(convenio, convenioDTO);
        return convenioDTO;
    }

    @Override
    public ConvenioDTO findByPk(Integer pk) {
        Convenio convenio = convenioRepository.findById(pk)
                .orElseThrow(() -> new RuntimeException("Convênio não encontrado"));
        ConvenioDTO convenioDTO = new ConvenioDTO();
        BeanUtils.copyProperties(convenio, convenioDTO);
        return convenioDTO;
    }

    @Override
    public void delete(Integer pk) {
        Convenio convenio = convenioRepository.findById(pk)
                .orElseThrow(() -> new RuntimeException("Convênio não encontrado"));
        convenioRepository.delete(convenio);
    }

    @Override
    public List<ConvenioDTO> findAll() {
        return convenioRepository.findAll().stream().map(convenio -> {
            ConvenioDTO convenioDTO = new ConvenioDTO();
            BeanUtils.copyProperties(convenio, convenioDTO);
            return convenioDTO;
        }).collect(Collectors.toList());
    }
}