package com.projectmt.machine.service;

import com.projectmt.machine.entity.User;
import com.projectmt.machine.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jeferson
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public List<User> getUser(){
        return userRepository.findAll();
    } 
   
    public User insertUser(User user){
        return userRepository.save(user);
    }
    
    //Metodo para consultar una registo x su id (Capa de servicios)
    public User getUserById(Integer id){
        return userRepository.findById(id).get();
    }
    
    //Metodo para eliminar (Capa de servicios)
    public void deleteUser(Integer id){
       userRepository.deleteById(id);               
    }
    
    //Metodo para actualizar (Capa de servicios)
    public User updateUser(User user){
        
        if (user.getId()!=null){
            Optional <User>opcional = userRepository.findById(user.getId());

            if (!opcional.isEmpty()){
                User userDB = opcional.get();

                userDB.setName(user.getName());

                return userRepository.save(userDB);
            }else{
                return user;
            }
        }else{
            return user;
        }
    }
}
