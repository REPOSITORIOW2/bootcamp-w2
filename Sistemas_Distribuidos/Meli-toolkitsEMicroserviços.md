# Meli-toolkits & Microserviços

## Exercício 1
SLA de resposta "discounts-api"
* Tempo de resposta
* Média: 40 ms
* P95: 150 ms
* P99: 300 ms
* MAX: 400 ms
* Taxa de erro: 0,9%

**Response:**

Response Time 
- Percentis(P95,P99);
- Sem média nem max;

Critica 
- Seremos tão lentos quanto nossa dependência mais lenta;
- O timeout não deve estar próximo ou abaxo da média;

Contations Scenarios
- Se um request demora mais de x tempo, podemos entender que ele nunca mais voltará;

De acordo com o problema descrito, o grupo acredita que uma solução para o problema descrito é assumir um timeout de 150 ms utilizando a estratégia de retries simples, assim fixamos nosso timeout de response para menor de 500 ms e o erro que é recebido de legado da *discounts_api* (5.9%) é multiplicado e passa a ser menor do que 0.5%. 


## Exercício 2

**Response:**

Analisando o sistema proposto, o grupo acredita que o problema relatado tem relação com a estratégia de retries utilizada, que nesse caso está sendo ultizado a estratégia Exponential Backoff e o desing patterns de resiliencia da aplicação, nesse caso acreditamos quem se fosse modificado ou criado um patterns de resiliencia como failover ou circuit braker onde casa o erro seja identificado, será modificado a instancia de acesso ou utilizado a estratégia simples para retries, onde ele só terá um valor default de timeout. 
