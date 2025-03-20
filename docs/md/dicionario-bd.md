# Banco de dados

## AGENDAMENTO

Gerencia agendamentos de atendimentos, vinculando pacientes, responsáveis, colaboradores e unidades.

### pk

- **Descrição:** Identificador único interno
- **Tipo:** SERIAL
- **Restrições:** PK
- **Exemplos:** `1`, `2`, `3`

### especialista_colaborador_id

- **Descrição:** Identificador do colaborador especialista
- **Tipo:** INTEGER
- **Restrições:** Not Null, FK (`COLABORADOR(id)`)
- **Exemplos:** `1`, `2`, `3`

### paciente_id

- **Descrição:** Identificador do paciente
- **Tipo:** INTEGER
- **Restrições:** Not Null, FK (`PACIENTE(id)`)
- **Exemplos:** `1`, `2`, `3`

### recepcionista_colaborador_id

- **Descrição:** Identificador do colaborador recepcionista
- **Tipo:** INTEGER
- **Restrições:** Not Null, FK (`COLABORADOR(id)`)
- **Exemplos:** `1`, `2`, `3`

### responsavel_id

- **Descrição:** Identificador do responsável
- **Tipo:** INTEGER
- **Restrições:** Not Null, FK (`RESPONSAVEL(id)`)
- **Exemplos:** `1`, `2`, `3`

### unidade_prefixo

- **Descrição:** Prefixo da unidade onde foi feito o agendamento
- **Tipo:** VARCHAR
- **Restrições:** Not Null, FK (`EMPRESA(unidade_prefixo)`)
- **Exemplos:** `'ANA'`, `'NER'`

### data_hora_criacao

- **Descrição:** Data e hora da criação do agendamento
- **Tipo:** TIMESTAMPTZ
- **Restrições:** Not Null
- **Exemplos:** `'2020-01-01 00:00:00'`, `'2020-01-01 12:00:00'`

### data_hora

- **Descrição:** Data e hora do agendamento
- **Tipo:** TIMESTAMPTZ
- **Restrições:** Not Null
- **Exemplos:** `'2020-01-01 00:00:00'`, `'2020-01-01 12:00:00'`

### sala

- **Descrição:** Sala onde o agendamento foi realizado
- **Tipo:** VARCHAR(16)
- **Restrições:** Not Null
- **Exemplos:** `'Sala A', 'Sala B'`, `'Sala C'`

### tipo

- **Descrição:** Tipo de agendamento
- **Tipo:** VARCHAR(16)
- **Restrições:** Not Null
- **Valores possíveis:** `'Consulta', 'Avaliação'`

### "status"

- **Descrição:** Status do agendamento
- **Tipo:** VARCHAR(16)
- **Restrições:** Not Null
- **Valores possíveis:** `'Agendado', 'Confirmado'`, `'Em espera'`, `'Concluído'`, `'Cancelado'`

### observacoes

- **Descrição:** Observações sobre o agendamento
- **Tipo:** TEXT
- **Restrições:** Not Null
- **Exemplos:** `'Segunda sessão avaliativa'`, `'Reavaliação'`

[TODO: ADICIONAR A SENHA!!!!!!!!!!!!!!!!!]

## COLABORADOR

Registra informações de profissionais associados à clínica, incluindo dados pessoais, profissionais e de endereço.

### pk

- **Descrição:** Identificador único interno
- **Tipo:** SERIAL
- **Restrições:** PK
- **Exemplos:** `1`, `2`, `3`

### id

- **Descrição:** Identificador público interno
- **Tipo:** SERIAL
- **Restrições:** Unique, Not Null
- **Exemplos:** `1`, `2`, `3`

### empresa_unidade_prefixo

- **Descrição:** Prefixo da unidade da empresa a qual o colaborador trabalha
- **Tipo:** VARCHAR(4)
- **Restrições:** Not Null, FK (`EMPRESA(unidade_prefixo)`)
- **Exemplos:** `'ANA'`, `'NER'`

### ativo

- **Descrição:** Define se o colaborador esta ativo
- **Tipo:** BOOLEAN
- **Restrições:** Not Null
- **Valores possíveis:** `true`, `false`

### nome

