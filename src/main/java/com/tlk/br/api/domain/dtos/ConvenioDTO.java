package com.tlk.br.api.domain.dtos;

import lombok.Data;

@Data
public class ConvenioDTO {

    private Integer pk;
    private Boolean ativo;
    private String nome;
    private String nomeCurto;
}