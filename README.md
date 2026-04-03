# 🚀 Spring Boot Essentials - API de Produtos

## 👨‍💻 Sobre o projeto

Este projeto consiste no desenvolvimento de uma API REST para gerenciamento de produtos, utilizando Java + Spring Boot, com o objetivo de consolidar conhecimentos em backend e aplicar boas práticas utilizadas no mercado.  

A proposta é simular a evolução real de uma aplicação, iniciando com dados em memória e evoluindo para uma arquitetura mais robusta, organizada e escalável, incluindo persistência em banco de dados e um CRUD completo.

## 🎯 Objetivo

O principal objetivo deste projeto é construir uma API REST do zero, aplicando conceitos de arquitetura em camadas, separação de responsabilidades, manipulação de requisições HTTP e respostas em JSON, evoluindo progressivamente até um sistema completo alinhado com práticas do mercado.

## 🧱 Arquitetura

O projeto segue o padrão de arquitetura em camadas, amplamente utilizado em aplicações backend:

- Controller → Responsável por receber as requisições HTTP e retornar as respostas  
- Service → Onde ficam as regras de negócio da aplicação  
- DTO → Utilizado para transferência de dados entre as camadas  
- Model → Representa a estrutura da entidade dentro da aplicação  

Essa organização facilita a manutenção, escalabilidade e clareza do código.
🛠️ Tecnologias utilizadas

Java 17+
Spring Boot
Spring Web
Lombok
Swagger (Springdoc OpenAPI)
Postman

🚧 Próximas melhorias
Implementar endpoint de criação (POST)
Integração com banco de dados (JPA/Hibernate)
Criar camada de repository
Implementar update e delete (CRUD completo)
Adicionar validações
Tratamento de exceções

💡 Sobre o projeto
Este projeto faz parte da minha evolução como desenvolvedor backend, com foco em construir aplicações organizadas, escaláveis e alinhadas com as práticas do mercado.

👨‍💻 Autor

Leonardo Ribeiro
Linkedin: https://www.linkedin.com/in/leozinr01/

▶️ Como rodar o projeto
git clone https://github.com/leozinr01/spring-boot-essentialss
cd spring-boot-essentialss
./mvnw spring-boot:run

A aplicação estará disponível em:

http://localhost:8082

🧪 Testes

Os endpoints foram testados utilizando Postman, garantindo o correto funcionamento das requisições HTTP e a estrutura das respostas JSON.

## 🔄 Funcionalidades

Atualmente, a API possui um **CRUD completo de produtos**:

- 📥 **GET /v1/produtos** → Listar produtos  
- ➕ **POST /v1/produtos** → Criar produto  
- ✏️ **PUT /v1/produtos/{id}** → Atualizar produto  
- ❌ **DELETE /v1/produtos/{id}** → Deletar produto  

---

Esse endpoint retorna uma lista de produtos armazenados em memória.

### 📌 Exemplo de resposta:

```json
[
  {
    "id": 1,
    "nome": "Notebook",
    "preco": 5000,
    "quantidade": 10
  },
  {
    "id": 2,
    "nome": "Iphone",
    "preco": 7000,
    "quantidade": 10
  }
]


