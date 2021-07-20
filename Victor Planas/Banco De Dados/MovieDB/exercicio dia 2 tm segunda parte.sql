
-- SEGUNDA PARTE

-- 1. Mostre o título e o nome do gênero de todas as séries.

SELECT title,name FROM series
INNER JOIN genres g ON series.genre_id = g.id

-- 2. Mostre o título dos episódios, o nome e o sobrenome dos atores que atuam em cada um deles.

SELECT title,first_name,last_name FROM episodes
inner join actor_episode ae on episodes.id = ae.episode_id
inner join actors a on ae.actor_id = a.id

-- 3. Mostre o título de todas as séries e o número total de temporadas que cada uma delas possui.

SELECT series.title, COUNT(s.number) AS "Number of Seasons"
FROM series
INNER JOIN seasons s ON series.id = s.serie_id
GROUP BY series.title

-- 4. Mostre o nome de todos os gêneros e o número total de filmes de cada um, desde que seja maior ou igual a 3.

SELECT genres.name, COUNT(m.id) AS movieCount
FROM genres
INNER JOIN movies m ON genres.id = m.genre_id
GROUP BY genres.name
HAVING movieCount >= 3

-- 5. Mostre apenas o nome e o sobrenome dos atores que atuam em todos os filmes de Star Wars e que estes não se repitam.

SELECT DISTINCT first_name, last_name
FROM actors
INNER JOIN actor_movie am ON actors.id = am.actor_id
INNER JOIN movies m ON am.movie_id = m.id
WHERE m.title LIKE "La Guerra de las galaxias%";