- **Descrição:** Nome completo do colaborador
- **Tipo:** VARCHAR(128)
- **Restrições:** Not Null
- **Exemplos:** `'Hugo Cauê José Caldeira'`, `'Rosângela Bianca Nina'`

### sexo

- **Descrição:** Sexo do colaborador
- **Tipo:** CHAR(1)
- **Restrições:** Not Null
- **Exemplos:** `'M'`, `'F'`

### data_nascimento

- **Descrição:** Data de nascimento do colaborador
- **Tipo:** DATE
- **Restrições:** Not Null
- **Exemplos:** `'1999-01-01'`, `'2000-02-02'`

### local_nascimento

- **Descrição:** Local de nascimento do colaborador
- **Tipo:** VARCHAR(128)
- **Restrições:** Not Null
- **Exemplos:** `'São Paulo, SP'`, `'Rio de Janeiro, RJ'`

### nome_pai

- **Descrição:** Nome do pai do colaborador
- **Tipo:** VARCHAR(128)
- **Restrições:** Not Null
- **Exemplos:** `'Hugo Cauê José Caldeira'`, `'Pedro Augusto da Silva Almeida'`

### nome_mae

- **Descrição:** Nome da mãe do colaborador
- **Tipo:** VARCHAR(128)
- **Restrições:** Not Null
- **Exemplos:** `'Rosângela Bianca Nina'`, `'Adriana Leticia Soares da Silva'`

### estado_civil

- **Descrição:** Estado civil do colaborador
- **Tipo:** VARCHAR(16)
- **Restrições:** Not Null
- **Valores possíveis:** `'Solteiro'`, `'Casado'`, `'Divorciado'`, `'Viuvo'`

### certidao_casamento

- **Descrição:** Certidão de casamento do colaborador
- **Tipo:** VARCHAR(32)
- **Restrições:** -
- **Exemplos:** `'12345678901234567890123456789012'`, `'6543210987654321098765432109876'`

### cpf

- **Descrição:** CPF do colaborador
- **Tipo:** VARCHAR(16)
- **Restrições:** Unique, Not Null
- **Exemplos:** `'54224683091'`, `'78996751030'`

### rg

- **Descrição:** RG do colaborador
- **Tipo:** VARCHAR(32)
- **Restrições:** Not Null
- **Exemplos:** `'407118299'`, `'225037786'`

### cnh

- **Descrição:** CNH do colaborador
- **Tipo:** VARCHAR(16)
- **Restrições:** Unique
- **Exemplos:** `'04439693700'`, `'56341562200'`

### numero_reservista

- **Descrição:** Número de reservista do colaborador
- **Tipo:** VARCHAR(8)
- **Restrições:** -
- **Exemplos:** `'123456'`, `'654321'`

### celular

- **Descrição:** Número de celular do colaborador
- **Tipo:** VARCHAR(16)
- **Restrições:** Unique, Not Null
- **Exemplos:** `'83998360600`, `'82982892190'`

### email

- **Descrição:** E-mail do colaborador
- **Tipo:** VARCHAR(128)
- **Restrições:** Unique, Not Null
- **Exemplos:** `'hugocaue@gmail.com'`, `'rosangelabiana@hotmail.com'`

### modo_trabalho

- **Descrição:** Modo de trabalho do colaborador
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'CLT'`, `'PJ'`

### cep

- **Descrição:** CEP de onde o colaborador mora
- **Tipo:** VARCHAR(8)
- **Restrições:** Not Null
- **Exemplos:** `'49096252'`

### uf

- **Descrição:** Unidade Federativa onde o colaborador mora
- **Tipo:** CHAR(2)
- **Restrições:** Not Null
- **Exemplos:** `'SP'`, `'RJ'`, `'MG'`

### cidade

- **Descrição:** Nome da cidade onde o colaborador mora
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'São Paulo'`, `'Rio de Janeiro'`

### bairro

