package com.tlk.br.api.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.tlk.br.api.domain.dtos.LacoDTO;
import com.tlk.br.api.domain.entities.Laco;
import com.tlk.br.api.repositories.LacoRepository;
import com.tlk.br.api.services.LacoService;

@Service
public class LacoServiceImpl implements LacoService {

    private final LacoRepository lacoRepository;

    public LacoServiceImpl(LacoRepository lacoRepository) {
        this.lacoRepository = lacoRepository;
    }

    @Override
    public Laco save(LacoDTO lacoDTO) {
        Laco laco = new Laco();
        BeanUtils.copyProperties(lacoDTO, laco);
        return lacoRepository.save(laco);
    }

    @Override
    public Laco findById(LacoDTO lacoDTO) {
        return lacoRepository.findById(lacoDTO.getId()).orElseThrow();
    }

    @Override
    public void delete(LacoDTO lacoDTO) {
        lacoRepository.deleteById(lacoDTO.getId());
    }

    @Override
    public Laco update(LacoDTO lacoDTO) {
        Laco laco = findById(lacoDTO);
        BeanUtils.copyProperties(lacoDTO, laco);
        return lacoRepository.save(laco);
    }

    @Override
    public Laco findByPacienteId(Long id) {
        return lacoRepository.findByPacienteId(id).orElseThrow();
    }
}
