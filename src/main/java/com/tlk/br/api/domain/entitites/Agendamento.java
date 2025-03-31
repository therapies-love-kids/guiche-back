package com.tlk.br.api.domain.entitites;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "agendamento")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk;

    @Column(name = "especialista_colaborador_id", nullable = false)
    private Integer especialistaColaboradorId;

    @Column(name = "paciente_id")
    private Integer pacienteId;

    @Column(name = "recepcionista_colaborador_id")
    private Integer recepcionistaColaboradorId;

    @Column(name = "responsavel_id")
    private Integer responsavelId;

    @Column(name = "unidade_prefixo")
    private String unidadePrefixo;

    @Column(name = "data_hora_criacao")
    private Timestamp dataHoraCriacao;

    @Column(name = "data_hora_sala")
    @JsonProperty("data_hora")
    private Timestamp dataHoraSala;

    private String tipo;
    private String status;
    private String observacoes;
    private String sala;

    // Getters e setters
    public Integer getPk() { return pk; }
    public void setPk(Integer pk) { this.pk = pk; }

    public Integer getEspecialistaColaboradorId() { return especialistaColaboradorId; }
    public void setEspecialistaColaboradorId(Integer especialistaColaboradorId) { this.especialistaColaboradorId = especialistaColaboradorId; }

    public Integer getPacienteId() { return pacienteId; }
    public void setPacienteId(Integer pacienteId) { this.pacienteId = pacienteId; }

    public Integer getRecepcionistaColaboradorId() { return recepcionistaColaboradorId; }
    public void setRecepcionistaColaboradorId(Integer recepcionistaColaboradorId) { this.recepcionistaColaboradorId = recepcionistaColaboradorId; }

    public Integer getResponsavelId() { return responsavelId; }
    public void setResponsavelId(Integer responsavelId) { this.responsavelId = responsavelId; }

    public String getUnidadePrefixo() { return unidadePrefixo; }
    public void setUnidadePrefixo(String unidadePrefixo) { this.unidadePrefixo = unidadePrefixo; }

    public Timestamp getDataHoraCriacao() { return dataHoraCriacao; }
    public void setDataHoraCriacao(Timestamp dataHoraCriacao) { this.dataHoraCriacao = dataHoraCriacao; }

    public Timestamp getDataHoraSala() { return dataHoraSala; }
    public void setDataHoraSala(Timestamp dataHoraSala) { this.dataHoraSala = dataHoraSala; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public String getSala() { return sala; }
    public void setSala(String sala) { this.sala = sala; }
}