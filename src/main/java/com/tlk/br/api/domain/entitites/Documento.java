package com.tlk.br.api.domain.entitites;

import jakarta.persistence.Table;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "documento")
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    private Boolean ativo;
    private Long paciente_id;
    private Long colaborador_id;
    private Date data_hora_criacao;
    private String tipo;
    private String caminho;

    public Documento() {
    }

	public Long getPk() {
		return this.pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
	}

	public Boolean getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Long getPaciente_id() {
		return this.paciente_id;
	}

	public void setPaciente_id(Long paciente_id) {
		this.paciente_id = paciente_id;
	}

	public Long getColaborador_id() {
		return this.colaborador_id;
	}

	public void setColaborador_id(Long colaborador_id) {
		this.colaborador_id = colaborador_id;
	}

	public Date getData_hora_criacao() {
		return this.data_hora_criacao;
	}

	public void setData_hora_criacao(Date data_hora_criacao) {
		this.data_hora_criacao = data_hora_criacao;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCaminho() {
		return this.caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}



    

}
