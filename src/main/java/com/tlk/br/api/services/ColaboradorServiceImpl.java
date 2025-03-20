package com.tlk.br.api.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.tlk.br.api.domain.dtos.ColaboradorDTO;
import com.tlk.br.api.domain.entitites.Colaborador;
import com.tlk.br.api.repositories.ColaboradorRepository;

@Service
public class ColaboradorServiceImpl implements ColaboradorService {

    private final ColaboradorRepository colaboradorRepository;

    public ColaboradorServiceImpl(ColaboradorRepository colaboradorRepository) {
        this.colaboradorRepository = colaboradorRepository;
    }

    @Override
    public List<Colaborador> findAll() {
        return colaboradorRepository.findAll();
    }

    @Override
    public Colaborador save(ColaboradorDTO colaboradorDTO) {
        Colaborador colaborador = new Colaborador();
        BeanUtils.copyProperties(colaboradorDTO, colaborador);
        return colaboradorRepository.save(colaborador);
    }

    @Override
    public Colaborador findById(Long id) {
        return colaboradorRepository.findById(id).orElseThrow();
    }

    @Override
    public Colaborador update(Long id, ColaboradorDTO colaboradorDTO) {
        Colaborador colaborador = findById(id);
        BeanUtils.copyProperties(colaboradorDTO, colaborador);
        return colaboradorRepository.save(colaborador);
    }

    @Override
    public void delete(Long id) {
        colaboradorRepository.deleteById(id);
    }

    @Override
    public Colaborador findByEmail(String email) {
        return colaboradorRepository.findByEmail(email);
    }

    @Override
    public Colaborador findByCpf(String cpf) {
        return colaboradorRepository.findByCpf(cpf);
    }
}
