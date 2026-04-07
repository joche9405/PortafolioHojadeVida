package com.joseluistapia.portafolio_backend.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;


@Data
@Document(collection = "profiles")
public class Profile {
    @Id
    private String id;
    private String tipoPerfil;
    private String nombre;
    private String apellidos;
    private String fotoUrl;
    private String direccion;
    private String resumen;
    private List<String> skills;

    private List<Education> educacion;
    private List<Experience> experiencia;
}
