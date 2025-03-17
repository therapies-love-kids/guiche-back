package com.tlk.br.api.services;

import com.tlk.br.api.domain.entitites.User;
import com.tlk.br.api.domain.dtos.UserDTO;

import java.util.*;

public interface UserService {
    User save(UserDTO userDTO);
    List<User> findAll();
    User findById(Long id);
    User update(Long id,UserDTO userDTO);
    void delete(Long id);
}
