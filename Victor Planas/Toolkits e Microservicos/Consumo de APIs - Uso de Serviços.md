# Consumo de APIs - Uso de Serviços

## Exercício 1:

### Como seria o fluxo de execução a partir do momento em que recebemos um request?
R: 
- Requisição do produto por ID: GET: /items/:id;
- Captação do preço do produto requisitado e currency_id do produto para envio a API de conversão;
- Requisita cotação da moeda obtida na requisição anterior;
- Calcula e retorna o preço em dólares!

### O que aconteceria se recebêssemos 1000 pedidos por minuto? E se recebermos 100 000? Esta API tem uma implementação correta? Que perguntas vocês fariam para pensar em otimizações a serem feitas à API?

R: A API faria o dobro de requisições a dependências externas. O mesmo aconteceria para 100.000, existe a chance de falha do sistema dependendo do throughput da API.
Esta API possui implementação correta. 
Perguntas a serem feitas:
- Qual seria o período mínimo para atualização de preço do produto?
- Qual seria o melhor atributo para routing do KVS?

### Assumindo que as cotações mudam uma vez por dia, que opção podemos tomar para melhorar esta API?
R: Para otimizar esta API seria necessário fazer um cache do valor da cotação no KVS. 