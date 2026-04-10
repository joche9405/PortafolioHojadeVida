package com.joseluistapia.portafolio_backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joseluistapia.portafolio_backend.dto.VisitorDTO;
import com.joseluistapia.portafolio_backend.model.Visitor;
import com.joseluistapia.portafolio_backend.service.VisitorService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/visitors")
@CrossOrigin(origins = "*")
public class VisitorController {

  private final VisitorService visitorService;

  public VisitorController(VisitorService visitorService) {
    this.visitorService = visitorService;
  }

  @PostMapping
  public ResponseEntity<Visitor> saveVisitor(
      @RequestBody VisitorDTO dto,
      HttpServletRequest request) {
    String ip = request.getRemoteAddr();
    String userAgent = request.getHeader("User-Agent");

    Visitor saved = visitorService.saveVisitor(dto, ip, userAgent);
    return ResponseEntity.ok(saved);
  }

  @GetMapping("/count")
  public ResponseEntity<Long> countVisitors() {
    return ResponseEntity.ok(visitorService.countVisitors());
  }

  @GetMapping
  public ResponseEntity<List<Visitor>> getAllVisitors() {
    return ResponseEntity.ok(visitorService.getAllVisitors());
  }

}
