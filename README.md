# Projeto Desafio Corporativo Hackathon Fatec

## Descrição

O Projeto Desafio Hackathon é uma aplicação que permite a uma construtora gerenciar a lista de presença de seus funcionários em diferentes obras. Ele fornece recursos para registrar a presença dos funcionários em obras específicas em datas determinadas.

## Tecnologias Utilizadas

* Java
* Spring Boot
* H2 Database
* Flyway
* Lombok
* Swagger

## Pré-requisitos
* Java 11 ou superior
* Maven

## Instalação

1. Clone o repositório para o seu ambiente local:
```shell
bash

git clone https://github.com/seu-usuario/desafio-hackathon.git
```
2. Navegue para a pasta do projeto:
```shell
bash

cd desafio-hackathon
```
3. Compile o projeto com o Maven:
```shell

mvn clean install
```

## Configuração

O arquivo **application.properties** contém as configurações do aplicativo, incluindo a configuração do banco de dados H2 e outras propriedades. Verifique e ajuste conforme necessário.

## Uso

## API GET

* Acesse a documentação da API usando o Swagger UI:
  http://localhost:8080/swagger-ui.html

* A aplicação oferece os seguintes endpoints da API GET:
  
  - **GET /api/v1/empresa:**  Retorna a lista de todas as empresas cadastradas.
  - **GET /api/v1/empresa/{id}:** Retorna os detalhes de uma empresa específica com o ID fornecido.
  - **GET /api/v1/funcionario:** Retorna a lista de todos os funcionários.
  - **GET /api/v1/obra:** Retorna a lista de todas as obras.
  - **GET /api/v1/obra/{id}:** Retorna os detalhes de uma obra específica com o ID fornecido.
  - **GET /api/v1/presencas:** Retorna a lista de todas as presenças registradas.
  - **GET /api/v1/presencas/obra/{obraId}/{dataPresenca}:** Retorna a lista de funcionários presentes em uma obra específica em uma data específica.

## API POST

* A aplicação oferece os seguintes endpoints da API POST:

  - **POST /api/v1/empresa:** Cria uma nova empresa.
  - **POST /api/v1/funcionario:** Cria um novo funcionário.
  - **POST /api/v1/obra:** Cria uma nova obra.
  - **POST /api/v1/presencas:** Registra a presença de um funcionário em uma obra em uma data específica.

## Contato

  Autor: Matheus Rebello
  
  E-mail: matheussrb@outlook.com
