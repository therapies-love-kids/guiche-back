package com.tlk.br.api.controllers;

import com.tlk.br.api.domain.dtos.PacienteDTO;
import com.tlk.br.api.domain.entities.Paciente;
import com.tlk.br.api.services.PacienteService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
@Tag(name = "Paciente", description = "Paciente")
@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class PacienteController {

    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @PostMapping
    public ResponseEntity<PacienteDTO> save(@Valid @RequestBody PacienteDTO pacienteDTO) {
        Paciente savedPaciente = pacienteService.save(pacienteDTO);
        return ResponseEntity.status(201).body(pacienteDTO); // 201 Created
    }

    @GetMapping("/{pk}")
    public ResponseEntity<PacienteDTO> findById(@PathVariable Long pk) {
        PacienteDTO pacienteDTO = pacienteService.findById(pk);
        if (pacienteDTO == null) {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
        return ResponseEntity.ok(pacienteDTO); // 200 OK
    }

    @PutMapping
    public ResponseEntity<PacienteDTO> update(@Valid @RequestBody PacienteDTO pacienteDTO) {
        Paciente updatedPaciente = pacienteService.update(pacienteDTO);
        if (updatedPaciente == null) {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
        return ResponseEntity.ok(pacienteDTO); // 200 OK
    }

    @DeleteMapping("/{pk}")
    public ResponseEntity<Void> delete(@PathVariable Long pk) {
        boolean deleted = pacienteService.delete(pk);
        if (!deleted) {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
        return ResponseEntity.noContent().build(); // 204 No Content
    }
}