- **Descrição:** Nome do bairro onde o colaborador mora
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'Centro'`, `'Copacabana'`

### logradouro

- **Descrição:** Nome da rua ou avenida onde o colaborador mora
- **Tipo:** VARCHAR(128)
- **Restrições:** Not Null
- **Exemplos:** `'Avenida Paulista'`, `'Rua da Praia'`

### numero

- **Descrição:** Número do endereço do colaborador.
- **Tipo:** VARCHAR(8)
- **Restrições:** Not Null
- **Exemplos:** `'100'`, `'2500'`

### complemento

- **Descrição:** Informações adicionais sobre o endereço (opcional).
- **Tipo:** VARCHAR(256)
- **Restrições:** Opcional
- **Exemplos:** `'Sala 101'`, `'Bloco B'`

### titulo_profissional

- **Descrição:** Titulo profissional do colaborador
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'Engenheiro'`, `'Médico'`

### registro_profissional

- **Descrição:** Registro profissional do colaborador
- **Tipo:** VARCHAR(64)
- **Restrições:** -
- **Exemplos:** `'123456'`, `'654321'`

### data_admissao

- **Descrição:** Data de admissão do colaborador
- **Tipo:** DATE
- **Restrições:** Not Null
- **Exemplos:** `'1999-01-01'`, `'2000-02-02'`

### data_demissao

- **Descrição:** Data de demissão do colaborador
- **Tipo:** DATE
- **Restrições:** -
- **Exemplos:** `'1999-01-01'`, `'2000-02-02'`

### pis

- **Descrição:** PIS do colaborador
- **Tipo:** VARCHAR(16)
- **Restrições:** Unique
- **Exemplos:** `'1234567890'`, `'9876543210'`

{TODO: Atualizar os exemplos (ou valores possíveis?) dos campos abaixo}

### setor

- **Descrição:** Setor do colaborador
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'TI'`, `'RH'`

### funcao

- **Descrição:** Função do colaborador
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'Engenheiro'`, `'Médico'`

### especialidade

- **Descrição:** Especialidade do colaborador
- **Tipo:** VARCHAR(64)
- **Restrições:** -
- **Exemplos:** `'Engenheiro'`, `'Médico'`

## CONTRATO

Registra contratos associados a responsáveis, pacientes e documentos.

### pk

- **Descrição:** Identificador único interno
- **Tipo:** SERIAL
- **Restrições:** PK
- **Exemplos:** `1`, `2`, `3`

### responsavel_id

- **Descrição:** Identificador do responsável
- **Tipo:** INTEGER
- **Restrições:** Not Null, FK (`RESPONSAVEL(id)`)
- **Exemplos:** `1`, `2`, `3`

### paciente_id

- **Descrição:** Identificador do paciente
- **Tipo:** INTEGER
- **Restrições:** Not Null, FK (`PACIENTE(id)`)
- **Exemplos:** `1`, `2`, `3`

### documento_pk

- **Descrição:** Identificador do documento
- **Tipo:** INTEGER
- **Restrições:** Not Null, FK (`DOCUMENTO(pk)`)
- **Exemplos:** `1`, `2`, `3`

### ativo

- **Descrição:** Define se o contrato está ativo
- **Tipo:** BOOLEAN
- **Restrições:** Not Null
- **Valores possíveis:** `true`, `false`

### data_hora_criacao

- **Descrição:** Data e hora da criação do contrato
- **Tipo:** TIMESTAMPTZ
- **Restrições:** Not Null
- **Exemplos:** `'2020-01-01 00:00:00'`, `'2020-01-01 12:00:00'`

### cep

- **Descrição:** CEP do endereço do contratante
- **Tipo:** VARCHAR(8)
- **Restrições:** Not Null
- **Exemplos:** `'12345678'`

### uf

- **Descrição:** UF do endereço do contratante
- **Tipo:** CHAR(2)
- **Restrições:** Not Null
- **Exemplos:** `'SP'`, `'RJ'`, `'MG'`

### cidade

- **Descrição:** Cidade do endereço do contratante
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'São Paulo'`, `'Rio de Janeiro'`, `'Belo Horizonte'`

### bairro

- **Descrição:** Bairro do endereço do contratante
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'Centro'`, `'Vila Nova'`, `'Copacabana'`

### logradouro

- **Descrição:** Logradouro do endereço do contratante
- **Tipo:** VARCHAR(128)
- **Restrições:** Not Null
- **Exemplos:** `'Avenida Brigadeiro Faria Lima'`, `'Rua das Laranjeiras'`, `'Avenida Paulista'`

