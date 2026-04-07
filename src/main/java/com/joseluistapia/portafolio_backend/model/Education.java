package com.joseluistapia.portafolio_backend.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Education {
    private String titulo;
    private String institucion;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
}
