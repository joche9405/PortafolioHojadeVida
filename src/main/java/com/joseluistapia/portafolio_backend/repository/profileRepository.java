package com.joseluistapia.portafolio_backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

import com.joseluistapia.portafolio_backend.model.Profile;

public interface profileRepository extends MongoRepository<Profile, String> {
    Optional<Profile> findByTipoPerfil(String tipoPerfil);

    List<Profile> findAll();
}
