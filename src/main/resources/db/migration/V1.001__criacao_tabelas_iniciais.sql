CREATE TABLE Empresa (
             idEmpresa BIGINT AUTO_INCREMENT NOT NULL,
             nome VARCHAR(255) NOT NULL,
             CONSTRAINT pk_empresa PRIMARY KEY (idEmpresa)
);

CREATE TABLE Funcionario(
            idFuncionario BIGINT AUTO_INCREMENT NOT NULL,
            idEmpresa BIGINT,
            nomeFuncionario varchar(100) NOT NULL,
            dataAdmissao datetime,
            CONSTRAINT pk_funcionario PRIMARY KEY (idFuncionario),
            CONSTRAINT fk_empresa_id foreign key (idEmpresa)
            references Empresa (idEmpresa)
);

CREATE TABLE Obra (
              idObra BIGINT AUTO_INCREMENT NOT NULL,
              descricao varchar(250),
              CONSTRAINT pk_obra PRIMARY KEY (idObra)
);

CREATE TABLE Presenca (
              idPresenca BIGINT AUTO_INCREMENT NOT NULL,
              idObra BIGINT,
              idFuncionario BIGINT,
              CONSTRAINT pk_presenca_id PRIMARY KEY (idPresenca),
              CONSTRAINT fk_obra_id foreign key (idObra)
              references Obra (idObra),
              CONSTRAINT fk_funcionario_id foreign key (idFuncionario)
              references Funcionario (idFuncionario)
);