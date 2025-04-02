package com.tlk.br.api.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.tlk.br.api.domain.dtos.CaminhoDTO;
import com.tlk.br.api.domain.entities.Caminho;
import com.tlk.br.api.repositories.CaminhoRepository;
import com.tlk.br.api.services.CaminhoService;

@Service
public class CaminhoServiceImpl implements CaminhoService {

    private final CaminhoRepository caminhoRepository;

    public CaminhoServiceImpl(CaminhoRepository caminhoRepository) {
        this.caminhoRepository = caminhoRepository;
    }

    @Override
    public Caminho save(CaminhoDTO caminhoDTO) {
        Caminho caminho = new Caminho();
        BeanUtils.copyProperties(caminhoDTO, caminho);
        return caminhoRepository.save(caminho);
    }

    @Override
    public Caminho update(CaminhoDTO caminhoDTO) {
        Caminho caminho = findById(caminhoDTO.getId());
        BeanUtils.copyProperties(caminhoDTO, caminho);
        return caminhoRepository.save(caminho);
    }

    @Override
    public Caminho findById(Long id) {
        return caminhoRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        caminhoRepository.deleteById(id);
    }
}