### numero

- **Descrição:** Número do endereço do contratante
- **Tipo:** VARCHAR(8)
- **Restrições:** Not Null
- **Exemplos:** `'123'`, `'456'`, `'789'`

### complemento

- **Descrição:** Complemento do endereço do contratante
- **Tipo:** VARCHAR(256)
- **Restrições:** -
- **Exemplos:** `'Casa 1'`, `'Apartamento 2'`, `'Bloco A'`

## CONVENIO

Gerencia os convênios associados aos pacientes.

### pk

- **Descrição:** Identificador único
- **Tipo:** SERIAL
- **Restrições:** PK
- **Exemplos:** `1`, `2`, `3`

### ativo

- **Descrição:** Define se o convênio está ativo
- **Tipo:** BOOLEAN
- **Restrições:** Not Null
- **Valores possíveis:** `true`, `false`

### nome

- **Descrição:** Nome completo do convênio
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'Confederação Nacional das Cooperativas Médicas'`, `'Particular'`

### nome_curto

- **Descrição:** Nome encurtado do convênio
- **Tipo:** VARCHAR(16)
- **Restrições:** Not Null
- **Exemplos:** `'UNIMED'`, `'Particular'`

## DOCUMENTO

Armazena documentos digitais vinculados a pacientes por colaboradores.

### pk

- **Descrição:** Identificador único interno
- **Tipo:** SERIAL
- **Restrições:** PK
- **Exemplos:** `1`, `2`, `3`

### paciente_id

- **Descrição:** Identificador do paciente
- **Tipo:** INTEGER
- **Restrições:** Not Null, FK (`PACIENTE(id)`)
- **Exemplos:** `1`, `2`, `3`

### colaborador_id

- **Descrição:** Identificador do colaborador
- **Tipo:** INTEGER
- **Restrições:** Not Null, FK (`COLABORADOR(id)`)
- **Exemplos:** `1`, `2`, `3`

### ativo

- **Descrição:** Define se o documento está ativo
- **Tipo:** BOOLEAN
- **Restrições:** Not Null
- **Valores possíveis:** `true`, `false`

### data_hora_criacao

- **Descrição:** Data e hora da criação do documento
- **Tipo:** TIMESTAMPTZ
- **Restrições:** Not Null
- **Exemplos:** `'2020-01-01 00:00:00'`, `'2020-01-01 12:00:00'`

### tipo

- **Descrição:** Tipo de documento
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Valores possíveis:** `'Laudo'`, `'Contrato'`, `'Indicação'`

### caminho

- **Descrição:** Caminho do arquivo no sistema
- **Tipo:** VARCHAR(256)
- **Restrições:** Not Null
- **Exemplos:** `'Caminho/para/o/arquivo.pdf'`, `'Caminho/para/o/arquivo.docx'`

## EMPRESA

Armazena informações das empresas e de suas unidades, incluindo dados de localização, identificação e vínculo com seu diretor.

### pk

- **Descrição:** Identificador único interno
- **Tipo:** SERIAL
- **Restrições:** PK
- **Exemplos:** `1`, `2`, `3`

### id

- **Descrição:** Identificador público interno
- **Tipo:** SERIAL
- **Restrições:** Unique, Not Null
- **Exemplos:** `1`, `2`, `3`

### diretor_colaborador_id

- **Descrição:** Identificador interno do diretor da empresa
- **Tipo:** INTEGER
- **Restrições:** FK (`COLABORADOR(id)`)
- **Exemplos:** `1`, `2`, `3`

### ativo

- **Descrição:** Define se a empresa está ativa
- **Tipo:** BOOLEAN
- **Restrições:** Not Null
- **Valores possíveis:** `true`, `false`

### cnpj

- **Descrição:** CNPJ da empresa
- **Tipo:** VARCHAR(16)
- **Restrições:** Not Null
- **Exemplos:** `'30467841000174'`

### razao_social

- **Descrição:** Nome legal da empresa
- **Tipo:** VARCHAR(128)
- **Restrições:** Not Null
- **Exemplos:** `Tecnologia Inovadora Ltda.`

### nome_fantasia

- **Descrição:** Nome comercial da empresa
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'InovaTech'`

