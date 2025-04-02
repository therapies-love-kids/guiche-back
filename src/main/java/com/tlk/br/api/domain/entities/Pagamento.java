package com.tlk.br.api.domain.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pagamentos")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk; 
    private Long responsavel_id;
    private Date data_hora_criacao;
    private Long valor;
    private String tipo;
    private String descricao;

    public Pagamento() {
        
    }
	public Long getPk() {
		return this.pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
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
