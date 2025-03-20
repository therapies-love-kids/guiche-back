-- 1 Quais empresas estão ativas e quem são seus diretores?
SELECT e.razao_social, c.nome AS diretor
FROM EMPRESA e
JOIN COLABORADOR c ON e.diretor_colaborador_id = c.id
WHERE e.ativo = true;

-- 2 Quantos colaboradores existem por unidade?
SELECT empresa_unidade_prefixo, COUNT(*) AS total_colaboradores
FROM COLABORADOR
WHERE ativo = true
GROUP BY empresa_unidade_prefixo;

-- 3 Quais pacientes possuem um determinado convênio?
SELECT p.nome, c.nome AS convenio
FROM PACIENTE p
JOIN CONVENIO c ON p.convenio_pk = c.pk
WHERE c.nome_curto = '<Convenio>';

-- 4 Quais são os agendamentos para hoje?
SELECT a.data_hora, p.nome AS paciente, c.nome AS especialista
FROM AGENDAMENTO a
JOIN PACIENTE p ON a.paciente_id = p.id
JOIN COLABORADOR c ON a.especialista_colaborador_id = c.id
WHERE DATE(a.data_hora) = CURRENT_DATE;

-- 5 Qual o total de pagamentos por responsável?
SELECT r.nome, SUM(pg.valor) AS total_pago
FROM PAGAMENTO pg
JOIN RESPONSAVEL r ON pg.responsavel_id = r.id
GROUP BY r.nome;

-- 6 Quais documentos de anamnese existem para um paciente?
SELECT tipo, caminho FROM DOCUMENTO
WHERE paciente_id = <paciente_id> AND tipo = 'Anamnese';

-- 7 Quais contratos ativos possuem documentos associados?
SELECT ct.*, d.caminho
FROM CONTRATO ct
JOIN DOCUMENTO d ON ct.documento_pk = d.pk
WHERE ct.ativo = true;

-- 8 Qual a média de valor dos pagamentos por tipo?
SELECT tipo, AVG(valor) AS media_valor
FROM PAGAMENTO
GROUP BY tipo;

-- 9 Quais responsáveis possuem mais de um paciente vinculado?
SELECT r.nome, COUNT(l.paciente_id) AS total_pacientes
FROM LACO l
JOIN RESPONSAVEL r ON l.responsavel_id = r.id
GROUP BY r.nome
HAVING COUNT(l.paciente_id) > 1;

-- 10 Quais colaboradores foram admitidos no último ano?
SELECT nome, data_admissao
FROM COLABORADOR
WHERE data_admissao >= CURRENT_DATE - INTERVAL '1 year';

-- 11 Quais pacientes não possuem documentos cadastrados?
SELECT p.nome
FROM PACIENTE p
LEFT JOIN DOCUMENTO d ON p.id = d.paciente_id
WHERE d.pk IS NULL;

-- 12 Quais usuários estão online no momento?
SELECT u.nome, c.nome AS colaborador
FROM USUARIO u
JOIN COLABORADOR c ON u.colaborador_id = c.id
WHERE u.online = true;

-- 13 Quais agendamentos foram cancelados?
SELECT p.nome AS paciente, a.data_hora
FROM AGENDAMENTO a
JOIN PACIENTE p ON a.paciente_id = p.id
WHERE a.status = 'Cancelado';

-- 14 Qual o endereço completo dos pacientes?
SELECT nome, logradouro||', '||numero||' - '||bairro||', '||cidade AS endereco
FROM PACIENTE;

-- 15 Quais convênios são mais utilizados pelos pacientes?
SELECT c.nome, COUNT(p.pk) AS total_pacientes
FROM PACIENTE p
JOIN CONVENIO c ON p.convenio_pk = c.pk
GROUP BY c.nome
ORDER BY total_pacientes DESC;

-- 16 Quantos colaboradores existem por função?
SELECT funcao, COUNT(*) AS total
FROM COLABORADOR
GROUP BY funcao;

-- 17 Quais responsáveis não realizaram pagamentos?
SELECT r.nome
FROM RESPONSAVEL r
LEFT JOIN PAGAMENTO p ON r.id = p.responsavel_id
WHERE p.pk IS NULL;

-- 18 Quantos documentos existem por tipo?
SELECT tipo, COUNT(*) AS total
FROM DOCUMENTO
GROUP BY tipo;

-- 19 Quantos pacientes existem por estado civil do responsável?
SELECT r.estado_civil, COUNT(p.id) AS total_pacientes
FROM LACO l
JOIN RESPONSAVEL r ON l.responsavel_id = r.id
JOIN PACIENTE p ON l.paciente_id = p.id
GROUP BY r.estado_civil;

