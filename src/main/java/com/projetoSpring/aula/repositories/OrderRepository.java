package com.projetoSpring.aula.repositories;

import com.projetoSpring.aula.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
