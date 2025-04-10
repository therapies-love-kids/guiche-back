package com.tlk.br.api.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "convenio")
@Data
public class Convenio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk;

    @Column(nullable = false)
    private Boolean ativo = true;

    @Column(length = 64, nullable = false)
    private String nome;

    @Column(name = "nome_curto", length = 16, nullable = false)
    private String nomeCurto;
}