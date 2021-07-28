# Prática Serviços de consulta, consumo de API

## Exercício 1

* O fluxo seria: Usuário faz uma requisição para nossa API -> 
  é feita uma requisição para a API do meli -> com a resposta é feita uma requisição 
  para a API de conversão -> com a resposta retornamos para o usuário.
* Em 1000 por minuto acredito que a API funcionaria normalmente. 
  Para os 100000 precisaríamos cachear os produtos que foram requisitados no dia ou momentos,
  e cacheando a cotação do dólar para um momento / dia. 
  Acredito que a implementação seria correta. 
  Perguntas: de quanto em quanto tempo a cotação da API muda e
  quantas vezes o preço de um produto pode atualizar no dia.
* A melhor opção seria armazenar (cachear) a cotação do dia para não 
  precisar chamar a API de conversão novamente.

## Exercício 2
### Parte 1

* Cotação da moeda.
* A cotação cacheada estar errada, deveríamos fazer outra requisição após determinado tempo.
* Utilizando o KVS como uma memória cache (podendo ser TTL, Single ou Book).
* KVS
* A classe de serviço que cuida da requisição de conversão.

### Parte 2

* Guardar em cache os produtos chamados mais recentemente.
* O preço antigo que será retornado.
* Podemos fazer uma verificação a cada determinado tempo e atualizar o preço.
* Fury run.