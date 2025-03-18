package com.tlk.br.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tlk.br.api.domain.entitites.Colaborador;

@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {

    Colaborador findByEmail(String email);

    Colaborador findByCpf(String cpf);
}