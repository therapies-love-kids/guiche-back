package com.tlk.br.api.domain.entitites;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    private Long pk;
    private Long colaborador_id;
    private boolean ativo;
    private boolean online;
    private String nome;
    private String senha;
    private String nome_computador;
    private String perfil;

    public Usuario() {
    }

    public Long getPk() {
        return this.pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getColaborador_id() {
        return this.colaborador_id;
    }

    public void setColaborador_id(Long colaborador_id) {
        this.colaborador_id = colaborador_id;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean isOnline() {
        return this.online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome_computador() {
        return this.nome_computador;
    }

    public void setNome_computador(String nome_computador) {
        this.nome_computador = nome_computador;
    }

    public String getPerfil() {
        return this.perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

}
