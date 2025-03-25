package com.tlk.br.api.domain.entitites;

import java.util.Date;

import jakarta.persistence.Column;
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
    @Column(name = "especialista_colaborador_id")
    private Long especialistaColaboradorId;
    @Column(name = "paciente_id")
    private Long pacienteId;
    @Column(name = "recepcionista_colaborador_id")
    private Long recepcionistaColaboradorId;
    @Column(name = "responsavel_id")
    private Long responsavelId;
    @Column(name = "unidade_prefixo")
    private String unidadePrefixo;
    @Column(name = "data_hora_criacao")
    private Date dataHoraCriacao;
    @Column(name = "data_hora")
    private Date dataHora;
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

    public Long getEspecialistaColaboradorId() {
        return this.especialistaColaboradorId;
    }

    public void setEspecialistaColaboradorId(Long especialista_colaborador_id) {
        this.especialistaColaboradorId = especialista_colaborador_id;
    }
    
    public Long getPacienteId() {
        return this.pacienteId;
    }

    public void setPacienteId(Long paciente_id) {
        this.pacienteId = paciente_id;
    }

    public Long getRecepcionistaColaboradorId() {
        return this.recepcionistaColaboradorId;
    }

    public void setRecepcionistaColaboradorId(Long recepcionista_colaborador_id) {
        this.recepcionistaColaboradorId = recepcionista_colaborador_id;
    }

    public Long getResponsavelId() {
        return this.responsavelId;
    }

    public void setResponsavelId(Long responsavel_id) {
        this.responsavelId = responsavel_id;
    }

    public String getUnidadePrefixo() {
        return this.unidadePrefixo;
    }

    public void setUnidadePrefixo(String unidade_prefixo) {
        this.unidadePrefixo = unidade_prefixo;
    }

    public Date getDataHoraCriacao() {
        return this.dataHoraCriacao;
    }

    public void setDataHoraCriacao(Date data_hora_criacao) {
        this.dataHoraCriacao = data_hora_criacao;
    }

    public Date getDataHora() {
        return this.dataHora;
    }

    public void setDataHora(Date data_hora) {
        this.dataHora = data_hora;
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
 