-- 20 Quais são os horários de agendamento por especialista?
SELECT c.nome, a.data_hora
FROM AGENDAMENTO a
JOIN COLABORADOR c ON a.especialista_colaborador_id = c.id
ORDER BY c.nome, a.data_hora;

-- 21 Quais colaboradores foram demitidos em determinado ano?
SELECT nome, data_demissao
FROM COLABORADOR
WHERE EXTRACT(YEAR FROM data_demissao) = <ano>;

-- 22 Quais pacientes possuem múltiplos responsáveis?
SELECT p.nome, COUNT(l.responsavel_id) AS total_responsaveis
FROM LACO l
JOIN PACIENTE p ON l.paciente_id = p.id
GROUP BY p.nome
HAVING COUNT(l.responsavel_id) > 1;

-- 23 Qual o valor total recebido por mês?
SELECT TO_CHAR(data_hora_criacao, 'YYYY-MM') AS mes, SUM(valor) AS total
FROM PAGAMENTO
GROUP BY mes
ORDER BY mes;

-- 24 Quantas unidades existem por estado?
SELECT uf, COUNT(*) AS total_unidades
FROM EMPRESA
GROUP BY uf;

-- 25 Quantos agendamentos existem por tipo e status?
SELECT tipo, status, COUNT(*) AS total
FROM AGENDAMENTO
GROUP BY tipo, status;

-- 26 Quais colaboradores possuem perfil de administrador?
SELECT c.nome, u.perfil
FROM USUARIO u
JOIN COLABORADOR c ON u.colaborador_id = c.id
WHERE u.perfil = 'ADMIN';

-- 27 Quais pacientes nasceram após determinado ano?
SELECT nome, data_nascimento
FROM PACIENTE
WHERE EXTRACT(YEAR FROM data_nascimento) > <ano>;

-- 28 Quais documentos estão inativos?
SELECT tipo, caminho
FROM DOCUMENTO
WHERE ativo = false;

-- 29 Quantos responsáveis existem por cidade?
SELECT cidade, COUNT(*) AS total
FROM RESPONSAVEL
GROUP BY cidade;

-- 30 Qual o histórico de funções dos colaboradores?
SELECT nome, funcao, data_admissao, data_demissao
FROM COLABORADOR
ORDER BY data_admissao;

-- 31 Quais convênios não possuem pacientes vinculados?
SELECT c.nome
FROM CONVENIO c
LEFT JOIN PACIENTE p ON c.pk = p.convenio_pk
WHERE p.pk IS NULL;

-- 32 Quais pagamentos em dinheiro foram acima de determinado valor?
SELECT * FROM PAGAMENTO
WHERE tipo = 'Dinheiro' AND valor > <valor>;

-- 33 Quais pacientes não possuem responsáveis cadastrados?
SELECT p.nome
FROM PACIENTE p
LEFT JOIN LACO l ON p.id = l.paciente_id
WHERE l.pk IS NULL;

-- 34 Quais colaboradores possuem usuários cadastrados?
SELECT c.nome, u.nome AS usuario
FROM COLABORADOR c
JOIN USUARIO u ON c.id = u.colaborador_id;

-- 35 Quantos agendamentos existem por sala?
SELECT sala, COUNT(*) AS total_agendamentos
FROM AGENDAMENTO
GROUP BY sala;

-- 36 Existem CPFs duplicados de responsáveis?
SELECT cpf, COUNT(*) AS duplicados
FROM RESPONSAVEL
GROUP BY cpf
HAVING COUNT(*) > 1;

-- 37 Qual a média de idade dos pacientes?
SELECT AVG(EXTRACT(YEAR FROM AGE(data_nascimento))) AS media_idade
FROM PACIENTE;

-- 38 Quantos colaboradores existem por sexo?
SELECT sexo, COUNT(*) AS total
FROM COLABORADOR
GROUP BY sexo;

-- 39 Quais os últimos 10 contratos criados?
SELECT * FROM CONTRATO
ORDER BY data_hora_criacao DESC
LIMIT 10;

-- 40 Quantos documentos existem por paciente?
SELECT p.nome, COUNT(d.pk) AS total_documentos
FROM PACIENTE p
LEFT JOIN DOCUMENTO d ON p.id = d.paciente_id
GROUP BY p.nome;

-- 41 Qual o horário com mais agendamentos?
SELECT EXTRACT(HOUR FROM data_hora) AS hora, COUNT(*) AS total
FROM AGENDAMENTO
GROUP BY hora
ORDER BY total DESC
LIMIT 1;

