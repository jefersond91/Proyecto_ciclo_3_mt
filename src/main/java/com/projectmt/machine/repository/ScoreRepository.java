package com.projectmt.machine.repository;

import com.projectmt.machine.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jeferson
 */
public interface ScoreRepository extends JpaRepository<Score, Long> {
    
}
