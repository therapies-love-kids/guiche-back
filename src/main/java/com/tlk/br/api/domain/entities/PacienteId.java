package com.tlk.br.api.domain.entities;

import java.io.Serializable;
import java.util.Objects;

public class PacienteId implements Serializable {
    private Long pk;
    private Long id;

    // Construtores
    public PacienteId() {
    }

    public PacienteId(Long pk, Long id) {
        this.pk = pk;
        this.id = id;
    }

    // Getters e Setters
    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Equals e HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PacienteId that = (PacienteId) o;
        return Objects.equals(pk, that.pk) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk, id);
    }
}