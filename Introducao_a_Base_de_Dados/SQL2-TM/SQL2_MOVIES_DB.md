
# Questionário PARTE 1 *SQL 2 - Movies DB - Prática em Grupo*

## 1.O que é chamado de JOIN em um banco de dados?
R: Quando está realizando uma combinação de colunas de duas ou mais tabelas.
## 2.Nomeie e explique 2 tipos de JOIN.
LEFT JOIN : Retorna todos os registros da tabela da esquerda mais os registros em conjunto com a tabela da direita.
RIGHT JOIN : Retorna todos os registros da tabela da direita mais os registros em conjunto com a tabela da esquerda.
## 3.Para que é usado o GROUP BY?
Group By agrupa linhas baseadas em semelhancas entre elas. 
## 4.Para que é usado o HAVING?
HAVING tem a funcionalidade similar da Keyword WHERE porém noa pode ser usada junto a funçoes agregadas. Retornando apenas linhas nas quais os valores agregados atendam às condições especificadas. 
## 5.Dados os diagramas a seguir, indique a qual tipo de JOIN cada um corresponde:
Inner Join e Left Join 
## 6.Escreva uma consulta genérica para cada um dos diagramas abaixo:
``` sql 
SELECT * FROM Tabela_A A RIGHT JOIN Tabela_B B ON(A.nome = B.nome); 
SELECT * FROM Tabela_A A FULL JOIN Tabela_B B ON(A.nome = B.nome); 
```

# Questionário PARTE 2 *SQL 2 - Movies DB - Prática em Grupo*


## 1.Mostre o título e o nome do gênero de todas as séries.

``` sql 
SELECT s.title, g.name FROM series s INNER JOIN genres g ON(g.id = s.genre_id); 
```
<span style="color:green"> Response: </span>

| title   |      name      |
|----------|:-------------:|
| Game of Thrones     | Fantasia |
| Supernatural        | Suspenso |
| The Walking Dead    | Terror   |
| Person of Interest  | Accion   |
| The Big Bang Theory | Comedia  |
| Breaking Bad        | Drama    |
6 rows in set (0.00 sec)
## 2.Mostre o título dos episódios, o nome e o sobrenome dos atores que atuam em cada um deles.
``` sql 
SELECT e.title, a.first_name, a.last_name FROM actors a INNER JOIN actor_episode ae ON (a.id=ae.actor_id) INNER JOIN episodes e ON (e.id=ae.episode_id);
```
<span style="color:green"> Response: </span>

| title                | first_name | last_name |
|-------------------------------------|:------------|:-----------:|
| Winter Is Coming          | Emilia   | Clarke  |
| Winter Is Coming          | Peter   | Dinklage |
| Winter Is Coming          | Kit    | Harington |
| The North Remembers         | Emilia   | Clarke  |
| The North Remembers         | Peter   | Dinklage |
| The North Remembers         | Kit    | Harington |
.... 148 rows in set (0.00 sec)
## 3.Mostre o título de todas as séries e o número total de temporadas que cada uma delas possui.

``` sql 
SELECT series.title, COUNT(seasons.serie_id) AS temporadas FROM series INNER JOIN seasons ON (series.id = seasons.serie_id) GROUP BY seasons.serie_id;
```
<span style="color:green"> Response: </span>

| title        | temporadas |
|----------|:-------------:|
| Game of Thrones   |     7 |
| Supernatural    |     12 |
| The Walking Dead  |     7 |
| Person of Interest |     5 |
| The Big Bang Theory |     10 |
| Breaking Bad    |     5 |
6 rows in set (0.00 sec)

## 4.Mostre o nome de todos os gêneros e o número total de filmes de cada um, desde que seja maior ou igual a 3.
``` sql 
SELECT g.name, COUNT(m.genre_id) AS n_movies FROM genres g INNER JOIN movies m ON (m.genre_id=g.id) GROUP BY m.genre_id HAVING n_movies >= 3;
```
<span style="color:green"> Response: </span>


| name      | n_movies |
|----------|:-------------:|
| Drama      |    3 |
| Ciencia Ficcion |    5 |
| Animacion    |    4 |
| Aventuras    |    3 |
4 rows in set (0.00 sec)

## 5.Mostre apenas o nome e o sobrenome dos atores que atuam em todos os filmes de Star Wars e que estes não se repitam.

``` sql 
SELECT DISTINCT a.first_name, a.last_name FROM actors a INNER JOIN actor_movie am ON (a.id=am.actor_id) INNER JOIN movies m ON (m.id=am.movie_id) WHERE m.title LIKE 'La Guerra de las galaxias%';
```
<span style="color:green"> Response: </span>

| first_name | last_name |
|----------|:-------------:|
| Mark    | Hamill  |
| Harrison  | Ford   |
| Carrie   | Fisher  |
3 rows in set (0.00 sec)