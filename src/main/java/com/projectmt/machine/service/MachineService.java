package com.projectmt.machine.service;

import com.projectmt.machine.entity.Machine;
import com.projectmt.machine.repository.MachineRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    
    public Machine saveMachine(Machine machine){
        return machineRepository.save(machine);
    }
    
    public void deleteMachine(Long id){
        machineRepository.deleteById(id);
    }

    public Machine updateMachine(Machine machine){
        //machine exists?
        if(machine.getId()!= null){
            //validation of machine
            Optional<Machine> option = machineRepository.findById(machine.getId());
            
            //machine doesn´t exist
            if (option.isEmpty()) return machine;
            // if machine exists
            else{
                Machine machineDB = option.get();
                
                if (machine.getBrand()!=null) machineDB.setBrand(machine.getBrand());
                if (machine.getYear()!=null) machineDB.setYear(machine.getYear());
                if (machine.getCategory()!=null) machineDB.setCategory(machine.getCategory());
                if (machine.getName()!=null) machineDB.setName(machine.getName());
                if (machine.getDescription()!=null) machineDB.setDescription(machine.getDescription());
                return machineRepository.save(machineDB);
            }
        }
        return machine;
    }
        
}
