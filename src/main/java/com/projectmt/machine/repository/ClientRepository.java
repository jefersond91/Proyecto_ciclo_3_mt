package com.projectmt.machine.repository;

import com.projectmt.machine.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jeferson
 */
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
