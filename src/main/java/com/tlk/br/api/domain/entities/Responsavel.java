package com.tlk.br.api.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "responsavel")
public class Responsavel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    private Long id;
    private boolean ativo;
    private String nome;
    private String estado_civil;
    private String profissao;
    private String cpf;
    private String rg;
    private String celular;
    private String email;
    private String contatos_extras;

    public Responsavel() {
        
    }
    public Long getPk() {
        return this.pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
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
