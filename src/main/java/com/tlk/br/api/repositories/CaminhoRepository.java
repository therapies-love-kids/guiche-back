package com.tlk.br.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tlk.br.api.domain.entitites.Caminho;

@Repository 
public interface CaminhoRepository extends JpaRepository<Caminho, Long> {

}
