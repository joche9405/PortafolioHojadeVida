package com.joseluistapia.portafolio_backend.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joseluistapia.portafolio_backend.model.Admin;

public interface AdminRepository extends MongoRepository<Admin, String> {

    Optional<Admin> findByUsername(String username);

}
