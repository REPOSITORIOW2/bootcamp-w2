# Exercícios sobre Serviços Fury

## Para refletir

Optar por monolitos:

- Curto tempo de desenvolvimento
- Maior agilidade no desenvolvimento, não precisar pensar em arquiteturas e relacionamentos complexos
- Projetos pequenos/triviais/simples
- Quando no começo o time necessita de rápido Time-to-Market
- Desenvolvimento de MVP 

Optar por microserviços:

- Sistemas escaláveis que atenderão milhares de RPMs
- A manutenibilidade do sistema a longo prazo é crucial para o negócio
- Necessidade de desenvolver um sistema resistente a falhas
- Muitas equipes de desenvolvimento na empresa

:+1: 

## Exercício 1


Considerando que o único ponto de erro e timeouts da API é devido somente aos erros e timeouts provenientes da discount-api, temos a seguinte proposta:

Com apenas uma retry conseguimos garantir uma taxa de erro menor que 0.0005(ou 0.5%) pois a probabilidade de falha na discounts-api para duas tentativas é (0.0009)² = 0.000081 < 0.0005.

Podemos definir uma estratégia de Exponential Backoff, definindo o primeiro timeout em 150ms (abrangendo assim P95) e o segundo timeout como 300ms, o que abrangeria P99. 

Com 150ms na primeira requisição conseguimos garantir 95% de probabilidade de sucesso. Nos 5% das requisições mal-sucedidas, realizaremos uma nova requisição com timeout de 300ms que vai falhar 1% das vezes. Dessa forma, a probabilidade de sucesso é de:

`1 - (0,05 * 0,01) = 0,9995 = 99,95%`

Como P99(1%) > 0.9% < P95(5%), temos que nosso caso de uso abrange todos os erros que possam ocorrer na discount-api. Deste modo, o nosso ENDPOINT tem tempo de resposta de 450ms da discount-api. Assim, considerando que quaisquer outros processamentos acontecem de maneira paralela a requisição feita a discount-api, temos tempo o suficiente para resolver a requisição em menos de 500ms.

Tecnicamente, também é possível aumentar a taxa de sucesso, uma vez que ainda é possível encaixar uma request de 40ms visto que existe um número de requests que necessariamente podem ser atendidas em um intervalo menor. Portanto, alteraria-se a estratégia para uma com dois retries:

`request - <wait 40ms> - retry - <wait 150ms> - retry - <wait 300ms> - respond with either the proper answer or with an 504 error.`

Neste cenário, é garantido uma taxa de erro <0.5% e um tempo de resposta <500ms, dadas as condições pré-supostas.

## Exercício 2

Solução: Implementar uma estratégia de exponential backoff.

https://blog.hubspot.com/website/http-error-429