package br.guiche.back.mappers;

import br.guiche.back.models.dtos.UserModel;

public class UserMappers {
    public static String toDTO(UserModel user) {
        return "Usuário: " + user.getUsuario() + ", Senha: " + user.getSenha();
    }
}
