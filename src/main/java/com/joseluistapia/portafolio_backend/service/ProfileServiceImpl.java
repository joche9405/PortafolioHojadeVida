package com.joseluistapia.portafolio_backend.service;

import org.springframework.stereotype.Service;
import com.joseluistapia.portafolio_backend.model.Profile;
import com.joseluistapia.portafolio_backend.repository.profileRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService {

    private final profileRepository profileRepository;

    public ProfileServiceImpl(profileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public Optional<Profile> getByTipoPerfil(String tipoPerfil) {
        return profileRepository.findByTipoPerfil(tipoPerfil);
    }

    @Override
    public Profile save(Profile profile) {
        return profileRepository.findByTipoPerfil(profile.getTipoPerfil())
                .map(existingProfile -> {

                    profile.setId(existingProfile.getId());
                    return profileRepository.save(profile);
                })
                .orElseGet(() -> {
                    return profileRepository.save(profile);
                });
    }

    @Override
    public List<Profile> findAll() {
        return profileRepository.findAll();
    }
}