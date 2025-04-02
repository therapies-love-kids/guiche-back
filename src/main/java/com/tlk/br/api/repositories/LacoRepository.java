package com.tlk.br.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tlk.br.api.domain.entities.Laco;

@Repository
public interface LacoRepository extends JpaRepository<Laco, Long> {

    Optional<Laco> findByPacienteId(Long id);

}
