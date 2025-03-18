# Entidades

## Entidades possíveis

### Pessoas

- Paciente não-vinculado
- Paciente vinculado
- Pai
- Mãe
- Guardião
- Autorizado
- Recepcionista
- Ortopedista
- Neuropediatra
- Neuropsicóloga
- Fonoaudiólogo*
- Avaliador terapêutico
- Médico externo

### Processos

- Avaliação ortopédica
- Avaliação neuropediátrica
- Avaliação neuropsicológica
- Avaliação fonoaudiólogica*
- Avaliação terapêutica
- Sessão ortopédica
- Sessão neuropediátrica
- Sessão neuropsicológica
- Sessão fonoaudiólogica*
- Sessão terapêutica

### Documentos

- Ficha
- Contrato
- Diagnóstico interno
- Diagnóstico externo
- Indicação terapêutica

### Ações que não são ações (???)

- Agendamento
- Pagamento

## Média

- Paciente (Dados do pai e da mãe estão dentro da entidade, existe um atributo para definir se o contratante é o pai, mãe ou outros)
- Contratante (Criado apenas se o contratante não forem nem o pai ou mãe)
- Autorizado(Inclui parentesco e a Id do paciente)
- Funcionário(Definidos por tipo)
- Avaliação(inclui datahora início e fim, vinculado ao avaliador e ao paciente)
- Documento ( registro de documentos, fichas, contratos e diagnósticos(exames))
- Agendamento(possui dois ids de funcionários, um para o avaliador e outro para o responsável do agendamento, possui status)
- Pagamento(vinculado ao id do funcionário e ao CPF do pagante)
