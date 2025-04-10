package com.tlk.br.api.repositories;

import com.tlk.br.api.domain.entities.Convenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvenioRepository extends JpaRepository<Convenio, Integer> {
}