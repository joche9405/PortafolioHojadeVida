package com.joseluistapia.portafolio_backend.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    private String empresa;
    private String cargo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
}
