package com.tlk.br.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tlk.br.api.domain.entitites.Contrato;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Long> {

    // Optional<Contrato> findByPacienteId(Long id);

}
