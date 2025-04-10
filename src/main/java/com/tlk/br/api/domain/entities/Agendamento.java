package com.tlk.br.api.domain.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;

@Entity
@Table(name = "agendamento")
@Data
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;

    @Column(name = "especialista_colaborador_id", nullable = false)
    private Long especialistaColaboradorId;

    @Column(name = "paciente_id", nullable = false)
    private Long pacienteId;

    @Column(name = "recepcionista_colaborador_id")
    private Long recepcionistaColaboradorId;

    @Column(name = "responsavel_id")
    private Long responsavelId;

    @Column(name = "unidade_prefixo", nullable = false)
    private String unidadePrefixo;

    @Column(name = "data_hora_criacao", nullable = false)
    private Timestamp dataHoraCriacao = new Timestamp(System.currentTimeMillis());

    @Column(name = "data_hora", nullable = false)
    private Timestamp dataHora;

    @Column(length = 16)
    private String sala;

    @Column(length = 64)
    private String tipo;

    @Column(length = 16, nullable = false)
    private String status = "em_espera";

    @Column
    private String observacoes;
}