# Padrão Decorator em Java

Este projeto demonstra a implementação do **padrão de projeto Decorator** em Java.  
O objetivo é permitir que funcionalidades sejam adicionadas dinamicamente a objetos sem alterar suas classes originais.  
No exemplo, temos uma **cafeteria**, onde bebidas podem receber **adicionais** como leite, chocolate e chantilly.

## Estrutura do Projeto

- **Bebida (interface - Component)**  
  - Métodos: `getDescricao()`, `getPreco()`

- **Cafe / Cha (ConcreteComponent)**  
  - Implementam a interface `Bebida`.

- **BebidaDecorator (Decorator)**  
  - Classe abstrata que recebe uma `Bebida` e delega chamadas.

- **Leite / Chocolate / Chantilly (ConcreteDecorator)**  
  - Estendem `BebidaDecorator` e adicionam comportamento (descrição e preço).

- **App (Cliente)**  
  - Cria pedidos de bebidas com diferentes combinações de decoradores.
