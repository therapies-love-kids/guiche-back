package com.tlk.br.api.domain.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

public class EmpresaDTO {

    @Schema(description = "Id do diretor", example = "1", required = true)
    private Long diretor_colaborador_id;

    @Schema(description = "Ativo", example = "true", required = true)
    private boolean ativo;

    @Schema(description = "CNPJ", example = "123456789", required = true)
    private String cnpj;

    @Schema(description = "Razao social", example = "Empresa", required = true)
    private String razao_social;

    @Schema(description = "Nome fantasia", example = "Empresa", required = true)
    private String nome_fantasia;

    @Schema(description = "CEP", example = "12345678", required = true)
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

    @Schema(description = "Prefixo da unidade", example = "E001", required = true)
    private String unidade_prefixo;

    @Schema(description = "Nome da unidade", example = "Unidade", required = true)
    private String unidade_nome;

    public EmpresaDTO() {
    }

    public Long getDiretor_colaborador_id() {
        return this.diretor_colaborador_id;
    }

    public void setDiretor_colaborador_id(Long diretor_colaborador_id) {
        this.diretor_colaborador_id = diretor_colaborador_id;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return this.razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }


    public String getNome_fantasia() {
        return this.nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
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

    public String getUnidade_prefixo() {
        return this.unidade_prefixo;
    }

    public void setUnidade_prefixo(String unidade_prefixo) {
        this.unidade_prefixo = unidade_prefixo;
    }

    public String getUnidade_nome() {
        return this.unidade_nome;
    }

    public void setUnidade_nome(String unidade_nome) {
        this.unidade_nome = unidade_nome;
    }

    public Long getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

}