### cep

- **Descrição:** CEP da unidade da empresa
- **Tipo:** VARCHAR(8)
- **Restrições:** Not Null
- **Exemplos:** `'49096252'`

### uf

- **Descrição:** Unidade Federativa onde a unidade da empresa está localizada
- **Tipo:** CHAR(2)
- **Restrições:** Not Null
- **Exemplos:** `'GO'`, `'DF'`

### cidade

- **Descrição:** Nome da cidade onde a unidade da empresa está situada
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'Anápolis'`, `'Nerópolis'`

### bairro

- **Descrição:** Nome do bairro onde a unidade da empresa está localizada
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'Centro'`, `'Jundiaí'`

### logradouro

- **Descrição:** Nome da rua ou avenida onde a unidade da empresa está situada
- **Tipo:** VARCHAR(128)
- **Restrições:** Not Null
- **Exemplos:** `'Rua Manoel D'abadia'`, `'Rua José Neto Paranhos'`

### numero

- **Descrição:** Número do endereço da unidade da empresa
- **Tipo:** VARCHAR(8)
- **Restrições:** Not Null
- **Exemplos:** `'99'`, `'64'`

### complemento

- **Descrição:** Informações adicionais sobre o endereço
- **Tipo:** VARCHAR(256)
- **Restrições:** -
- **Exemplos:** `'Perto das Lojas Bazzar'`, `'Próximo ao posto Ipiranga'`

### unidade_nome

- **Descrição:** Nome completo da unidade da empresa
- **Tipo:** VARCHAR(32)
- **Restrições:** Unique, Not Null
- **Exemplos:** `'Anápolis'`, `'Nerópolis'`

### unidade_prefixo

- **Descrição:** Prefixo da unidade da empresa
- **Tipo:** VARCHAR(4)
- **Restrições:** Unique, Not Null
- **Exemplos:** `'ANA'`, `'NER'`

## LACO

Define o vínculo entre um paciente e um responsável.

### pk

- **Descrição:** Identificador único interno
- **Tipo:** SERIAL
- **Restrições:** PK
- **Exemplos:** `1`, `2`, `3`

### paciente_id

- **Descrição:** Identificador interno do paciente
- **Tipo:** INTEGER
- **Restrições:** Not Null, FK (`PACIENTE(id)`)
- **Exemplos:** `1`, `2`, `3`

### responsavel_id

- **Descrição:** Identificador interno do responsável
- **Tipo:** INTEGER
- **Restrições:** Not Null, FK (`RESPONSAVEL(id)`)
- **Exemplos:** `1`, `2`, `3`

### data_hora_criacao

- **Descrição:** Data e hora da criação do laço
- **Tipo:** TIMESTAMPTZ
- **Restrições:** Not Null
- **Exemplos:** `'2020-01-01 00:00:00'`, `'2020-01-01 12:00:00'`

### tipo

- **Descrição:** Tipo de laço
- **Tipo:** VARCHAR(16)
- **Restrições:** Not Null
- **Valores possíveis:** `'Pai', 'Mãe'`, `'Guardião', 'Tutor'`, `'Autorizado'`

## PACIENTE

Cadastro de pacientes com informações pessoais.

### pk

- **Descrição:** Identificador único interno
- **Tipo:** SERIAL
- **Restrições:** PK
- **Exemplos:** `1`, `2`, `3`

### id

- **Descrição:** Identificador público interno
- **Tipo:** SERIAL
- **Restrições:** Unique, Not Null
- **Exemplos:** `1`, `2`, `3`

### empresa_unidade_prefixo

- **Descrição:** Prefixo da unidade da empresa
- **Tipo:** VARCHAR
- **Restrições:** Not Null
- **Exemplos:** `'ANA'`, `'NER'`

### convenio_pk

- **Descrição:** Identificador do convênio associado ao paciente
- **Tipo:** INTEGER
- **Restrições:** Not Null
- **Exemplos:** `1`, `2`, `3`

### codigo

- **Descrição:** Código de identificação único do paciente
- **Tipo:** VARCHAR(64)
- **Restrições:** Unique, Not Null
- **Exemplos:** ANA001, NER002 {TODO: Padronizar}

