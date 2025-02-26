# Sistema de Gerenciamento de Produtos

Este projeto é uma aplicação backend desenvolvida em Spring Boot para gerenciar produtos. Ela permite operações básicas de CRUD (Create, Read, Update, Delete) e consultas personalizadas, como buscar produtos por marca ou categoria. A aplicação utiliza MongoDB como banco de dados e segue boas práticas de desenvolvimento, como validações e mapeamento de DTOs.

## Funcionalidades

- **CRUD de Produtos:** Criar, ler, atualizar e deletar produtos.

- **Consultas Personalizadas:** Buscar produtos por marca ou categoria.

- **Validações:** Validação de campos obrigatórios e regras de negócio.

- **DTOs:** Uso de Data Transfer Objects (DTOs) para transferência de dados.

- **Tratamento de Exceções:** Respostas amigáveis para erros de validação e exceções de negócio.

## Tecnologias Utilizadas

- **Linguagem:** Java 17
- **Framework:** Spring Boot 3.4.3
- **Banco de Dados:** MongoDB
- **Bibliotecas:**
  - Lombok (para reduzir boilerplate code)
  - MapStruct (para mapeamento de DTOs)
  - Jakarta Validation (para validações)
- **Ferramentas:**
  - Maven (gerenciamento de dependências)
  - Postman (testes de API)
  - MongoDB Compass (gerenciamento do Banco de Dados local)

