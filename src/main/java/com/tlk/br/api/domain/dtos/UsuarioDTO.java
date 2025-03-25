package com.tlk.br.api.domain.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
public class UsuarioDTO {

    @Schema(description = "Id do colaborador", example = "1", required = true)
    private Long colaborador_id;

    @Schema(description = "Ativo", example = "true", required = true)
    private boolean ativo;

    @Schema(description = "Online", example = "true", required = true)
    private boolean online;

    @Schema(description = "Nome", example = "Hugo Cauê José Caldeira", required = true)
    private String nome;

    @Schema(description = "Senha", example = "123456", required = true)
    private String senha;

    @Schema(description = "Nome do computador", example = "Hugo Cauê José Caldeira", required = true)
    private String nome_computador;

    @Schema(description = "Perfil", example = "admin", required = true)
    private String perfil;

    public UsuarioDTO() {
    }

    public Long getColaborador_id() {
        return this.colaborador_id;
    }

    public void setColaborador_id(Long colaborador_id) {
        this.colaborador_id = colaborador_id;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean isOnline() {
        return this.online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome_computador() {
        return this.nome_computador;
    }

    public void setNome_computador(String nome_computador) {
        this.nome_computador = nome_computador;
    }

    public String getPerfil() {
        return this.perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

}
