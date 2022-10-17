package com.projectmt.machine.controller;

import com.projectmt.machine.entity.Admin;
import com.projectmt.machine.entity.Machine;
import com.projectmt.machine.service.AdminService;
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
@RequestMapping("/Admin")
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/all")
    public List<Admin> getAdmin() {
        return adminService.getAdmin();
    }

    @PostMapping("/save")
    public ResponseEntity insertAdmin(@RequestBody Admin admin) {
        adminService.insertAdmin(admin);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable("id") Long id) {
        return adminService.getAdminById(id);
    }
}