package com.tlk.br.api.services.impl;

import com.tlk.br.api.domain.dtos.PacienteDTO;
import com.tlk.br.api.domain.entities.Paciente;
import com.tlk.br.api.repositories.PacienteRepository;
import com.tlk.br.api.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public Paciente save(PacienteDTO pacienteDTO) {
        Paciente paciente = new Paciente();
        paciente.setEmpresaUnidadePrefixo(pacienteDTO.getEmpresaUnidadePrefixo());
        paciente.setConvenioPk(pacienteDTO.getConvenioPk());
        paciente.setCodigo(pacienteDTO.getCodigo());
        paciente.setAtivo(pacienteDTO.isAtivo());
        paciente.setNome(pacienteDTO.getNome());
        paciente.setNomeCurto(pacienteDTO.getNomeCurto());
        paciente.setSexo(pacienteDTO.getSexo());
        paciente.setDataNascimento(pacienteDTO.getDataNascimento());
        paciente.setLocalNascimento(pacienteDTO.getLocalNascimento());
        paciente.setCertidaoNascimento(pacienteDTO.getCertidaoNascimento());
        paciente.setCpf(pacienteDTO.getCpf());
        paciente.setNumeroConvenio(pacienteDTO.getNumeroConvenio());
        paciente.setObservacoes(pacienteDTO.getObservacoes());

        // O pk e o id serão preenchidos automaticamente pelo banco
        Paciente savedPaciente = pacienteRepository.save(paciente);

        // Atualizar o DTO com o pk gerado
        pacienteDTO.setPk(savedPaciente.getPk());

        return savedPaciente;
    }

    @Override
    public PacienteDTO findById(Long pk) {
        Paciente paciente = pacienteRepository.findById(pk)
            .orElse(null);
        if (paciente == null) {
            return null;
        }

        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setPk(paciente.getPk());
        pacienteDTO.setEmpresaUnidadePrefixo(paciente.getEmpresaUnidadePrefixo());
        pacienteDTO.setConvenioPk(paciente.getConvenioPk());
        pacienteDTO.setCodigo(paciente.getCodigo());
        pacienteDTO.setAtivo(paciente.isAtivo());
        pacienteDTO.setNome(paciente.getNome());
        pacienteDTO.setNomeCurto(paciente.getNomeCurto());
        pacienteDTO.setSexo(paciente.getSexo());
        pacienteDTO.setDataNascimento(paciente.getDataNascimento());
        pacienteDTO.setLocalNascimento(paciente.getLocalNascimento());
        pacienteDTO.setCertidaoNascimento(paciente.getCertidaoNascimento());
        pacienteDTO.setCpf(paciente.getCpf());
        pacienteDTO.setNumeroConvenio(paciente.getNumeroConvenio());
        pacienteDTO.setObservacoes(paciente.getObservacoes());

        return pacienteDTO;
    }

    @Override
    public Paciente update(PacienteDTO pacienteDTO) {
        if (pacienteDTO.getPk() == null) {
            return null; // Ou lance uma exceção
        }

        Paciente paciente = pacienteRepository.findById(pacienteDTO.getPk())
            .orElse(null);
        if (paciente == null) {
            return null;
        }

        paciente.setEmpresaUnidadePrefixo(pacienteDTO.getEmpresaUnidadePrefixo());
        paciente.setConvenioPk(pacienteDTO.getConvenioPk());
        paciente.setCodigo(pacienteDTO.getCodigo());
        paciente.setAtivo(pacienteDTO.isAtivo());
        paciente.setNome(pacienteDTO.getNome());
        paciente.setNomeCurto(pacienteDTO.getNomeCurto());
        paciente.setSexo(pacienteDTO.getSexo());
        paciente.setDataNascimento(pacienteDTO.getDataNascimento());
        paciente.setLocalNascimento(pacienteDTO.getLocalNascimento());
        paciente.setCertidaoNascimento(pacienteDTO.getCertidaoNascimento());
        paciente.setCpf(pacienteDTO.getCpf());
        paciente.setNumeroConvenio(pacienteDTO.getNumeroConvenio());
        paciente.setObservacoes(pacienteDTO.getObservacoes());

        return pacienteRepository.save(paciente);
    }

    @Override
    public boolean delete(Long pk) {
        if (!pacienteRepository.existsById(pk)) {
            return false;
        }
        pacienteRepository.deleteById(pk);
        return true;
    }
}