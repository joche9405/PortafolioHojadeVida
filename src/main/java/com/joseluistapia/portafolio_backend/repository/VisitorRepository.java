package com.joseluistapia.portafolio_backend.repository;

import com.joseluistapia.portafolio_backend.model.Visitor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VisitorRepository extends MongoRepository<Visitor, String> {

    long countByCorreoIsNotNull();
}
