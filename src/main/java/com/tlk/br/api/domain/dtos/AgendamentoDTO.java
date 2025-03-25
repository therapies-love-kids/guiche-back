package com.tlk.br.api.domain.dtos;

import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;


public class AgendamentoDTO {
    @Schema(description = "Id do avaliador", example = "1", required = true)
    private Long especialista_colaborador_id;

    @Schema(description = "Id do paciente", example = "1", required = true)
    private Long paciente_id;

    @Schema(description = "Id do recepcionista", example = "1", required = true)
    private Long recepcionista_colaborador_id;

    @Schema(description = "Id do responsavel", example = "1", required = true)
    private Long responsavel_id;

    @Schema(description = "Prefixo da unidade", example = "E001", required = true)
    private String unidade_prefixo;

    @Schema(description = "Data e hora de criacao do agendamento", example = "2021-01-01 00:00:00", required = true)
    private Date data_hora_criacao;

    @Schema(description = "Data e hora do agendamento", example = "2021-01-01 00:00:00", required = true)
    private Date data_hora;

    @Schema(description = "Sala", example = "Sala 1", required = true)
    private String sala;

    @Schema(description = "Tipo", example = "Consulta", required = true)
    private String tipo;

    @Schema(description = "Status", example = "Pendente", required = true)
    private String status;

    @Schema(description = "Observacoes", example = "Observacoes", required = true)
    private String observacoes;

    public AgendamentoDTO() {
    }

    
    public Long getId() {
        return this.paciente_id;
    }

    public Long getEspecialista_colaborador_id() {
        return this.especialista_colaborador_id;
    }

    public void setEspecialista_colaborador_id(Long especialista_colaborador_id) {
        this.especialista_colaborador_id = especialista_colaborador_id;
    }

    
    public Long getPaciente_id() {
        return this.paciente_id;
    }

    public void setPaciente_id(Long paciente_id) {
        this.paciente_id = paciente_id;
    }

    public Long getRecepcionista_colaborador_id() {
        return this.recepcionista_colaborador_id;
    }

    public void setRecepcionista_colaborador_id(Long recepcionista_colaborador_id) {
        this.recepcionista_colaborador_id = recepcionista_colaborador_id;
    }

    public Long getResponsavel_id() {
        return this.responsavel_id;
    }

    public void setResponsavel_id(Long responsavel_id) {
        this.responsavel_id = responsavel_id;
    }

    public String getUnidade_prefixo() {
        return this.unidade_prefixo;
    }

    public void setUnidade_prefixo(String unidade_prefixo) {
        this.unidade_prefixo = unidade_prefixo;
    }

    public Date getData_hora_criacao() {
        return this.data_hora_criacao;
    }

    public void setData_hora_criacao(Date data_hora_criacao) {
        this.data_hora_criacao = data_hora_criacao;
    }

    public Date getData_hora() {
        return this.data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }

    public String getSala() {
        return this.sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
 
