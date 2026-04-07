package com.joseluistapia.portafolio_backend.dto;

import java.util.List;

import com.joseluistapia.portafolio_backend.model.Education;
import com.joseluistapia.portafolio_backend.model.Experience;
import lombok.Data;

@Data
public class ProfileDTO {
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
