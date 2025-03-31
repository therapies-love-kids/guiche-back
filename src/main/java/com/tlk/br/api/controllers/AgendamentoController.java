package com.tlk.br.api.controllers;

import com.tlk.br.api.domain.entitites.Agendamento;
import com.tlk.br.api.domain.dtos.AgendamentoDTO;
import com.tlk.br.api.domain.dtos.StatusUpdateDTO;
import com.tlk.br.api.services.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<Agendamento> createAgendamento(@RequestBody Agendamento agendamento) {
        if (agendamento.getEspecialistaColaboradorId() == null) {
            return ResponseEntity.badRequest().body(null);
        }
        Agendamento savedAgendamento = agendamentoService.save(agendamento);
        return ResponseEntity.ok(savedAgendamento);
    }

    @GetMapping("/current")
    public ResponseEntity<List<AgendamentoDTO>> getCurrentAgendamentos() {
        List<AgendamentoDTO> current = agendamentoService.getCurrentAgendamentos();
        if (current.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(current);
    }

    @GetMapping("/previous")
    public ResponseEntity<List<AgendamentoDTO>> getPreviousAgendamentos() {
        List<AgendamentoDTO> previous = agendamentoService.getPreviousAgendamentos();
        return ResponseEntity.ok(previous);
    }

    @GetMapping("/waiting")
    public ResponseEntity<List<Agendamento>> getWaitingAgendamentos() {
        List<Agendamento> waiting = agendamentoService.getWaitingAgendamentos();
        if (waiting.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(waiting);
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<Agendamento> updateStatus(@PathVariable Long id, @RequestBody StatusUpdateDTO statusUpdate) {
        if (id == null || id <= 0) {
            return ResponseEntity.badRequest().body(null);
        }
        Agendamento updatedAgendamento = agendamentoService.updateStatus(id, statusUpdate.getStatus());
        return ResponseEntity.ok(updatedAgendamento);
    }
}