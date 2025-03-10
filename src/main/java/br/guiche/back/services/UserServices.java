package br.guiche.back.services;

import br.guiche.back.models.dtos.UserModel;
import br.guiche.back.repositories.UserRepository;

import java.util.List;

public class UserServices {
    private final UserRepository userRepository = new UserRepository();

    public void cadastrarUsuario(String usuario, String senha) {
        UserModel user = new UserModel(usuario, senha);
        userRepository.salvar(user);
    }

    public List<UserModel> listarUsuarios() {
        return userRepository.listarTodos();
    }

    public UserModel buscarUsuario(String usuario) {
        return userRepository.buscarPorUsuario(usuario);
    }
}
