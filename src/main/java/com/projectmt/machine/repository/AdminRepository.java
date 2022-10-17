package com.projectmt.machine.repository;

import com.projectmt.machine.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jeferson
 */
public interface AdminRepository extends JpaRepository<Admin, Long> {
    
}
