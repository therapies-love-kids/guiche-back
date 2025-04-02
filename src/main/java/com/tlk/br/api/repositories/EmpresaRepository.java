package com.tlk.br.api.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tlk.br.api.domain.entities.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    Optional<Empresa> findByCnpj(String cnpj);

    Optional<Empresa> findByRazaoSocial(String razaoSocial);

    List<Empresa> findByNomeFantasia(String nomeFantasia);

    // Optional<Empresa> findByEmail(String email);

    Optional<Empresa> findByNumero(String numero);

    Optional<Empresa> findByCep(String cep);

    Optional<Empresa> findByCidade(String cidade);

}
