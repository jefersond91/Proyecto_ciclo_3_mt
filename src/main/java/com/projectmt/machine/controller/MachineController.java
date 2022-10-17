package com.projectmt.machine.controller;

import com.projectmt.machine.entity.Machine;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projectmt.machine.repository.MachineRepository;
import com.projectmt.machine.service.MachineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
/**
 *
 * @author Jeferson
 */

@RestController
@RequestMapping("/Machine")
public class MachineController {
    @Autowired
    private MachineService machineService;
    
    @GetMapping("/all")
    public List<Machine> getMachineList(){
        return machineService.getMachineList();
    }
    
    @GetMapping("/{id}")
    public Machine getMachineById(@PathVariable("id") Long id){
        return machineService.getMachineById(id);           
    }
    
    @PostMapping("/save")
    public ResponseEntity insertMachine(@RequestBody Machine machine){
        machineService.insertMachine(machine);
        return ResponseEntity.status(201).build();
    }
    
    @PutMapping("/update")
    public ResponseEntity updateMachine(@RequestBody Machine machine){
        machineService.updateMachine(machine);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteMachine(@PathVariable("id") Long id){
        machineService.deleteMachine(id); 
        return ResponseEntity.status(204).build(); 
    }
}