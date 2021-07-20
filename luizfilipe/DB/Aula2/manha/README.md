#Querys

##Querys criada para execução em banco MySQL [movie-db](./movie-db) inicialmente disponibilizado

### QUESTAO 1
~~~mysql
SELECT series.title as titulo, genres.name as genero
FROM series,
genres
where series.genre_id = genres.id;
~~~

### QUESTAO 2
~~~mysql
SELECT e.title AS episodio, a.first_name, a.last_name
FROM episodes e
LEFT JOIN actor_episode ae on e.id = ae.episode_id
LEFT JOIN actors a on ae.actor_id = a.id;
~~~

### QUESTAO 3
~~~mysql
SELECT s.title, COUNT(seasons.id)
FROM seasons
RIGHT JOIN series s on s.id = seasons.serie_id
GROUP BY s.id;
~~~

### QUESTAO 4
~~~mysql
SELECT genres.name, COUNT(genre_id) AS QUANTIDADE
FROM genres
LEFT JOIN movies m on genres.id = m.genre_id
GROUP BY name
HAVING COUNT(genre_id) >= 3;
~~~

### QUESTAO 5
~~~mysql
SELECT CONCAT(a.first_name, ' ', a.last_name) as atores
FROM movies m
RIGHT JOIN actor_movie am on m.id = am.movie_id
RIGHT JOIN actors a on a.id = am.actor_id
WHERE m.title LIKE 'La Guerra de las galaxias%'
GROUP BY actor_id
HAVING COUNT(DISTINCT movie_id) = COUNT(actor_id);
~~~


