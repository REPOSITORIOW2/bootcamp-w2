## SQL 2 - movies.db

---

### Parte 1

**1) O que é chamado de JOIN em um banco de dados?**

O JOIN é uma operação que combina duas ou mais tabelas em consultas, a fim de relacionar seus atributos comuns.

**2) Nomeie e explique 2 tipos de JOIN.**

Um dos tipos de JOIN é o INNER JOIN, que é utilizado em consultas para trazer os atributos comuns a duas tabelas, provenientes da intersecção de ambas. Podemos citar também o LEFT JOIN que trará como resultado da consulta a união de todos os atributos da relação à esquerda e da intersecção entre as tabelas.

**3) Para que é usado o GROUP BY?**

A instrução GROUP BY é utilizada para agrupar resultados de consultas, geralmente utilizados em conjunto com funções de agregação, tais como COUNT(), AVG() e SUM().

**4) Para que é usado o HAVING?**

A instrução HAVING é utilizada para filtrar resultados de consultas que trazem valores agregados.

**5)Dados os diagramas a seguir, indique a qual tipo de JOIN cada um corresponde:**

O primeiro diagrama corresponde ao INNER JOIN, pois traz somente a intersecção entre as duas relações. Já o segundo diagrama corresponde ao LEFT JOIN, ao trazer como resultado as colunas da relação à esquerda unidos com a intersecção.

**Escreva uma consulta genérica para cada um dos diagramas abaixo:**
```
SELECT column_name(s)
FROM table1
RIGHT JOIN table2
ON table1.column_name = table2.column_name;
```

```
SELECT column_name(s)
FROM table1
FULL OUTER JOIN table2
ON table1.column_name = table2.column_name
WHERE condition;
```

---