package com.tlk.br.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tlk.br.api.domain.entitites.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean validateUserPassword(Long id, String password);

    void activateUser(Long id);

    void deactivateUser(Long id);

}