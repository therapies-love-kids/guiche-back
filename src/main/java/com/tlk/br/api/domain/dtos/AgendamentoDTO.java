package com.tlk.br.api.domain.dtos;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class AgendamentoDTO {

    private Long pk;
    private Long especialistaColaboradorId;
    private Long pacienteId;
    private Long recepcionistaColaboradorId;
    private Long responsavelId;
    private String unidadePrefixo;
    private Timestamp dataHoraCriacao;
    private Timestamp dataHora;
    private String sala;
    private String tipo;
    private String status;
    private String observacoes;
}