package com.tlk.br.api.repositories;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tlk.br.api.domain.entitites.Agendamento;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    @Query("SELECT a FROM Agendamento a WHERE a.status = :status " +
           "AND a.dataHoraSala BETWEEN :start AND :end " +
           "ORDER BY a.dataHoraSala DESC")
    Agendamento findTopByStatusAndDataHoraSalaBetweenOrderByDataHoraSalaDesc(
            @Param("status") String status,
            @Param("start") Timestamp start,
            @Param("end") Timestamp end);

    @Query("SELECT a FROM Agendamento a WHERE a.status = :status " +
           "AND a.dataHoraSala BETWEEN :start AND :end " +
           "ORDER BY a.dataHoraSala DESC")
    List<Agendamento> findByStatusAndDataHoraSalaBetweenOrderByDataHoraSalaDesc(
            @Param("status") String status,
            @Param("start") Timestamp start,
            @Param("end") Timestamp end);
}
