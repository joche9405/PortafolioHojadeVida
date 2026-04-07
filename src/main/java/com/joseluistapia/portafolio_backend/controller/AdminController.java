package com.joseluistapia.portafolio_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.security.core.Authentication;

import com.joseluistapia.portafolio_backend.dto.LoginRequest;
import com.joseluistapia.portafolio_backend.service.AdminService;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin("*")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        String token = adminService.login(request.getUsername(), request.getPassword());
        return ResponseEntity.ok(token);
    }

    @PutMapping("/change-password")
    public ResponseEntity<String> changePassword(
            Authentication auth,
            @RequestParam String oldPassword,
            @RequestParam String newPassword) {

        adminService.changePassword(auth.getName(), oldPassword, newPassword);

        return ResponseEntity.ok("Contraseña actualizada");
    }
}