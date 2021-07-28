# Exercício 1

## Timeout
150ms

## Retries:

### Quantidade
2
### Estratégia
Simple

# Exercício 2

Isso acontece pois existe um excesso de requisição do microserviço externo e congestionando o nosso serviço. Para solucionar o problema devemos implementar um circuit breaker e retornar um erro de 503 - Service Unavailable.

