package com.tlk.br.api.domain.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

public class PacienteDTO {

    @Schema(description = "Chave primária gerada automaticamente", example = "1")
    private Long pk;

    @Schema(description = "Prefixo da unidade da empresa", example = "E001")
    @JsonProperty("empresa_unidade_prefixo")
    private String empresaUnidadePrefixo;

    @Schema(description = "Chave primária do convênio", example = "1")
    @JsonProperty("convenio_pk")
    private Long convenioPk;

    @Schema(description = "Código do paciente", example = "PAC001")
    private String codigo;

    @Schema(description = "Indica se o paciente está ativo", example = "true")
    private boolean ativo;

    @Schema(description = "Nome completo do paciente", example = "João Silva")
    private String nome;

    @Schema(description = "Nome curto do paciente", example = "João")
    @JsonProperty("nome_curto")
    private String nomeCurto;

    @Schema(description = "Sexo do paciente (M/F)", example = "M")
    private String sexo;

    @Schema(description = "Data de nascimento do paciente", type = "string", format = "date-time", example = "1990-01-01T00:00:00.000Z")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
    @JsonProperty("data_nascimento")
    private Date dataNascimento;

    @Schema(description = "Local de nascimento do paciente", example = "São Paulo")
    @JsonProperty("local_nascimento")
    private String localNascimento;

    @Schema(description = "Número da certidão de nascimento", example = "123456")
    @JsonProperty("certidao_nascimento")
    private String certidaoNascimento;

    @Schema(description = "CPF do paciente", example = "123.456.789-00")
    private String cpf;

    @Schema(description = "Número do convênio", example = "CONV001")
    @JsonProperty("numero_convenio")
    private String numeroConvenio;

    @Schema(description = "Observações sobre o paciente", example = "Paciente novo")
    private String observacoes;

    // Construtores
    public PacienteDTO() {
    }

    // Getters e Setters
    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getEmpresaUnidadePrefixo() {
        return empresaUnidadePrefixo;
    }

    public void setEmpresaUnidadePrefixo(String empresaUnidadePrefixo) {
        this.empresaUnidadePrefixo = empresaUnidadePrefixo;
    }

    public Long getConvenioPk() {
        return convenioPk;
    }

    public void setConvenioPk(Long convenioPk) {
        this.convenioPk = convenioPk;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCurto() {
        return nomeCurto;
    }

    public void setNomeCurto(String nomeCurto) {
        this.nomeCurto = nomeCurto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public String getCertidaoNascimento() {
        return certidaoNascimento;
    }

    public void setCertidaoNascimento(String certidaoNascimento) {
        this.certidaoNascimento = certidaoNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(String numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}