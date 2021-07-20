/* 
    Aqui responderemos as perguntas do Exercício SQL 2 - Movies DB

    PRIMEIRA PARTE
    
    1) A operação de JOIN em um banco de dados é equivalente a operação de junção em conjuntos. 
    Por se tratar de uma operação binária, ela cria pares de entradas de duas tabelas 
    resultando em entradas em tuplas correspondentes a (t1, t2) onde t1 ∈ T1 e t2 ∈ T2 tal que T1, T2 são tabelas.

    2) O INNER JOIN (A e B) é utilizado quando quer resultados em comum com a tabela de A e B, 
    LEFT JOIN (A e B) é utilizado quando quer todos resultados da tabela A e os resultados em comum com a tabela B.

    3) A operação GROUP BY é usada para agrupar dados de uma ou mais colunas a fim de realizar 
    algum cálculo em cima desses grupos. Tais cálculos envolvem: contagem de linhas, soma, média, 
    mínimo e máximo de cada grupo.

    4) O HAVING funciona da mesma maneira que o WHERE, porém se aplica quando existe grupos e também 
    por uma expressão que tenha valor agregado diferente do WHERE que se aplica a linhas individuais.

    5) O primeiro caso das figuras do enunciado corresponde a um INNER JOIN, já o segundo a um LEFT JOIN.

    6) SELECT * FROM A RIGHT JOIN B ON ... ; SELECT * FROM A FULL JOIN B ON ...
*/

/* 
    SEGUNDA PARTE
    
    1) Mostre o título e o nome do gênero de todas as séries.
    2) Mostre o título dos episódios, o nome e o sobrenome dos atores que atuam em cada um deles.
    3) Mostre o título de todas as séries e o número total de temporadas que cada uma delas possui.
    4) Mostre o nome de todos os gêneros e o número total de filmes de cada um, desde que seja maior ou igual a 3.
    5) Mostre apenas o nome e o sobrenome dos atores que atuam em todos os filmes de Star Wars e que estes não se repitam.
*/

-- 1)
SELECT series.title, genres.name 
FROM series 
JOIN genres
    ON series.genre_id = genres.id;

-- 2)
SELECT e.title, a.first_name, a.last_name
FROM episodes e
JOIN actor_episode ae
	ON e.id = ae.episode_id
JOIN actors a
	ON a.id = ae.actor_id;

-- 3)
SELECT series.title, 
	COUNT(series.title) AS totalSeasons
FROM series
JOIN seasons
	ON series.id = seasons.serie_id
GROUP BY series.title;

-- 4)
SELECT g.name, COUNT(g.name) AS totalFilmes
FROM genres g
JOIN movies m
	ON g.id = m.genre_id
GROUP BY g.name
HAVING totalFilmes >= 3;

-- 5)

/* Com variável temporária: */
SET @filtroStarWars = '%La Guerra de Las galaxias%';

SELECT 
	CONCAT(a.first_name, ' ', + a.last_name) AS nomeCompleto
FROM movies m 
JOIN actor_movie am
	ON am.movie_id = m.id
JOIN actors a
	ON a.id = am.actor_id
WHERE m.title LIKE @filtroStarWars
GROUP BY nomeCompleto
HAVING COUNT(*) = (SELECT COUNT(*) FROM movies m WHERE m.title LIKE @filtroStarWars);

/* Com tabela temporária */
DROP TABLE  IF EXISTS temp_starWarsMovies;

CREATE TABLE temp_starWarsMovies
SELECT m.id FROM movies m WHERE m.title LIKE 'La Guerra de Las galaxias%';

SELECT 
	CONCAT(a.first_name, ' ', + a.last_name) AS nomeCompleto
FROM temp_starWarsMovies AS starWarsMovies
JOIN actor_movie am
	ON am.movie_id = starWarsMovies.id
JOIN actors a
	ON a.id = am.actor_id
GROUP BY nomeCompleto
HAVING COUNT(*) = (SELECT COUNT(*) FROM temp_starWarsMovies);

DROP TABLE temp_starWarsMovies;
