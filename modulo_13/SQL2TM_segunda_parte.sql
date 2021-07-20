-- Mostre o título e o nome do gênero de todas as séries.
SELECT s.title, g.name FROM genres g INNER JOIN series s ON (g.id = s.genre_id);


-- Mostre o título dos episódios, o nome e o sobrenome dos atores que atuam em cada um deles.
SELECT e.title, a.first_name, a.last_name 
	FROM actor_episode ae INNER JOIN actors a ON (ae.actor_id = a.id) 
INNER JOIN episodes e ON (ae.episode_id = e.id);


-- Mostre o título de todas as séries e o número total de temporadas que cada uma delas possui.
SELECT s.title, count(sea.id) 
	FROM series s INNER JOIN seasons sea ON (s.id = sea.serie_id) GROUP BY s.title;


-- Mostre o nome de todos os gêneros e o número total de filmes de cada um, desde que seja maior ou igual a 3.
SELECT g.name, count(m.id) as total
	FROM genres g INNER JOIN movies m ON (g.id = m.genre_id) 
    GROUP BY g.name
	HAVING total >= 3;
    

-- Mostre apenas o nome e o sobrenome dos atores que atuam em todos os filmes de Star Wars e que estes não se repitam.
SELECT DISTINCT a.first_name, a.last_name
	FROM actor_movie am INNER JOIN actors a ON (am.actor_id = a.id)
    INNER JOIN movies m ON (am.movie_id = m.id)
    WHERE m.title LIKE 'La Guerra de las%'

