package com.tlk.br.api.domain.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk")
    private Long pk;

    @Column(name = "id")
    private Long id; // Preenchido automaticamente pelo gatilho no banco

    @Column(name = "empresa_unidade_prefixo")
    private String empresaUnidadePrefixo;

    @Column(name = "convenio_pk")
    private Long convenioPk;

    private String codigo;

    private boolean ativo;

    private String nome;

    @Column(name = "nome_curto")
    private String nomeCurto;

    private String sexo;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @Column(name = "local_nascimento")
    private String localNascimento;

    @Column(name = "certidao_nascimento")
    private String certidaoNascimento;

    private String cpf;

    @Column(name = "numero_convenio")
    private String numeroConvenio;

    private String observacoes;

    // Construtores
    public Paciente() {
    }

    // Getters e Setters
    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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