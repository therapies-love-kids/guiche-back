package com.tlk.br.api.domain.dtos;

public class AgendamentoDTO {
    private Long pk;
    private String codigo;
    private String sala;
    private String dataHoraSala;
    private String tipo;
    private String status;
    private String observacoes;
    private Long especialistaColaboradorId;
    private Long pacienteId;
    private Long recepcionistaColaboradorId;
    private Long responsavelId;
    private String unidadePrefixo;
    private String dataHoraCriacao;

    // Getters e Setters
    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDataHoraSala() {
        return dataHoraSala;
    }

    public void setDataHoraSala(String dataHoraSala) {
        this.dataHoraSala = dataHoraSala;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Long getEspecialistaColaboradorId() {
        return especialistaColaboradorId;
    }

    public void setEspecialistaColaboradorId(Long especialistaColaboradorId) {
        this.especialistaColaboradorId = especialistaColaboradorId;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }

    public Long getRecepcionistaColaboradorId() {
        return recepcionistaColaboradorId;
    }

    public void setRecepcionistaColaboradorId(Long recepcionistaColaboradorId) {
        this.recepcionistaColaboradorId = recepcionistaColaboradorId;
    }

    public Long getResponsavelId() {
        return responsavelId;
    }

    public void setResponsavelId(Long responsavelId) {
        this.responsavelId = responsavelId;
    }

    public String getUnidadePrefixo() {
        return unidadePrefixo;
    }

    public void setUnidadePrefixo(String unidadePrefixo) {
        this.unidadePrefixo = unidadePrefixo;
    }

    public String getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(String dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }
}