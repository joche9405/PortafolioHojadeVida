package com.joseluistapia.portafolio_backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "projects")
public class Project {
    @Id
    private String id;
    private String profileId;
    private String nombre;
    private String descripcion;
    private String url;

}
