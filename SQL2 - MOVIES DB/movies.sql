#1
SELECT s.title, g.name 
FROM series AS s 
INNER JOIN genres AS g 
ON s.genre_id = g.id;
#2
SELECT e.title, a.first_name, a.last_name
FROM actor_episode AS ae
INNER JOIN actors AS a
ON a.id = ae.actor_id
INNER JOIN episodes AS e
ON e.id = ae.episode_id;
#3
SELECT s.title, COUNT(se.id)
FROM series AS s
INNER JOIN seasons AS se
ON s.id = se.serie_id
GROUP BY s.title;
#4
SELECT g.name, COUNT(m.id)
FROM genres as g
INNER JOIN movies as m
ON g.id = m.genre_id
GROUP BY g.name
HAVING COUNT(m.id) >=3;
#5
SELECT DISTINCT a.first_name, a.last_name 
FROM  actor_movie AS am 
INNER JOIN actors AS a
ON a.id = am.actor_id
INNER JOIN movies AS m
ON m.id = am.movie_id
WHERE m.title LIKE 'La Guerra%';







