package com.tlk.br.api.domain.dtos;

import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;

public class ColaboradorDTO {

    @Schema(description = "Id da empresa e unidade", example = "E001", required = true)
    private String empresa_unidade_prefixo;

    @Schema(description = "Ativo", example = "true", required = true)
    private boolean ativo;

    @Schema(description = "Nome completo", example = "Hugo Cauê José Caldeira", required = true)
    private String nome;

    @Schema(description = "Sexo", example = "M", required = true)
    private Character sexo;

    @Schema(description = "Data de nascimento", example = "2000-01-01", required = true)
    private Date data_nascimento;

    @Schema(description = "Local de nascimento", example = "Rio de Janeiro", required = true)
    private String local_nascimento;

    @Schema(description = "Nome completo do pai", example = "Hugo Cauê José Caldeira", required = true)
    private String nome_pai;

    @Schema(description = "Nome completo da mae", example = "Mariana Cauê José Caldeira", required = true)
    private String nome_mae;

    @Schema(description = "Estado civil", example = "Solteiro", required = true)
    private String estado_civil;

    @Schema(description = "Certidao de casamento", example = "123456789", required = true)
    private String certidao_casamento;

    @Schema(description = "CPF", example = "123.456.789-00", required = true)
    private String cpf;

    @Schema(description = "RG", example = "123456789", required = true)
    private String rg;

    @Schema(description = "CNH", example = "123456789", required = true)
    private String cnh;

    @Schema(description = "Numero da Reservista", example = "123456789", required = true)
    private String numero_reservista;

    @Schema(description = "Celular", example = "11999999999", required = true)
    private String celular;

    @Schema(description = "Email", example = "t3BwI@example.com", required = true)
    private String email;

    @Schema(description = "Modo de trabalho", example = "CLT", required = true)
    private String modo_trabalho;

    @Schema(description = "CEP", example = "12345678", required = true)
    private String cep;

    @Schema(description = "UF", example = "GO", required = true)
    private String uf;

    @Schema(description = "Cidade", example = "Goiania", required = true)
    private String cidade;

    @Schema(description = "Bairro", example = "Centro", required = true)
    private String bairro;

    @Schema(description = "Logradouro", example = "Avenida", required = true)
    private String logradouro;

    @Schema(description = "Numero", example = "123", required = true)
    private String numero;

    @Schema(description = "Complemento", example = "Casa", required = true)
    private String complemento;

    @Schema(description = "Titulo profissional", example = "Medico", required = true)
    private String titulo_profissional;

    @Schema(description = "Registro profissional", example = "123456", required = true)
    private String registro_profissional;

    @Schema(description = "Data de admissao", example = "2020-01-01", required = true)
    private Date data_admissao;

    @Schema(description = "Data de demissao", example = "2020-01-01", required = true)
    private Date data_demissao;

    @Schema(description = "PIS", example = "123456789", required = false)
    private String pis;

    @Schema(description = "Setor em que a pessoa trabalha", example = "Terapeutica", required = true)
    private String setor;

    @Schema(description = "Funcao em que a pessoa trabalha", example = "Terapeutica", required = true)
    private String funcao;

    @Schema(description = "Especialidade em que a pessoa trabalha", example = "Terapeutica", required = true)
    private String especialidade;

    public ColaboradorDTO() {
    }

    public String getEmpresa_unidade_prefixo() {
        return this.empresa_unidade_prefixo;
    }

    public void setEmpresa_unidade_prefixo(String empresa_unidade_prefixo) {
        this.empresa_unidade_prefixo = empresa_unidade_prefixo;
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

    public Character getSexo() {
        return this.sexo;
    }

    public void setSexo(Character sexo) {
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

    
    public String getNome_pai() {
        return this.nome_pai;
    }

    public void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    public String getNome_mae() {
        return this.nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public String getEstado_civil() {
        return this.estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getCertidao_casamento() {
        return this.certidao_casamento;
    }

    public void setCertidao_casamento(String certidao_casamento) {
        this.certidao_casamento = certidao_casamento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCnh() {
        return this.cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getNumero_reservista() {
        return this.numero_reservista;
    }

    public void setNumero_reservista(String numero_reservista) {
        this.numero_reservista = numero_reservista;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getModo_trabalho() {
        return this.modo_trabalho;
    }

    public void setModo_trabalho(String modo_trabalho) {
        this.modo_trabalho = modo_trabalho;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTitulo_profissional() {
        return this.titulo_profissional;
    }

    public void setTitulo_profissional(String titulo_profissional) {
        this.titulo_profissional = titulo_profissional;
    }

    public String getRegistro_profissional() {
        return this.registro_profissional;
    }

    public void setRegistro_profissional(String registro_profissional) {
        this.registro_profissional = registro_profissional;
    }

    public Date getData_admissao() {
        return this.data_admissao;
    }

    public void setData_admissao(Date data_admissao) {
        this.data_admissao = data_admissao;
    }

    public Date getData_demissao() {
        return this.data_demissao;
    }

    public void setData_demissao(Date data_demissao) {
        this.data_demissao = data_demissao;
    }

    public String getPis() {
        return this.pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
