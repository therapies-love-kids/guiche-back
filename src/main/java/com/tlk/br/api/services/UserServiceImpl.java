package com.tlk.br.api.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.tlk.br.api.domain.dtos.UserDTO;
import com.tlk.br.api.domain.entitites.User;
import com.tlk.br.api.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository UserRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.UserRepository = userRepository;
    }

    @Override
    public User save(UserDTO UserDTO) {
        User user = new User();
        BeanUtils.copyProperties(UserDTO, user);
        return UserRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public User findById(Long id) {
        return UserRepository.findById(id).orElseThrow();
    }

    @Override
    public User update(Long id, User UserDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        UserRepository.deleteById(id);
    }
    
}
