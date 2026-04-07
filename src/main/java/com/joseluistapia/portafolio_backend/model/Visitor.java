package com.joseluistapia.portafolio_backend.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "visitors")
public class Visitor {
    @Id
    private String id;
    private String nombre;
    private String correo;
    private LocalDateTime fechaVisita;
    private String ip;
    private String userAgent;
}
