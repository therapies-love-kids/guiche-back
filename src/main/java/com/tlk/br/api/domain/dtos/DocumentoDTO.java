package com.tlk.br.api.domain.dtos;

import java.util.Date;

public class DocumentoDTO {

    private Boolean ativo;
    private Long paciente_id;
    private Long colaborador_id;
    private Date data_hora_criacao;
    private String tipo;
    private String caminho;

    public DocumentoDTO() {
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

    public Long getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }



    

}
