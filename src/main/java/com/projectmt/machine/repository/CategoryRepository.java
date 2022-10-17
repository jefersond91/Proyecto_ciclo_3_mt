package com.projectmt.machine.repository;

import com.projectmt.machine.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jeferson
 */
public interface CategoryRepository extends JpaRepository<Category,Long>{
    
}
