package com.projetoSpring.aula.repositories;

import com.projetoSpring.aula.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
