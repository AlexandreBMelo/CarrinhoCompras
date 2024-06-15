# Lista de Itens

Este projeto Java é um gerenciador simples de lista de compras que permite adicionar, remover e exibir itens, além de calcular o valor total da lista.

## Estrutura do Projeto

O projeto consiste em duas classes principais:

1. **Item**: Representa um item individual com nome, preço e quantidade.
2. **ListaItens**: Gerencia uma lista de objetos `Item` e fornece métodos para adicionar, remover, exibir itens e calcular o valor total da lista.

## Funcionalidades

### Item

A classe `Item` possui os seguintes atributos e métodos:

- **Atributos**:
  - Nome do item.
  - Preço unitário do item.
  - Quantidade do item.

- **Construtor**:
  - Inicializa um novo item com o nome, preço e quantidade fornecidos.

- **Getters**:
  - Retorna o nome do item.
  - Retorna o preço do item.
  - Retorna a quantidade do item.

- **Método `toString`**:
  - Retorna uma representação em string do item, incluindo o nome, quantidade e preço.

### ListaItens

A classe `ListaItens` possui os seguintes atributos e métodos:

- **Atributos**:
  - Lista de itens.

- **Construtor**:
  - Inicializa a lista de produtos como um novo ArrayList.

- **Métodos**:
  - Adiciona um novo item à lista.
  - Remove todos os itens com o nome fornecido da lista.
  - Calcula e retorna o valor total dos itens na lista.
  - Exibe todos os itens na lista.

## Exemplo de Uso

O método `main` demonstra como usar as classes `Item` e `ListaItens` adicionando um item à lista, exibindo os itens e calculando o valor total.

## Como Executar

1. Compile as classes `Item` e `ListaItens` usando o compilador Java.
2. Execute a classe que contém o método `main`.

## Contribuição

Sinta-se à vontade para contribuir com melhorias e novos recursos. Para isso, faça um fork deste repositório, crie um branch com suas alterações e envie um pull request.
