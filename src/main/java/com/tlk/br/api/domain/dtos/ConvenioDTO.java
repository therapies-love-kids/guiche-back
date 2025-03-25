package com.tlk.br.api.domain.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

public class ConvenioDTO {

    @Schema(description = "Valor para verificar se o convenio está ativo", example = "true", required = true)
    private boolean ativo;

    @Schema(description = "Nome do convenio", example = "Convenio Médico de Anápolis", required = true)
    private String nome;

    @Schema(description = "Nome curto do convenio", example = "Convenio", required = true)
    private String nome_curto;

    
    public ConvenioDTO() {
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_curto() {
        return this.nome_curto;
    }

    public void setNome_curto(String nome_curto) {
        this.nome_curto = nome_curto;
    }

    public Long getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

}
