package com.projectmt.machine.repository;

import com.projectmt.machine.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jeferson
 */
public interface MessageRepository extends JpaRepository<Message, Long> {
    
}
