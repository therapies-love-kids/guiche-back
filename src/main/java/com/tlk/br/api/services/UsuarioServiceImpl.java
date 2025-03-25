package com.tlk.br.api.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.tlk.br.api.domain.dtos.UsuarioDTO;
import com.tlk.br.api.domain.entitites.Usuario;
import com.tlk.br.api.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository UsuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository UsuarioRepository) {
        this.UsuarioRepository = UsuarioRepository;
    }

    @Override
    public List<Usuario> findAll() {
        return UsuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return UsuarioRepository.findById(id).orElseThrow();
    }

    @Override
    public Usuario save(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        BeanUtils.copyProperties(usuarioDTO, usuario);
        return UsuarioRepository.save(usuario);
    }

    @Override
    public Usuario update(Long id, UsuarioDTO usuarioDTO) {
        Usuario usuario = findById(id);
        BeanUtils.copyProperties(usuarioDTO, usuario);
        return UsuarioRepository.save(usuario);
    }

    @Override
    public void delete(Long id) {
        UsuarioRepository.deleteById(id);
    }

    @Override
    public void activateUser(Long id) {
        UsuarioRepository.activateUser(id);
    }

    @Override
    public void deactivateUser(Long id) {
        UsuarioRepository.deactivateUser(id);
    }

    @Override
    public boolean validateUserPassword(Long id, String password) {
        Usuario usuario = findById(id);
        return usuario.getSenha().equals(password);
    }
}
