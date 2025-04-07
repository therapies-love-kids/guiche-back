package com.tlk.br.api.services.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.tlk.br.api.domain.dtos.UsuarioDTO;
import com.tlk.br.api.domain.entities.Usuario;
import com.tlk.br.api.repositories.UsuarioRepository;
import com.tlk.br.api.services.UsuarioService;

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
    public Usuario findByNome(String nome) {
        return UsuarioRepository.findByNome(nome);
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
        Usuario usuario = UsuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        usuario.setAtivo(true);
        UsuarioRepository.save(usuario);
    }

    @Override
    public void deactivateUser(Long id) {
        Usuario usuario = UsuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        usuario.setAtivo(false);
        UsuarioRepository.save(usuario);
    }

    @Override
    public String getProfileByUserName(String userName) {
        return UsuarioRepository.findByNome(userName).getPerfil();
    }
    
    @Override
    public boolean validateUserPassword(String nome, String senha) {
        Usuario usuario = UsuarioRepository.findByNome(nome);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            usuario.setOnline(true); // Define o usuário como online ao fazer login
            UsuarioRepository.save(usuario);
            return true;
        }
        return false;
    }

    public boolean checkAccess(String nome, String pageProfile) {
        Usuario usuario = UsuarioRepository.findByNome(nome);
        if (usuario == null || !usuario.isOnline()) {
            return false;
        }

        // Usuários com perfil "admin" podem acessar qualquer página
        if (usuario.getPerfil().equalsIgnoreCase("admin")) {
            usuario.setOnline(false); // Define como offline após verificação
            UsuarioRepository.save(usuario);
            return true;
        }

        // Páginas na pasta "everyone" são acessíveis por todos os perfis
        if (pageProfile.equalsIgnoreCase("everyone")) {
            usuario.setOnline(false); // Define como offline após verificação
            UsuarioRepository.save(usuario);
            return true;
        }

        // Verifica se o perfil do usuário corresponde ao nome da pasta da página
        boolean hasAccess = usuario.getPerfil().equalsIgnoreCase(pageProfile);
        if (hasAccess) {
            usuario.setOnline(false); // Define como offline após verificação
            UsuarioRepository.save(usuario);
        }
        return hasAccess;
    }
    public void setUserOnline(String nome) {
        Usuario usuario = UsuarioRepository.findByNome(nome);
        if (usuario != null) {
            usuario.setOnline(true);
            UsuarioRepository.save(usuario);
        }
    }

    public void setUserOffline(String nome) {
        Usuario usuario = UsuarioRepository.findByNome(nome);
        if (usuario != null) {
            usuario.setOnline(false);
            UsuarioRepository.save(usuario);
        }
    }
}
