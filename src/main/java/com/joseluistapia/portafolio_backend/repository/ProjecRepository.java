package com.joseluistapia.portafolio_backend.repository;

import com.joseluistapia.portafolio_backend.model.Project;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjecRepository extends MongoRepository<Project, String> {

    List<Project> findByProfileId(String profileId);

}
