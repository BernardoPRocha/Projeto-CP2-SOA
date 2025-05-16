# Projeto-CP2-SOA

# 🍷 Winery SOAP Services - Checkpoint 2
**Disciplina:** Arquitetura SOA e Web Services  
**Professor:** Jefferson Junior  
**Tecnologia:** Java 17 + Maven + JAX-WS

## ✅ Objetivo
Este projeto tem como objetivo aplicar os conceitos de arquitetura orientada a serviços (SOA), com a criação de serviços SOAP do lado servidor e seus respectivos clientes.

## 🛠️ Estrutura do Projeto

### 🔹 Publisher (`WinerySys`)
- **WineStockService**: retorna uma lista de vinhos disponíveis.
- **WineStockServiceImplementation**: implementa o serviço.
- **WineWarningService**: retorna uma mensagem de estoque insuficiente.
- **WineWarningServiceImplementation**: implementa o serviço.
- **Loader**: publica os dois serviços via `Endpoint`.

### 🔹 Clients
- **WineStockClient**: consome `getMenu()` do `WineStockService`.
- **WineOrderClient**: consome `placeOrder()` e `sendWarn()`.
- **WineWarningClient** *(extra)*: consome somente `sendWarn()`.

## 👥 Integrantes

- **Bernardo Rocha – RM: 99209**

- **[Nome do colega 2] – RM: [xxxxx]**

- **[Nome do colega 3] – RM: [xxxxx]**
