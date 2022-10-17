package com.projectmt.machine.service;

import com.projectmt.machine.entity.Machine;
import com.projectmt.machine.repository.MachineRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Jeferson
 */
@Service
public class MachineService {
    @Autowired
    private MachineRepository machineRepository;

    public List<Machine> getMachineList(){
        return machineRepository.findAll();
    }
    
    public Machine getMachineById(Long id){
        return machineRepository.findById(id).get();
    }
    
    public Machine insertMachine(Machine machine){
        return machineRepository.save(machine);
    }
    
    public void deleteMachine(Long id){
        machineRepository.deleteById(id);
    }

    public Machine updateMachine(Machine machine) {
        //machine exists?
        if (machine.getId()!=null){
            //validation of machine
            Optional<Machine> option=machineRepository.findById(machine.getId());
            
            //machine doesn´t exist
            if (option.isEmpty()) return machine;
            // if machine exists
            else{
                Machine machineDB = option.get();
                
                machineDB.setBrand(machine.getBrand());
                machineDB.setYear(machine.getYear());
                machineDB.setCategory(machine.getCategory());
                machineDB.setName(machine.getName());
                machineDB.setDescription(machine.getDescription());
                machineRepository.save(machineDB);
            }
        }
        return machine;
    }
        
}
