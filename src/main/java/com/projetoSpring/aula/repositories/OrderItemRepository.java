package com.projetoSpring.aula.repositories;

import com.projetoSpring.aula.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
