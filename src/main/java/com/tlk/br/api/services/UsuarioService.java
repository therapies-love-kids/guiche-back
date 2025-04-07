package com.tlk.br.api.services;

import java.util.List;

import com.tlk.br.api.domain.dtos.UsuarioDTO;
import com.tlk.br.api.domain.entities.Usuario;

public interface UsuarioService {

    boolean validateUserPassword(String nome, String password);
    Usuario save(UsuarioDTO usuarioDTO);
    List<Usuario> findAll();
    Usuario findById(Long id);
    Usuario update(Long id,UsuarioDTO usuarioDTO);
    void delete(Long id);
    void activateUser(Long id);
    void deactivateUser(Long id);
    String getProfileByUserName(String username);
    boolean checkAccess(String nome, String pageProfile);
    void setUserOnline(String nome);
    void setUserOffline(String nome);
    Usuario findByNome(String nome);
}
