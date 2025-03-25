package com.tlk.br.api.domain.dtos;

import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;

public class ContratoDTO {

    @Schema(description = "Id do responsavel", example = "1", required = true)
    private Long responsavel_id;

    @Schema(description = "Id do paciente", example = "1", required = true)
    private long paciente_id;

    @Schema(description = "Id do documento", example = "1", required = true)
    private Long documento_pk;

    @Schema(description = "Ativo", example = "true", required = true)
    private boolean ativo;

    @Schema(description = "Data e hora de criacao do contrato", example = "2021-01-01 00:00:00", required = true)
    private Date data_hora_criacao;

    @Schema(description = "Cep", example = "12345678", required = true)
    private String cep;

    @Schema(description = "UF", example = "SP", required = true)
    private String uf;

    @Schema(description = "Cidade", example = "Sao Paulo", required = true)
    private String cidade;

    @Schema(description = "Bairro", example = "Centro", required = true)
    private String bairro;

    @Schema(description = "Logradouro", example = "Rua", required = true)
    private String logradouro;

    @Schema(description = "Numero", example = "123", required = true)
    private String numero;

    @Schema(description = "Complemento", example = "Casa", required = true)
    private String complemento;

    public ContratoDTO() {
    }

    public Long getResponsavel_id() {
        return this.responsavel_id;
    }

    public void setResponsavel_id(Long responsavel_id) {
        this.responsavel_id = responsavel_id;
    }

    public long getPaciente_id() {
        return this.paciente_id;
    }

    public void setPaciente_id(long paciente_id) {
        this.paciente_id = paciente_id;
    }

    public Long getDocumento_pk() {
        return this.documento_pk;
    }

    public void setDocumento_pk(Long documento_pk) {
        this.documento_pk = documento_pk;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getData_hora_criacao() {
        return this.data_hora_criacao;
    }

    public void setData_hora_criacao(Date data_hora_criacao) {
        this.data_hora_criacao = data_hora_criacao;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Long getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

}
