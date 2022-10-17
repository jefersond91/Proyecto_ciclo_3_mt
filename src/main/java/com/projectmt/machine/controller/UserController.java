package com.projectmt.machine.controller;

import com.projectmt.machine.entity.User;
import com.projectmt.machine.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jeferson
 */
@RestController
@RequestMapping("/User")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all")
    public List<User> getUser(){
        return userService.getUser();
    }
    
    @PostMapping("/save")
    public ResponseEntity insertUser(@RequestBody User user){
       userService.insertUser(user);
       return ResponseEntity.status(201).build();
    }
    
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }
    
    //Metodo para eliminar (Capa de controlador)
    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable("id") Integer id){
       userService.deleteUser(id);
       return ResponseEntity.status(204).build();
    }
    
    //Metodo para actualizar (Capa de controlador)
    @PutMapping("/update")
    public ResponseEntity updateUser(@RequestBody User category){
       userService.updateUser(category);
       return ResponseEntity.status(201).build(); 
    }
    
}
