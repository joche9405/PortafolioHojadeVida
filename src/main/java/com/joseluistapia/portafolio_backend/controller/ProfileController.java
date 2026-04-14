package com.joseluistapia.portafolio_backend.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.joseluistapia.portafolio_backend.model.Profile;
import com.joseluistapia.portafolio_backend.service.ProfileService;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {
    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/{tipo}")
    public ResponseEntity<Profile> getProfile(@PathVariable String tipo) {
        Optional<Profile> profile = profileService.getByTipoPerfil(tipo);
        return profile.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Profile> saveProfile(@RequestBody Profile profile) {
        Profile savedProfile = profileService.save(profile);
        return ResponseEntity.ok(savedProfile);
    }

    @GetMapping
    public ResponseEntity<List<Profile>> getAll() {
        return ResponseEntity.ok(profileService.findAll());

    }

}