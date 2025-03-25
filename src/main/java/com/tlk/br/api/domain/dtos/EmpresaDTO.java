package com.tlk.br.api.domain.dtos;


public class EmpresaDTO {
    private Long diretor_colaborador_id;
    private boolean ativo;
    private String cnpj;
    private String razao_social;
    private String nome_fantasia;
    private String cep;
    private String uf;
    private String cidade;
    private String bairro;
    private String logradouro;
    private String numero;
    private String complemento;
    private String unidade_prefixo;
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
