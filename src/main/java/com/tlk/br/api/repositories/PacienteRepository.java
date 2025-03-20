package com.tlk.br.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tlk.br.api.domain.entitites.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
