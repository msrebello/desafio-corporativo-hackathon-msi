CREATE TABLE empresa
(
    id_empresa BIGINT AUTO_INCREMENT NOT NULL,
    nome       VARCHAR(255) NOT NULL,
    CONSTRAINT pk_empresa PRIMARY KEY (id_empresa)
);

CREATE TABLE funcionario
(
    id_funcionario   BIGINT AUTO_INCREMENT NOT NULL,
    id_empresa       BIGINT,
    nome_funcionario varchar(100) NOT NULL,
    data_admissao    datetime,
    CONSTRAINT pk_funcionario PRIMARY KEY (id_funcionario),
    CONSTRAINT fk_empresa_id foreign key (id_empresa)
    references empresa (id_empresa)
);

CREATE TABLE obra
(
    id_obra   BIGINT AUTO_INCREMENT NOT NULL,
    descricao varchar(250),
    CONSTRAINT pk_obra PRIMARY KEY (id_obra)
);

CREATE TABLE presenca
(
    id_presenca    BIGINT AUTO_INCREMENT NOT NULL,
    id_obra        BIGINT,
    id_funcionario BIGINT,
    data_presenca  date,
    CONSTRAINT pk_presenca_id PRIMARY KEY (id_presenca),
    CONSTRAINT fk_obra_id foreign key (id_obra)
    references obra (id_obra),
    CONSTRAINT fk_funcionario_id foreign key (id_funcionario)
    references funcionario (id_funcionario)
);