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

        // Criar um novo DTO com os valores da entidade salva
        PacienteDTO responseDTO = new PacienteDTO();
        responseDTO.setPk(savedPaciente.getPk());
        responseDTO.setEmpresaUnidadePrefixo(savedPaciente.getEmpresaUnidadePrefixo());
        responseDTO.setConvenioPk(savedPaciente.getConvenioPk());
        responseDTO.setCodigo(savedPaciente.getCodigo());
        responseDTO.setAtivo(savedPaciente.isAtivo());
        responseDTO.setNome(savedPaciente.getNome());
        responseDTO.setNomeCurto(savedPaciente.getNomeCurto());
        responseDTO.setSexo(savedPaciente.getSexo());
        responseDTO.setDataNascimento(savedPaciente.getDataNascimento());
        responseDTO.setLocalNascimento(savedPaciente.getLocalNascimento());
        responseDTO.setCertidaoNascimento(savedPaciente.getCertidaoNascimento());
        responseDTO.setCpf(savedPaciente.getCpf());
        responseDTO.setNumeroConvenio(savedPaciente.getNumeroConvenio());
        responseDTO.setObservacoes(savedPaciente.getObservacoes());

        return ResponseEntity.status(201).body(responseDTO); // 201 Created
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

        // Criar um novo DTO com os valores da entidade atualizada
        PacienteDTO responseDTO = new PacienteDTO();
        responseDTO.setPk(updatedPaciente.getPk());
        responseDTO.setEmpresaUnidadePrefixo(updatedPaciente.getEmpresaUnidadePrefixo());
        responseDTO.setConvenioPk(updatedPaciente.getConvenioPk());
        responseDTO.setCodigo(updatedPaciente.getCodigo());
        responseDTO.setAtivo(updatedPaciente.isAtivo());
        responseDTO.setNome(updatedPaciente.getNome());
        responseDTO.setNomeCurto(updatedPaciente.getNomeCurto());
        responseDTO.setSexo(updatedPaciente.getSexo());
        responseDTO.setDataNascimento(updatedPaciente.getDataNascimento());
        responseDTO.setLocalNascimento(updatedPaciente.getLocalNascimento());
        responseDTO.setCertidaoNascimento(updatedPaciente.getCertidaoNascimento());
        responseDTO.setCpf(updatedPaciente.getCpf());
        responseDTO.setNumeroConvenio(updatedPaciente.getNumeroConvenio());
        responseDTO.setObservacoes(updatedPaciente.getObservacoes());

        return ResponseEntity.ok(responseDTO); // 200 OK
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