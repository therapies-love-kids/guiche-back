package com.tlk.br.api.domain.dtos;

import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;


public class LacoDTO {

    @Schema(description = "Id do responsavel", example = "1", required = true)
    private Long paciente_id;

    @Schema(description = "Id do responsavel", example = "1", required = true)
    private Long responsavel_id;

    @Schema(description = "Data e hora de criacao do laco", example = "2021-01-01 00:00:00", required = true)
    private Date data_hora_criacao;

    @Schema(description = "Tipo", example = "Boleto", required = true)
    private String tipo;

    public LacoDTO() {
    }

    public Long getPaciente_id() {
        return this.paciente_id;
    }

    public void setPaciente_id(Long paciente_id) {
        this.paciente_id = paciente_id;
    }

    public Long getResponsavel_id() {
        return this.responsavel_id;
    }

    public void setResponsavel_id(Long responsavel_id) {
        this.responsavel_id = responsavel_id;
    }

    public Date getData_hora_criacao() {
        return this.data_hora_criacao;
    }

    public void setData_hora_criacao(Date data_hora_criacao) {
        this.data_hora_criacao = data_hora_criacao;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

}
