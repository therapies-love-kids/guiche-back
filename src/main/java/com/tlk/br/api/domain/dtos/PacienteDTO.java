package com.tlk.br.api.domain.dtos;

import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;


public class PacienteDTO {

    @Schema(description = "Id do paciente", example = "1", required = true)
    private Long id;

    @Schema(description = "Prefixo da unidade", example = "E001", required = true)
    private String empresa_unidade_prefixo;

    @Schema(description = "Id do convenio", example = "1", required = true)
    private Long convenio_pk;

    @Schema(description = "Codigo do paciente", example = "1", required = true)
    private String codigo;

    @Schema(description = "Ativo", example = "true", required = true)
    private boolean ativo;

    @Schema(description = "Nome completo", example = "Hugo Cauê José Caldeira", required = true)
    private String nome;

    @Schema(description = "Nome curto", example = "Hugo Caldeira", required = true)
    private String nome_curto;

    @Schema(description = "Sexo", example = "M", required = true)
    private String sexo;

    @Schema(description = "Data de nascimento", example = "2000-01-01", required = true)
    private Date data_nascimento;

    @Schema(description = "Local de nascimento", example = "Rio de Janeiro", required = true)
    private String local_nascimento;

    @Schema(description = "Nome completo do pai", example = "Hugo Cauê José Caldeira", required = true)
    private String certidao_nascimento;

    @Schema(description = "CPF", example = "12345678900", required = true)
    private String cpf;

    @Schema(description = "Numero do convenio", example = "123456789", required = true)
    private String numero_convenio;

    @Schema(description = "Observacoes", example = "Observacoes", required = true)
    private String observacoes;

    public PacienteDTO() {
        
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpresa_unidade_prefixo() {
        return this.empresa_unidade_prefixo;
    }

    public void setEmpresa_unidade_prefixo(String empresa_unidade_prefixo) {
        this.empresa_unidade_prefixo = empresa_unidade_prefixo;
    }

    public Long getConvenio_pk() {
        return this.convenio_pk;
    }

    public void setConvenio_pk(Long convenio_pk) {
        this.convenio_pk = convenio_pk;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getData_nascimento() {
        return this.data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getLocal_nascimento() {
        return this.local_nascimento;
    }

    public void setLocal_nascimento(String local_nascimento) {
        this.local_nascimento = local_nascimento;
    }

    public String getCertidao_nascimento() {
        return this.certidao_nascimento;
    }

    public void setCertidao_nascimento(String certidao_nascimento) {
        this.certidao_nascimento = certidao_nascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumero_convenio() {
        return this.numero_convenio;
    }

    public void setNumero_convenio(String numero_convenio) {
        this.numero_convenio = numero_convenio;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

}
