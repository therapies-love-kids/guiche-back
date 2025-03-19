package com.tlk.br.api.domain.entitites;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "agendamento")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    private Long especialista_colaborador_id;
    private Long paciente_id;
    private Long recepcionista_colaborador_id;
    private Long responsavel_id;
    private String unidade_prefixo;
    private Date data_hora_criacao;
    private Date data_hora;
    private String sala;
    private String tipo;
    private String status;
    private String observacoes;

    public Agendamento() {
    }
    
    public Long getPk() {
        return this.pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getEspecialista_colaborador_id() {
        return this.especialista_colaborador_id;
    }

    public void setEspecialista_colaborador_id(Long especialista_colaborador_id) {
        this.especialista_colaborador_id = especialista_colaborador_id;
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
 
