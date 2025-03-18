inicio
  paciente.pré-cadastramento // fora do escopo
  agendamento.criação // fora do escopo
  agendamento.confirmação
  se agendamento.confirmado
    agendamento.espera
    agendamento.concluido
    se agendamento.tipo = 'avaliação' && avaliador.especialidade = 'avaliação terapêutica'
      avaliador.faz-indicacao
      agendamento.pagamento // fora do escopo
      paciente.cadastramento // fora do escopo
      paciente.contratação // fora do escopo
  senão
    agendamento.cancelado
fim