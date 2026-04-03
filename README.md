# 🚀 Spring Boot Essentials - API de Produtos

## 📌 Visão geral

Este projeto consiste no desenvolvimento de uma **API REST de gerenciamento de produtos**, utilizando **Java e Spring Boot**, com o objetivo de consolidar conhecimentos em backend e aplicar boas práticas utilizadas no mercado.

A aplicação foi estruturada para simular o crescimento real de um sistema, iniciando com dados em memória e evoluindo para uma arquitetura mais robusta.

---

## 🎯 Objetivo do projeto

O principal objetivo deste projeto é:

- Entender como uma API REST é construída na prática
- Aplicar conceitos de **arquitetura em camadas**
- Separar responsabilidades no código
- Trabalhar com requisições HTTP e respostas em JSON
- Evoluir progressivamente até um CRUD completo com banco de dados

---

## 🧱 Arquitetura utilizada

O projeto segue o padrão de **arquitetura em camadas**, muito utilizado em aplicações backend:

### 🔹 Controller
Responsável por receber as requisições HTTP e retornar as respostas ao cliente.

### 🔹 Service
Camada onde ficam as **regras de negócio** da aplicação.

### 🔹 DTO (Data Transfer Object)
Utilizado para transportar os dados entre as camadas, evitando exposição direta da entidade.

### 🔹 Model
Representa a estrutura do objeto (Produto) dentro da aplicação.

---

## 🔄 Funcionamento atual

Atualmente, a API possui um endpoint funcional:

### 📥 GET /v1/produtos

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