### ativo

- **Descrição:** Status de atividade do paciente
- **Tipo:** BOOLEAN
- **Restrições:** Not Null
- **Valores possíveis:** `true`, `false`

### nome

- **Descrição:** Nome completo do paciente
- **Tipo:** VARCHAR(128)
- **Restrições:** Not Null
- **Exemplos:** `'João da Silva'`, `'Maria da Silva'`

### nome_curto

- **Descrição:** Nome curto único do paciente para identificação
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'João'`, `'Maria'`

### sexo

- **Descrição:** Sexo do paciente
- **Tipo:** CHAR(1)
- **Restrições:** Not Null
- **Exemplos:** `'M'`, `'F'`

### data_nascimento

- **Descrição:** Data de nascimento do paciente
- **Tipo:** DATE
- **Restrições:** Not Null
- **Exemplos:** `'1990-01-01'`, `'2000-01-01'`

### local_nascimento

- **Descrição:** Local de nascimento do paciente
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'Rio de Janeiro'`, `'São Paulo'`

### certidao_nascimento

- **Descrição:** Certidão de nascimento do paciente
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'1480140155201012421405051234821'`, `'27359601552014171620020505822312'`

### cpf

- **Descrição:** CPF do paciente
- **Tipo:** VARCHAR(11)
- **Restrições:** Unique, Not Null
- **Exemplos:** `'12345678901'`, `'98765432100'`

### numero_convenio

- **Descrição:** Número de identificação do convênio do paciente
- **Tipo:** VARCHAR(32)
- **Restrições:** Not Null
- **Exemplos:** `'552019'`, `'17832201'`

## PAGAMENTO

Registra transações financeiras associadas a responsáveis.

### pk

- **Descrição:** Identificador único interno
- **Tipo:** SERIAL
- **Restrições:** PK
- **Exemplos:** `1`, `2`, `3`

### responsavel_id

- **Descrição:** Identificador do responsável
- **Tipo:** INTEGER
- **Restrições:** Not Null, FK (`RESPONSAVEL(id)`)
- **Exemplos:** `1`, `2`, `3`

### valor

- **Descrição:** Valor da transação
- **Tipo:** NUMERIC(10,2)
- **Restrições:** Not Null
- **Exemplos:** `100.00`, `50.00`

### tipo

- **Descrição:** Tipo de transação
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Valores possíveis:** `'Avaliação'`, `'Consulta'`

### descricao

- **Descrição:** Descrição da transação
- **Tipo:** TEXT
- **Restrições:** Not Null
- **Exemplos:** `'Pagamento da avaliação do paciente X'`, `'Pagamento da consulta do paciente Y'`

## RESPONSAVEL

Registra responsáveis de pacientes (pais, tutores, etc.).

### pk

- **Descrição:** Identificador único interno
- **Tipo:** SERIAL
- **Restrições:** PK
- **Exemplos:** `1`, `2`, `3`

### id

- **Descrição:** Identificador público interno
- **Tipo:** SERIAL
- **Restrições:** Unique, Not Null
- **Exemplos:** `1`, `2`, `3`

### ativo

- **Descrição:** Status de atividade do responsável
- **Tipo:** BOOLEAN
- **Restrições:** Not Null
- **Valores possíveis:** `true`, `false`

### nome

- **Descrição:** Nome completo do responsável
- **Tipo:** VARCHAR(128)
- **Restrições:** Not Null
- **Exemplos:** `'João da Silva'`, `'Maria da Silva'`

### estado_civil

- **Descrição:** Estado civil do responsável
- **Tipo:** VARCHAR(16)
- **Restrições:** Not Null
- **Valores possíveis:** `'Solteiro'`, `'Casado'`, `'Divorciado'`, `'Viuvo'`

### profissao

- **Descrição:** Profissão do responsável
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'Médico'`, `'Engenheiro'`

### cpf

- **Descrição:** CPF do responsável
- **Tipo:** VARCHAR(11)
- **Restrições:** Unique, Not Null
- **Exemplos:** `'12345678901'`, `'98765432100'`

### rg

