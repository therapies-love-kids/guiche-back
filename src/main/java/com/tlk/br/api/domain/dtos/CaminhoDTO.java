package com.tlk.br.api.domain.dtos;

import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;

public class CaminhoDTO {

    @Schema(description = "Id do caminho", example = "1", required = true)
    private Long pk;

    @Schema(description = "Id do usuario", example = "1", required = true)
    private Long usuario_id;

    @Schema(description = "Data e hora de criacao", example = "2000-01-01", required = true)
    private Date data_hora_criacao;

    @Schema(description = "Ativo", example = "true", required = true)
    private boolean ativo;

    @Schema(description = "Caminho", example = "caminho", required = true)
    private String caminho;

    @Schema(description = "Editavel", example = "true", required = true)
    private boolean editavel;

    @Schema(description = "Leitura", example = "true", required = true)
    private boolean leitura;

    public CaminhoDTO() {
    }


    public Long getId() {
        return this.pk;
    }


    public Long getUsuario_id() {
        return this.usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Date getData_hora_criacao() {
        return this.data_hora_criacao;
    }

    public void setData_hora_criacao(Date data_hora_criacao) {
        this.data_hora_criacao = data_hora_criacao;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getCaminho() {
        return this.caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public boolean isEditavel() {
        return this.editavel;
    }

    public void setEditavel(boolean editavel) {
        this.editavel = editavel;
    }

    public boolean isLeitura() {
        return this.leitura;
    }

    public void setLeitura(boolean leitura) {
        this.leitura = leitura;
    }

}
