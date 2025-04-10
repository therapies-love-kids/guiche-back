package com.tlk.br.api.repositories;

import com.tlk.br.api.domain.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    // Agendamentos atuais (não finalizados)
    @Query("SELECT a FROM Agendamento a WHERE a.especialistaColaboradorId = :especialistaColaboradorId AND a.status != 'finalizado'")
    List<Agendamento> findCurrentAgendamentosByEspecialistaColaboradorId(Long especialistaColaboradorId);

    // Agendamentos anteriores (finalizados)
    @Query("SELECT a FROM Agendamento a WHERE a.especialistaColaboradorId = :especialistaColaboradorId AND a.status = 'finalizado'")
    List<Agendamento> findPreviousAgendamentosByEspecialistaColaboradorId(Long especialistaColaboradorId);

    // Agendamentos em espera
    @Query("SELECT a FROM Agendamento a WHERE a.status = 'em_espera'")
    List<Agendamento> findWaitingAgendamentos();

    // Agendamentos por data e colaborador
    @Query("SELECT a FROM Agendamento a WHERE a.especialistaColaboradorId = :especialistaColaboradorId AND DATE(a.dataHora) = DATE(:data)")
    List<Agendamento> findByEspecialistaColaboradorIdAndData(Long especialistaColaboradorId, Timestamp data);

    // Agendamentos em atendimento
    @Query("SELECT a FROM Agendamento a WHERE a.status = 'em_atendimento'")
    List<Agendamento> findAllAgendamentosEmAtendimento();

    // Agendamentos por unidade prefixo
    List<Agendamento> findByUnidadePrefixo(String unidadePrefixo);
}