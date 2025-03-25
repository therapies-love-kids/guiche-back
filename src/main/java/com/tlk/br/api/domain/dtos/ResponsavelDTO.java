package com.tlk.br.api.domain.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

public class ResponsavelDTO {

    @Schema(description = "Id do responsavel", example = "1", required = true)
    private Long id;

    @Schema(description = "Ativo", example = "true", required = true)
    private boolean ativo;

    @Schema(description = "Nome completo", example = "Hugo Cauê José Caldeira", required = true)
    private String nome;

    @Schema(description = "Estado civil", example = "Solteiro", required = true)
    private String estado_civil;

    @Schema(description = "Profissao", example = "Profissional", required = true)
    private String profissao;

    @Schema(description = "CPF", example = "12345678900", required = true)
    private String cpf;

    @Schema(description = "RG", example = "123456789", required = true)
    private String rg;

    @Schema(description = "Celular", example = "11999999999", required = true)
    private String celular;

    @Schema(description = "Email", example = "Hb9dX@example.com", required = true)
    private String email;

    @Schema(description = "Contatos extras", example = "Pombo correio: Jeremias", required = true)
    private String contatos_extras;

    public ResponsavelDTO() {
        
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado_civil() {
        return this.estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContatos_extras() {
        return this.contatos_extras;
    }

    public void setContatos_extras(String contatos_extras) {
        this.contatos_extras = contatos_extras;
    }

}
