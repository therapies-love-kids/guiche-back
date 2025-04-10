package com.tlk.br.api.controllers;

import com.tlk.br.api.domain.dtos.ConvenioDTO;
import com.tlk.br.api.services.ConvenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/convenios")
public class ConvenioController {

    @Autowired
    private ConvenioService convenioService;

    @PostMapping
    public ResponseEntity<ConvenioDTO> save(@RequestBody ConvenioDTO convenioDTO) {
        return ResponseEntity.ok(convenioService.save(convenioDTO));
    }

    @PutMapping("/{pk}")
    public ResponseEntity<ConvenioDTO> update(@PathVariable Integer pk, @RequestBody ConvenioDTO convenioDTO) {
        return ResponseEntity.ok(convenioService.update(pk, convenioDTO));
    }

    @GetMapping("/{pk}")
    public ResponseEntity<ConvenioDTO> findByPk(@PathVariable Integer pk) {
        return ResponseEntity.ok(convenioService.findByPk(pk));
    }

    @DeleteMapping("/{pk}")
    public ResponseEntity<Void> delete(@PathVariable Integer pk) {
        convenioService.delete(pk);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ConvenioDTO>> findAll() {
        return ResponseEntity.ok(convenioService.findAll());
    }
}