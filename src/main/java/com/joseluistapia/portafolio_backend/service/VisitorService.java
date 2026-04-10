package com.joseluistapia.portafolio_backend.service;

import com.joseluistapia.portafolio_backend.model.Visitor;

import java.util.List;

import com.joseluistapia.portafolio_backend.dto.VisitorDTO;

public interface VisitorService {

    Visitor saveVisitor(VisitorDTO dto, String ip, String userAgent);

    long countVisitors();

    List<Visitor> getAllVisitors();
}
