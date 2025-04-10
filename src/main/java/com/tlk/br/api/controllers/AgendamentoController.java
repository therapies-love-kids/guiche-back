package com.tlk.br.api.controllers;

import com.tlk.br.api.domain.dtos.AgendamentoDTO;
import com.tlk.br.api.domain.entities.Agendamento;
import com.tlk.br.api.services.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @GetMapping("/current/{especialistaColaboradorId}")
    public ResponseEntity<List<AgendamentoDTO>> getCurrentAgendamentos(@PathVariable Long especialistaColaboradorId) {
        return ResponseEntity.ok(agendamentoService.getCurrentAgendamentos(especialistaColaboradorId));
    }

    @GetMapping("/previous/{especialistaColaboradorId}")
    public ResponseEntity<List<AgendamentoDTO>> getPreviousAgendamentos(@PathVariable Long especialistaColaboradorId) {
        return ResponseEntity.ok(agendamentoService.getPreviousAgendamentos(especialistaColaboradorId));
    }

    @GetMapping("/waiting")
    public ResponseEntity<List<Agendamento>> getWaitingAgendamentos() {
        return ResponseEntity.ok(agendamentoService.getWaitingAgendamentos());
    }

    @PostMapping
    public ResponseEntity<Agendamento> save(@RequestBody Agendamento agendamento) {
        return ResponseEntity.ok(agendamentoService.save(agendamento));
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<Agendamento> updateStatus(@PathVariable Long id, @RequestParam String status) {
        return ResponseEntity.ok(agendamentoService.updateStatus(id, status));
    }

    @PutMapping("/{id}/details")
    public ResponseEntity<Agendamento> updateAgendamentoDetails(
            @PathVariable Long id,
            @RequestParam String sala,
            @RequestParam String tipo,
            @RequestParam(required = false) String observacoes) {
        return ResponseEntity.ok(agendamentoService.updateAgendamentoDetails(id, sala, tipo, observacoes));
    }

    @GetMapping("/by-date-and-colaborador/{especialistaColaboradorId}")
    public ResponseEntity<List<AgendamentoDTO>> getAgendamentosByDateAndColaborador(
            @PathVariable Long especialistaColaboradorId,
            @RequestParam Timestamp data) {
        return ResponseEntity.ok(agendamentoService.getAgendamentosByDateAndColaborador(especialistaColaboradorId, data));
    }

    @GetMapping("/em-atendimento")
    public ResponseEntity<List<AgendamentoDTO>> getAllAgendamentosEmAtendimento() {
        return ResponseEntity.ok(agendamentoService.getAllAgendamentosEmAtendimento());
    }

    @GetMapping
    public ResponseEntity<List<AgendamentoDTO>> getAllAgendamentos() {
        return ResponseEntity.ok(agendamentoService.getAllAgendamentos());
    }

    @GetMapping("/by-unidade-prefixo/{unidadePrefixo}")
    public ResponseEntity<List<AgendamentoDTO>> byUnidadePrefixo(@PathVariable String unidadePrefixo) {
        return ResponseEntity.ok(agendamentoService.byUnidadePrefixo(unidadePrefixo));
    }
}