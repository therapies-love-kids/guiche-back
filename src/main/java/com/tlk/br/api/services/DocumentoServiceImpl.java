package com.tlk.br.api.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.tlk.br.api.domain.dtos.DocumentoDTO;
import com.tlk.br.api.domain.entitites.Documento;
import com.tlk.br.api.repositories.DocumentoRepository;

@Service
public class DocumentoServiceImpl implements DocumentoService {

    private final DocumentoRepository documentoRepository;

    public DocumentoServiceImpl(DocumentoRepository documentoRepository) {
        this.documentoRepository = documentoRepository;
    }

    @Override
    public Documento save(DocumentoDTO documentoDTO) {
        Documento documento = new Documento();
        BeanUtils.copyProperties(documentoDTO, documento);
        return documentoRepository.save(documento);
    }

    @Override
    public Documento update(DocumentoDTO documentoDTO) {
        Documento documento = findById(documentoDTO.getId());
        BeanUtils.copyProperties(documentoDTO, documento);
        return documentoRepository.save(documento);
    }

    @Override
    public Documento findById(Long id) {
        return documentoRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(DocumentoDTO documentoDTO) {
        documentoRepository.deleteById(documentoDTO.getId());
    }

    @Override
    public Documento findByPacienteId(Long id) {
        return documentoRepository.findById(id).orElseThrow();
    }
}
