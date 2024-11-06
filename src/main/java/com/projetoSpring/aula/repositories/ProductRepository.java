package com.projetoSpring.aula.repositories;

import com.projetoSpring.aula.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
