# Exercício 1

- Fluxo de execução:

1. Recebe request;
2. Chama api-produto;
3. Chama api-conversão;
4. Retorna DTO com preço e unidades apropriados.

- Fluxo melhorado:

1. Recebe request;
2. Chama api-produto;
3. Pega conversão de preço no KVS se já disponível;
4. Se não estiver no KVS, usa api-conversão e insere no KVS;
5. Retorna DTO com preço e unidades apropriadas.

- Invalidar KVS Cache diariamente.

# Exercício 2

## Parte 1
- Podemos pré-cachear as cotações mais utilizadas diariamente pela API, como por exemplo BRL para USD, ARS para USD, etc. Faríamos isso rodando diariamente um Cronjob que atualiza as cotações no KVS ou as insere caso não estiverem presentes.
- Teríamos que ajustar a janela de exposição do cache como a mesma que a API de cotação usa, para manter os dados o mais atualizados possível.
- O cache seria implementado com um Key Value Store.
- KVS Cache
- CurrencyConversionAPIService, que resgata informações do cache e/ou as armazena caso necessário.

## Parte 2

- Utilizar cache no preço do item, no endpoint que busca o item com a api externa, usando como chave o ID do item.
- A cache fica desatualizada até que o TTL acabe, portanto precisamos da abordagem do item abaixo:
- API de itens muda preco -> Manda msg para BQ em topico de mudanca de preco -> Subscribers do BQ recebem a mensagem -> Evict na cache dos itens com a chave do item
- Com o docker daemon rodando no background, usamos o comando:
```fury run```

