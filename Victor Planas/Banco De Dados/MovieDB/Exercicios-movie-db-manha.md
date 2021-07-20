# MER
![MER](https://github.com/REPOSITORIOW2/bootcamp-w2/blob/grupo-11/Victor%20Planas/Banco%20De%20Dados/MovieDB/images/movieMER.png)
# DER
![DER](https://github.com/REPOSITORIOW2/bootcamp-w2/blob/grupo-11/Victor%20Planas/Banco%20De%20Dados/MovieDB/images/movieDER.png)


# Primeira Parte

## 1. O que é chamado de JOIN em um banco de dados?
### R: É uma operação SQL para juntar duas ou mais tabelas por meio de colunas em comum.

## 2. Nomeie e explique 2 tipos de JOIN.
### R: Inner join - intersecção entre duas tabelas
### Right join - seleciona colunas exclusivas da tabela a direita, excluindo as colunas da tabela a esquerda e as colunas que se interseccionam.

## 3. Para que é usado o GROUP BY?
### R: Group by é usado para agrupar tuplas utilizando uma coluna em comum entre elas.

## 4. Para que é usado o HAVING?
### R: Ao utilizar o group by podemos inserir uma clausula HAVING para selecionar  somente uma condição presente nesse agrupamento.

## 5. Dados os diagramas a seguir, indique a qual tipo de JOIN cada um corresponde:
![EX5](https://github.com/REPOSITORIOW2/bootcamp-w2/blob/grupo-11/Victor%20Planas/Banco%20De%20Dados/MovieDB/images/ex5.png)
### R:Diagrama à esquerda: Inner JOIN, Diagrama à direita: left join

## 6. Escreva uma consulta genérica para cada um dos diagramas abaixo:
![EX6](https://github.com/REPOSITORIOW2/bootcamp-w2/blob/grupo-11/Victor%20Planas/Banco%20De%20Dados/MovieDB/images/ex6.png)
### Diagrama da esquerda: 
```mysql
SELECT <select_line>
FROM Table A A 
RIGHT JOIN Table B B
ON A.Id = B.Id;
```

### Diagrama da direita:
```mysql
SELECT <select_line>
FROM Table A
FULL OUTER JOIN Table B B 
ON A.Id = B.Id;
```


# SEGUNDA PARTE
## A segunda parte dos exercícios foi realizada para o banco de dados em MySQL.
## É possivel encontrar o database dump [aqui](https://github.com/REPOSITORIOW2/bootcamp-w2/blob/grupo-11/Victor%20Planas/Banco%20De%20Dados/MovieDB/DB/movies-db.sql)

## 1. Mostre o título e o nome do gênero de todas as séries.
```mysql
SELECT title,name FROM series
INNER JOIN genres g ON series.genre_id = g.id
```
## 2. Mostre o título dos episódios, o nome e o sobrenome dos atores que atuam em cada um deles.
```mysql
SELECT title,first_name,last_name FROM episodes
inner join actor_episode ae on episodes.id = ae.episode_id
inner join actors a on ae.actor_id = a.id
```
## 3. Mostre o título de todas as séries e o número total de temporadas que cada uma delas possui.
```mysql
SELECT series.title, COUNT(s.number) AS "Number of Seasons"
FROM series
INNER JOIN seasons s ON series.id = s.serie_id
GROUP BY series.title
```
## 4. Mostre o nome de todos os gêneros e o número total de filmes de cada um, desde que seja maior ou igual a 3.
```mysql
SELECT genres.name, COUNT(m.id) AS movieCount
FROM genres
INNER JOIN movies m ON genres.id = m.genre_id
GROUP BY genres.name
HAVING movieCount >= 3
```
## 5. Mostre apenas o nome e o sobrenome dos atores que atuam em todos os filmes de Star Wars e que estes não se repitam.
```mysql
SELECT DISTINCT first_name, last_name
FROM actors
INNER JOIN actor_movie am ON actors.id = am.actor_id
INNER JOIN movies m ON am.movie_id = m.id
WHERE m.title LIKE "La Guerra de las galaxias%";
```