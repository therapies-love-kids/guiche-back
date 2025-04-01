package com.tlk.br.api.domain.dtos;

public class AgendamentoUpdateDetailsDTO {
    private String sala;
    private String tipo;
    private String observacoes;

    // Getters e Setters
    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}