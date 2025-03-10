package br.guiche.back.repositories;

import java.util.ArrayList;
import java.util.List;
import br.guiche.back.models.dtos.UserModel;

public class UserRepository {
    private List<UserModel> usuarios = new ArrayList<>();

    public void salvar(UserModel usuario) {
        usuarios.add(usuario);
    }

    public List<UserModel> listarTodos() {
        return usuarios;
    }

    public UserModel buscarPorUsuario(String usuario) {
        return usuarios.stream()
                .filter(u -> u.getUsuario().equals(usuario))
                .findFirst()
                .orElse(null);
    }
}
