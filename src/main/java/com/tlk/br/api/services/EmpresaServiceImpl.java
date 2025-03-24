package com.tlk.br.api.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.tlk.br.api.domain.dtos.EmpresaDTO;
import com.tlk.br.api.domain.entitites.Empresa;
import com.tlk.br.api.repositories.EmpresaRepository;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    private final EmpresaRepository empresaRepository;

    public EmpresaServiceImpl(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    @Override
    public Empresa findById(Long id) {
        return empresaRepository.findById(id).orElseThrow();
    }

    @Override
    public Empresa save(EmpresaDTO empresaDTO) {
        Empresa empresa = new Empresa();
        BeanUtils.copyProperties(empresaDTO, empresa);
        return empresaRepository.save(empresa);
    }

    @Override
    public Empresa update(EmpresaDTO empresaDTO) {
        Empresa empresa = findById(empresaDTO.getId());
        BeanUtils.copyProperties(empresaDTO, empresa);
        return empresaRepository.save(empresa);
    }

    @Override
    public void delete(Long id) {
        empresaRepository.deleteById(id);
    }

    @Override
    public Empresa findByCnpj(String cnpj) {
        return empresaRepository.findByCnpj(cnpj).orElseThrow();
    }

    @Override
    public Empresa findByRazaoSocial(String razaoSocial) {
        return empresaRepository.findByRazaoSocial(razaoSocial).orElseThrow();
    }

    @Override
    public Empresa findByNomeFantasia(String nomeFantasia) {
        return empresaRepository.findByNomeFantasia(nomeFantasia).orElseThrow();
    }

    @Override
    public Empresa findByEmail(String email) {
        return empresaRepository.findByEmail(email).orElseThrow();
    }

    @Override
    public Empresa findByTelefone(String telefone) {
        return empresaRepository.findByTelefone(telefone).orElseThrow();
    }

    @Override
    public Empresa findByCep(String cep) {
        return empresaRepository.findByCep(cep).orElseThrow();
    }

    @Override
    public Empresa findByCidade(String cidade) {
        return empresaRepository.findByCidade(cidade).orElseThrow();
    }
}
