package com.tlk.br.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tlk.br.api.domain.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
