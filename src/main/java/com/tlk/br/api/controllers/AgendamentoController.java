package com.tlk.br.api.controllers;

import com.tlk.br.api.domain.entitites.Agendamento;
import com.tlk.br.api.domain.dtos.AgendamentoDTO;
import com.tlk.br.api.domain.dtos.StatusUpdateDTO;
import com.tlk.br.api.services.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
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
    public ResponseEntity<List<AgendamentoDTO>> getCurrentAgendamentos(
            @RequestParam("colaboradorId") Long especialistaColaboradorId) {
        List<AgendamentoDTO> current = agendamentoService.getCurrentAgendamentos(especialistaColaboradorId);
        if (current.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(current);
    }

    @GetMapping("/previous")
    public ResponseEntity<List<AgendamentoDTO>> getPreviousAgendamentos(
            @RequestParam("colaboradorId") Long especialistaColaboradorId) {
        List<AgendamentoDTO> previous = agendamentoService.getPreviousAgendamentos(especialistaColaboradorId);
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

    @GetMapping("/by-date-and-colaborador")
    public ResponseEntity<List<AgendamentoDTO>> getAgendamentosByDateAndColaborador(
            @RequestParam("colaboradorId") Long colaboradorId,
            @RequestParam("data") String data) {
        try {
            // Converte a string de data (ex: "2025-03-31") para Timestamp
            Timestamp timestamp = Timestamp.valueOf(data + " 00:00:00");
            List<AgendamentoDTO> agendamentos = agendamentoService.getAgendamentosByDateAndColaborador(colaboradorId, timestamp);
            if (agendamentos.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(agendamentos);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }
}