package com.tlk.br.api.domain.entitites;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "caminho")
public class Caminho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    private Long usuario_id;
    private Date data_hora_criacao;
    private boolean ativo;
    private String caminho;
    private boolean editavel;
    private boolean leitura;

    public Caminho() {
    }

    public Long getPk() {
        return this.pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
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
