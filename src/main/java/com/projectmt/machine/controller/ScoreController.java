package com.projectmt.machine.controller;

import com.projectmt.machine.entity.Score;
import com.projectmt.machine.entity.Machine;
import com.projectmt.machine.service.ScoreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jeferson
 */
@RestController
@RequestMapping("/Score")
@CrossOrigin(origins = "*")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/all")
    public List<Score> getScore() {
        return scoreService.getScore();
    }

    @PostMapping("/save")
    public ResponseEntity insertScore(@RequestBody Score score) {
        scoreService.insertScore(score);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/{id}")
    public Score getScoreById(@PathVariable("id") Long id) {
        return scoreService.getScoreById(id);
    }
}