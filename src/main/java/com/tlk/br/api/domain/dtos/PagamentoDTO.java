package com.tlk.br.api.domain.dtos;

import java.util.Date;

public class PagamentoDTO { 
	
    private Long responsavel_id;
    private Date data_hora_criacao;
    private Long valor;
    private String tipo;
    private String descricao;

    public PagamentoDTO() {
        
    }

	public Long getResponsavel_id() {
		return this.responsavel_id;
	}

	public void setResponsavel_id(Long responsavel_id) {
		this.responsavel_id = responsavel_id;
	}

	public Date getData_hora_criacao() {
		return this.data_hora_criacao;
	}

	public void setData_hora_criacao(Date data_hora_criacao) {
		this.data_hora_criacao = data_hora_criacao;
	}

	public Long getValor() {
		return this.valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



}
