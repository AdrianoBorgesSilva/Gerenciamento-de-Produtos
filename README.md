# Sistema de Gerenciamento de Produtos

Este projeto é um sistema de gerenciamento de produtos desenvolvido com Spring Boot e MongoDB. Ele permite cadastrar, listar, atualizar e excluir produtos, além de buscar produtos por marca e categoria.

## Tecnologias Utilizadas
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **MongoDB**: Banco de dados NoSQL para armazenamento de dados.
- **RESTful API**: Endpoints seguindo boas práticas REST.
- **DTOs**: Uso de Data Transfer Objects para separar a camada de domínio da camada de apresentação.
- **Tratamento de Exceções**: Centralizado com `@ControllerAdvice` e respostas padronizadas.

## Funcionalidades
- Cadastro, listagem, atualização e exclusão de produtos.
- Busca de produtos por marca e categoria.
- Validação de dados com anotações como `@NotBlank`.
