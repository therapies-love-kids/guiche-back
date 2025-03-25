package com.tlk.br.api.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

import com.tlk.br.api.domain.dtos.ResponsavelDTO;
import com.tlk.br.api.domain.entitites.Responsavel;
import com.tlk.br.api.repositories.ResponsavelRepository;

@Service
public class ResponsavelServiceImpl implements ResponsavelService {

    private final ResponsavelRepository responsavelRepository;

    public ResponsavelServiceImpl(ResponsavelRepository responsavelRepository) {
        this.responsavelRepository = responsavelRepository;
    }

    @Override
    public Responsavel save(ResponsavelDTO responsavelDTO) {
        Responsavel responsavel = new Responsavel();
        BeanUtils.copyProperties(responsavelDTO, responsavel);
        return responsavelRepository.save(responsavel);
    }

    @Override
    public Responsavel findById(Long id) {
        return responsavelRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Responsavel> findAll() {
        return responsavelRepository.findAll();
    }

    @Override
    public Responsavel update(ResponsavelDTO responsavelDTO) {
        Responsavel responsavel = findById(responsavelDTO.getId());
        BeanUtils.copyProperties(responsavelDTO, responsavel);
        return responsavelRepository.save(responsavel);
    }

    @Override
    public void delete(Long id) {
        responsavelRepository.deleteById(id);
    }
}
