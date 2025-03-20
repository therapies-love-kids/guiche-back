package com.tlk.br.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tlk.br.api.domain.entitites.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}
