package com.projectmt.machine.repository;

import com.projectmt.machine.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jeferson
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    
}