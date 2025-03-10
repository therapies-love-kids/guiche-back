package br.guiche.back.controllers;

import org.springframework.web.bind.annotation.*;
import br.guiche.back.models.dtos.UserModel;
import br.guiche.back.services.UserServices;
import br.guiche.back.mappers.UserMappers;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserServices userServices = new UserServices();

    @PostMapping
    public void cadastrarUsuario(@RequestParam("usuario") String usuario, @RequestParam("senha") String senha) {
        userServices.cadastrarUsuario(usuario, senha);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    @GetMapping
    public void listarUsuarios() {
        List<UserModel> usuarios = userServices.listarUsuarios();
        usuarios.forEach(user -> System.out.println(UserMappers.toDTO(user)));
    }

    public void buscarUsuario(String usuario) {
        UserModel user = userServices.buscarUsuario(usuario);
        if (user != null) {
            System.out.println(UserMappers.toDTO(user));
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}
