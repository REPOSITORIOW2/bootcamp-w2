# SQL 3 - MOVIES DB

## 1. Explique o conceito de normalização e para que é usado.
### R: Normalização é um conjunto de formas normais usadas para padronizar e evitar a redundância de dados no banco.
## 2. Adicione um filme à tabela de filmes.
```mysql
INSERT INTO `movies`
VALUES (25,NULL,NULL,'Bad Boys',8.9,4,'2010-10-04 00:00:00',95,4);
```
## 3. Adicione um gênero à tabela de gêneros.
```mysql
INSERT INTO `genres`
VALUES (25,'2019-07-04 05:00:00',NULL,'Besteirol americano',22,1);
```
## 4. Associe o filme do Ex 2. ao gênero criado no Ex. 3.
```mysql
UPDATE `movies`
SET genre_id = 25
WHERE id = 25;
```
## 5. Modifique a tabela de atores para que pelo menos um ator adicione como favorito o filme adicionado no Ex. 2.
```mysql
UPDATE `actors`
SET favorite_movie_id = 25
WHERE id = 1;
```
## 6. Crie uma cópia temporária da tabela de filmes.
```mysql
CREATE TEMPORARY TABLE `movies_copy`
SELECT * FROM `movies`;
```

## 7. Elimine desta tabela temporária todos os filmes que ganharam menos de 5 prêmios.
```mysql
DELETE FROM movies_copy
WHERE awards < 5;
```

## 8. Obtenha a lista de todos os gêneros que possuem pelo menos um filme.
```mysql
SELECT DISTINCT name 
FROM genres
INNER JOIN movies m ON genres.id = m.genre_id;
```
## 9. Obtenha a lista de atores cujo filme favorito ganhou mais de 3 prêmios.
```mysql
SELECT DISTINCT first_name, last_name
FROM actors
INNER JOIN actor_movie ON actors.id = actor_movie.actor_id
INNER JOIN movies ON actors.favorite_movie_id = movies.id
WHERE awards > 3;
```
## 10. Use o plano de explicação para analisar as consultas nos Ex. 6 e 7.
### The EXPLAIN statement in MySQL does not work with CREATE or DELETE statements, so only the SELECT query was analyzed.
```mysql
EXPLAIN (SELECT * FROM `movies`);
```
### (execution: 13 ms, fetching: 125 ms) foi obtido na query acima.
```mysql
EXPLAIN (SELECT * FROM movies_copy
            WHERE awards < 5);
```
### (execution: 16 ms, fetching: 163 ms) foi obtido na query acima.

## 11. O que são os índices? Para que servem?
### R: Índices são maneiras de organizar os dados de uma tabela das quais o SGBD pode não garantir uma otimização. Se um valor se repete constantemente em uma tabela, por exemplo. Podemos usar índices para otimizar as buscas e tempos de execução e utilizar diferentes estruturas de dados para garantir seu melhor tempo de resposta.

## 12. Crie um índice sobre o nome na tabela de filmes.
```mysql
CREATE INDEX movie_name ON movies (title);
```
## 13. Verifique se o índice foi criado corretamente.
```mysql
SHOW INDEX FROM movies;
```
A query acima retorna uma tabela com todos os índices comprovando sua criação no banco.