-- 42 Quais pacientes possuem observações cadastradas?
SELECT nome, observacoes
FROM PACIENTE
WHERE observacoes IS NOT NULL;

-- 43 Quais colaboradores possuem registro profissional?
SELECT nome, registro_profissional
FROM COLABORADOR
WHERE registro_profissional IS NOT NULL;

-- 44 Quais convênios possuem nome curto?
SELECT nome, nome_curto
FROM CONVENIO
WHERE LENGTH(nome_curto) < <tamanho>;

-- 45 Quais agendamentos não possuem recepcionista definido?
SELECT * FROM AGENDAMENTO
WHERE recepcionista_colaborador_id IS NULL;

-- 46 Qual o endereço completo das unidades da empresa?
SELECT unidade_nome||' - '||logradouro||', '||numero||', '||bairro||', '||cidade||'-'||uf AS endereco_completo
FROM EMPRESA;

-- 47 Como obter os dados do paciente associado a um contrato específico?
SELECT p.*
FROM
    paciente p
JOIN
    contrato c ON p.id = c.paciente_id
WHERE
    c.pk = <pk_do_contrato>;
    
-- 48 Qual o responsável associado a um determinado paciente?
SELECT
    r.*
FROM
    laco l
JOIN
    responsavel r ON l.responsavel_id = r.id
WHERE
    l.paciente_id = <id_do_paciente>;

-- 49 Qual o nome curto do convênio utilizado por um paciente com base em seu código?
select c.nome_curto from convenio c where c.pk = (SELECT convenio_pk FROM paciente WHERE id = '<id_do_paciente>');

-- 50 Como listar todos os documentos relacionados a contratos de um determinado paciente?
SELECT d.* FROM documento d
JOIN paciente p ON d.paciente_id = p.id where p.id = '<id_do_paciente>';

-- 51 Como encontrar os responsáveis de um paciente por meio do laço?
SELECT r.* FROM laco l 
JOIN responsavel r ON l.responsavel_id = r.id
WHERE l.paciente_id = '<id_do_paciente>';


-- 52 Como obter todos os pagamentos associados a um determinado paciente, considerando os responsáveis vinculados?
SELECT p.* FROM pagamento p
JOIN laco l  ON p.responsavel_id = l.responsavel_id
WHERE l.paciente_id = '<id_do_paciente>';

-- 53 Qual o status atual de um agendamento baseado no paciente e no colaborador?
SELECT a.* FROM agendamento a
JOIN colaborador c ON a.recepcionista_colaborador_id = c.id
WHERE a.paciente_id = '<id_do_paciente>' AND c.id = '<id_do_colaborador>';


-- 54 Como identificar todos os colaboradores de uma unidade específica de uma empresa?
SELECT c.* FROM colaborador c
JOIN empresa u ON c.empresa_unidade_prefixo = u.unidade_prefixo 
WHERE u.unidade_prefixo = '<prefixo_da_unidade/empresa>';

-- 55 Quais agendamentos foram conduzidos por colaboradores que atuam em uma unidade específica de uma empresa?
SELECT a.* FROM agendamento a
JOIN colaborador c ON a.recepcionista_colaborador_id = c.id
JOIN empresa u ON c.empresa_unidade_prefixo = u.unidade_prefixo 
WHERE u.unidade_prefixo = '<prefixo_da_unidade/empresa>';

-- 56 Como verificar os dados da empresa associada a um agendamento especificado?
SELECT e.* FROM agendamento a
JOIN colaborador c ON a.recepcionista_colaborador_id = c.id 
JOIN empresa e ON c.empresa_unidade_prefixo = e.unidade_prefixo 
WHERE a.pk = '<pk_do_agendamento>';

-- 57 Quais contratos estão associados a uma determinada cidade ou bairro?
SELECT * FROM contrato WHERE
cidade = '<Cidade>' AND bairro = '<Bairro>';

-- 58 Qual o endereço completo dos responsáveis de um determinado paciente?
SELECT
    r.nome AS responsavel_nome,
    r.cpf AS responsavel_cpf,
    c.logradouro,
    c.numero,
    c.complemento,
    c.bairro,
    c.cidade,
    c.uf,
    c.cep
FROM
    laco l JOIN responsavel r 
ON
    l.responsavel_id = r.id JOIN contrato c
ON
    c.responsavel_id = r.id
WHERE
    l.paciente_id = '<id_do_paciente>'
    AND c.ativo = TRUE;

-- 59 Quais pastas estão atribuidas a um determinado usuário?
SELECT * FROM caminho WHERE responsavel_id = '<id_do_responsavel>';

-- 60 Listagem de todas as pastas sem repetições
SELECT DISTINCT caminho FROM caminho;