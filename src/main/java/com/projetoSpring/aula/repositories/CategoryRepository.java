package com.projetoSpring.aula.repositories;

import com.projetoSpring.aula.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
