package com.tlk.br.api.domain.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class AgendamentoDTO {
    private String codigo;

    private String sala;

    @JsonProperty("dataHoraSala") // Garante que o campo seja serializado como "dataHoraSala"
    private Timestamp dataHoraSala;

    // Getters e setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getSala() { return sala; }
    public void setSala(String sala) { this.sala = sala; }

    public Timestamp getDataHoraSala() { return dataHoraSala; }
    public void setDataHoraSala(Timestamp dataHoraSala) { this.dataHoraSala = dataHoraSala; }
}