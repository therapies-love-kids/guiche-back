## AGENDAMENTO

- id SERIAL PRIMARY KEY
- unidade_codigo VARCHAR(8)
- tipo VARCHAR(64)
- status VARCHAR(16)
- data_hora_inicio TIMESTAMPTZ
- data_hora_fim TIMESTAMPTZ
- observacao TEXT
- paciente_codigo VARCHAR REFERENCES PACIENTE(codigo)
- responsavel_codigo VARCHAR REFERENCES RESPONSAVEL(codigo)
- especialista_colaborador_codigo VARCHAR REFERENCES COLABORADOR(codigo)
- recepcionista_colaborador_codigo VARCHAR REFERENCES COLABORADOR(codigo)
- sala VARCHAR(16)

## AVALIACAO

- id SERIAL PRIMARY KEY
- paciente_codigo VARCHAR REFERENCES PACIENTE(codigo)
- colaborador_codigo VARCHAR REFERENCES COLABORADOR(codigo)
- data_hora_inicio TIMESTAMPTZ
- data_hora_fim TIMESTAMPTZ
- status VARCHAR(32)
- anotacoes TEXT

## COLABORADOR

- id SERIAL PRIMARY KEY
- ativo BOOLEAN
- modo_trabalho VARCHAR(64)
- formacao VARCHAR(64)
- empresa_unidade_codigo VARCHAR REFERENCES EMPRESA(unidade_codigo)
- codigo VARCHAR(32) UNIQUE
- registro_profissional VARCHAR
- nome VARCHAR(128)
- cpf VARCHAR(11) UNIQUE
- tipo VARCHAR(64)
- funcao VARCHAR(64)
- especialidade VARCHAR(64)
- perfil VARCHAR(64)
- codigo_computador VARCHAR(64)
- email VARCHAR(128) UNIQUE
- usuario VARCHAR(64)
- senha VARCHAR(128)

## CONTRATO

- id SERIAL PRIMARY KEY
- data_hora_criacao TIMESTAMPTZ
- ativo BOOLEAN
- responsavel_codigo VARCHAR REFERENCES RESPONSAVEL(codigo)
- paciente_codigo VARCHAR REFERENCES PACIENTE(codigo)
- documento_id INTEGER REFERENCES DOCUMENTO(id)
- cep VARCHAR(8)
- uf CHAR(2)
- cidade VARCHAR(64)
- bairro VARCHAR(64)
- logradouro VARCHAR(128)
- numero INTEGER
- complemento VARCHAR(256)

## CONVENIO

- id SERIAL PRIMARY KEY
- nome VARCHAR(64)
- nome_curto VARCHAR(16)
- ativo BOOLEAN

## DOCUMENTO

- id SERIAL PRIMARY KEY
- data_hora_criacao TIMESTAMPTZ
- ativo BOOLEAN
- tipo VARCHAR(64)
- caminho VARCHAR(256)
- paciente_codigo VARCHAR REFERENCES PACIENTE(codigo)
- colaborador_codigo VARCHAR REFERENCES COLABORADOR(codigo)

## EMPRESA

- id SERIAL PRIMARY KEY
- unidade_codigo VARCHAR(3)
- unidade_nome VARCHAR(64)
- nome_fantasia VARCHAR(64)
- razao_social VARCHAR(128)
- status BOOLEAN
- cep VARCHAR(8)
- uf CHAR(2)
- cidade VARCHAR(64)
- bairro VARCHAR(64)
- logradouro VARCHAR(128)
- cnpj VARCHAR(14) UNIQUE
- fone VARCHAR(15) UNIQUE
- email VARCHAR(64)
- diretor_colaborador_codigo VARCHAR REFERENCES COLABORADOR(codigo)

## PACIENTE

- id SERIAL PRIMARY KEY
- ativo BOOLEAN
- empresa_unidade_codigo VARCHAR REFERENCES EMPRESA(unidade_codigo)
- codigo VARCHAR(64) UNIQUE
- nome VARCHAR(256)
- nome_curto VARCHAR(64)
- sexo CHAR(1)
- data_nascimento DATE
- local_nascimento VARCHAR(64)
- certidao_nascimento VARCHAR
- cpf VARCHAR(11) UNIQUE
- convenio_id VARCHAR REFERENCES CONVENIO(id)
- numero_convenio VARCHAR(16)
- observacoes TEXT

## PAGAMENTO

- id SERIAL PRIMARY KEY
- data_hora_criacao TIMESTAMPTZ
- responsavel_codigo VARCHAR REFERENCES RESPONSAVEL(codigo)
- valor NUMERIC(10, 2)
- tipo VARCHAR(64)
- descricao TEXT

## RESPONSAVEL

- id SERIAL PRIMARY KEY
- codigo VARCHAR(64) UNIQUE
- ativo BOOLEAN
- nome VARCHAR(128)
- estado_civil VARCHAR(64)
- profissao VARCHAR(64)
- cpf VARCHAR(11) UNIQUE
- rg VARCHAR(20) UNIQUE
- celular VARCHAR(15) UNIQUE
- email VARCHAR(64) UNIQUE
- contatos_extras TEXT

## VINCULO

- id SERIAL PRIMARY KEY
- data_hora_criacao TIMESTAMPTZ
- paciente_codigo VARCHAR REFERENCES PACIENTE(codigo)
- responsavel_codigo VARCHAR REFERENCES RESPONSAVEL(codigo)
- tipo VARCHAR(16)