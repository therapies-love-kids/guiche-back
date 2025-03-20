package com.tlk.br.api.domain.dtos;



public class ConvenioDTO {

    private boolean ativo;
    private String nome;
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

}
