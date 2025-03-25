package com.tlk.br.api.domain.dtos;

import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;

public class PagamentoDTO { 
	
	@Schema(description = "Id do responsavel", example = "1", required = true)
    private Long responsavel_id;

	@Schema(description = "Data e hora de criacao do pagamento", example = "2021-01-01 00:00:00", required = true)
    private Date data_hora_criacao;

	@Schema(description = "Valor", example = "1000", required = true)
    private Long valor;

	@Schema(description = "Tipo", example = "Boleto", required = true)
    private String tipo;

	@Schema(description = "Descricao", example = "Boleto", required = true)
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

    public Long getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }



}
