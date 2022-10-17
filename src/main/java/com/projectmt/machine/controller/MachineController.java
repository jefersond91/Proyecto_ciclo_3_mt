package com.projectmt.machine.controller;

import com.projectmt.machine.entity.Machine;
import com.projectmt.machine.service.MachineService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Jeferson
 */

@RestController
@RequestMapping("/Machine")
@CrossOrigin(origins = "*")
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
    public ResponseEntity saveMachine(@RequestBody Machine machine){
        machineService.saveMachine(machine);
        return ResponseEntity.status(201).build();
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Machine updateMachine(@RequestBody Machine machine){
        return machineService.updateMachine(machine);
//        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity deleteMachine(@PathVariable("id") Long id){
        machineService.deleteMachine(id); 
        return ResponseEntity.status(204).build(); 
    }
}