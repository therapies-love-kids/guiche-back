package com.tlk.br.api.repositories;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tlk.br.api.domain.entities.Agendamento;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
       List<Agendamento> findByStatusAndDataHoraSalaBetweenOrderByDataHoraSalaDesc(
              String status, Timestamp start, Timestamp end);
  
      List<Agendamento> findByStatusAndDataHoraSalaBetweenOrderByDataHoraSalaAsc(
              String status, Timestamp start, Timestamp end);
  
      List<Agendamento> findByStatusAndEspecialistaColaboradorIdAndDataHoraSalaBetweenOrderByDataHoraSalaDesc(
              String status, Long especialistaColaboradorId, Timestamp start, Timestamp end);
  
      // Novo método para buscar agendamentos por colaborador e data específica
      @Query("SELECT a FROM Agendamento a WHERE a.especialistaColaboradorId = :colaboradorId " +
             "AND DATE(a.dataHoraSala) = DATE(:data) " +
             "ORDER BY a.dataHoraSala DESC")
      List<Agendamento> findByEspecialistaColaboradorIdAndDataHoraSalaDate(
              @Param("colaboradorId") Long colaboradorId,
              @Param("data") Timestamp data);

      List<Agendamento> findByStatus(String string);
}
