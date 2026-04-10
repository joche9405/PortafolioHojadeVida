package com.joseluistapia.portafolio_backend.service;

import com.joseluistapia.portafolio_backend.repository.VisitorRepository;
import com.joseluistapia.portafolio_backend.dto.VisitorDTO;
import com.joseluistapia.portafolio_backend.model.Visitor;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VisitorServiceImpl implements VisitorService {

    private final VisitorRepository visitorRepository;

    public VisitorServiceImpl(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    @Override
    public Visitor saveVisitor(VisitorDTO dto, String ip, String userAgent) {
        Visitor visitor = new Visitor();

        visitor.setNombre(dto.getNombre());
        visitor.setCorreo(dto.getCorreo());
        visitor.setFechaVisita(LocalDateTime.now());
        visitor.setIp(ip);
        visitor.setUserAgent(userAgent);

        return visitorRepository.save(visitor);
    }

    public long countVisitors() {
        return visitorRepository.count();
    }

    public List<Visitor> getAllVisitors() {
        return visitorRepository.findAll();
    }
}
