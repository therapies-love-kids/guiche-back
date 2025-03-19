package com.tlk.br.api.domain.entitites;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    private Long id;
    private String empresa_unidade_prefixo;
    private Long convenio_pk;
    private String codigo;
    private boolean ativo;
    private String nome;
    private String nome_curto;
    private String sexo;
    private Date data_nascimento;
    private String local_nascimento;
    private String certidao_nascimento;
    private String cpf;
    private String numero_convenio;
    private String observacoes;

    public Paciente() {
        
    }
    
    public Long getPk() {
        return this.pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
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