- **Descrição:** RG do responsável
- **Tipo:** VARCHAR(32)
- **Restrições:** Unique, Not Null
- **Exemplos:** `'365549320'`, `'320541605'`

### celular

- **Descrição:** Número de celular do responsável
- **Tipo:** VARCHAR(16)
- **Restrições:** Unique, Not Null
- **Exemplos:** `'11999999999'`, `'11988888888'`

### email

- **Descrição:** E-mail do responsável
- **Tipo:** VARCHAR(64)
- **Restrições:** Unique, Not Null
- **Exemplos:** `'joao@ex.com'`, `'maria@ex.com'`

### contatos_extras

- **Descrição:** Outros contatos do responsável
- **Tipo:** TEXT
- **Restrições:** -
- **Exemplos:** `'Telefone fixo: 22999999999'`, `'Segundo e-mail: joao2@ex.com'`

## USUARIO

Armazena credenciais e perfis de acesso ao sistema para colaboradores.

### pk

- **Descrição:** Identificador único interno
- **Tipo:** SERIAL
- **Restrições:** PK
- **Exemplos:** `1`, `2`, `3`

### id

- **Descrição:** Identificador público interno
- **Tipo:** SERIAL
- **Restrições:** Unique, Not Null
- **Exemplos:** `1`, `2`, `3`

### colaborador_id

- **Descrição:** Identificador do colaborador associado ao usuário
- **Tipo:** INTEGER
- **Restrições:** FK (`COLABORADOR(id)`)
- **Exemplos:** `1`, `2`, `3`

### ativo

- **Descrição:** Define se o usuário está ativo
- **Tipo:** BOOLEAN
- **Restrições:** Not Null
- **Valores possíveis:** `true`, `false`

### online

- **Descrição:** Define se o usuário está online
- **Tipo:** BOOLEAN
- **Restrições:** Not Null
- **Valores possíveis:** `true`, `false`

### nome

- **Descrição:** Nome de acesso ao sistema
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'hugo'`, `'rosangela'`

### senha

- **Descrição:** Senha de acesso ao sistema
- **Tipo:** VARCHAR(128)
- **Restrições:** Not Null
- **Exemplos:** `'123456'`, `'654321'`

### nome_computador

- **Descrição:** Nome do computador utilizado pelo usuário
- **Tipo:** VARCHAR(64)
- **Restrições:** Not Null
- **Exemplos:** `'PC1'`, `'PC2'`

### perfil

- **Descrição:** Perfil de acesso ao sistema
- **Tipo:** VARCHAR(16)
- **Restrições:** Not Null
- **Valores possíveis:** {TODO}

## CAMINHO

Endereços que podem ser acessados pelo usuário.

### pk

- **Descrição:** Identificador único interno
- **Tipo:** SERIAL  
- **Restrições:** PK
- **Exemplos:** `1`, `2`, `3`

### usuario_id

- **Descrição:** Identificador do usuário associado ao caminho
- **Tipo:** INTEGER
- **Restrições:** ID (`USUARIO(id)`)
- **Exemplos:** `1`, `2`, `3`

### data_hora_criacao

- **Descrição:** Data e hora da criação do acesso ao caminho
- **Tipo:** TIMESTAMPTZ
- **Restrições:** Not Null
- **Exemplos:** `'2020-01-01 00:00:00'`, `'2020-01-01 12:00:00'`

### ativo

- **Descrição:** Define se o acesso ao caminho esta ativo
- **Tipo:** BOOLEAN
- **Restrições:** Not Null
- **Valores possíveis:** `true`, `false`

### caminho

- **Descrição:** Caminho completo
- **Tipo:** VARCHAR(256)
- **Restrições:** Not Null
- **Exemplos:** `'AnaCentro_Agendamento'`, `'AnaCentro_Consulta'`

### editavel

- **Descrição:** Define se o caminho pode ser editado pelo usuário
- **Tipo:** BOOLEAN
- **Restrições:** Not Null
- **Valores possíveis:** `true`, `false`

### leitura

- **Descrição:** Define se o caminho pode ser lido pelo usuário
- **Tipo:** BOOLEAN
- **Restrições:** Not Null
- **Valores possíveis:** `true`, `false`