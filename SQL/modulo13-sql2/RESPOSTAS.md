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

### Segunda parte

**1) Mostre o título e o nome do gênero de todas as séries**

```
SELECT s.title, g.name FROM series s JOIN genres g ON s.genre_id = g.id
```

**2) Mostre o título dos episódios, o nome e o sobrenome dos atores que atuam em cada um deles.**

```
SELECT e.title, a.first_name, a.last_name
FROM (episodes e, actors a)
JOIN actor_episode ae ON ae.episode_id = e.id
AND a.id = ae.actor_id
```

**3) Mostre o título de todas as séries e o número total de temporadas que cada uma delas possui.**

```
SELECT s.title, COUNT(se.id) as total_seasons FROM (series s, seasons se)
WHERE s.id = se.serie_id GROUP BY s.title
```

**4) Mostre o nome de todos os gêneros e o número total de filmes de cada um, desde que seja maior ou igual a 3.**

```
SELECT g.name, COUNT(m.id) as total_movies FROM (genres g, movies m)
WHERE g.id = m.genre_id GROUP BY g.name HAVING total_movies >= 3
```

**5) Mostre apenas o nome e o sobrenome dos atores que atuam em todos os filmes de Star Wars e que estes não se repitam.**

```
SELECT DISTINCT a.first_name, a.last_name
FROM (movies m, actors a)
JOIN actor_movie am ON am.movie_id = m.id
AND a.id = am.actor_id
WHERE m.title LIKE 'La Guerra de las galaxias%'
```