#Mostre o título e o nome do gênero de todas as séries.

#select s.title, g.name from series as s, genres as g where s.genre_id = g.id;

#Mostre o título dos episódios, o nome e o sobrenome dos atores que atuam em cada um deles.

#select e.title, a.first_name, a.last_name from episodes as e inner join actor_episode as ae on (e.id = ae.episode_id) inner join actors as a on (ae.actor_id = a.id);

#Mostre o título de todas as séries e o número total de temporadas que cada uma delas possui.

#select s.title, count(se.id) as total from series as s inner join seasons as se on (se.serie_id = s.id) group by s.title;

#Mostre o nome de todos os gêneros e o número total de filmes de cada um, desde que seja maior ou igual a 3.

#select g.name, count(m.id) as total from genres as g inner join movies as m on (m.genre_id = g.id) group by g.name having total >= 3;

#Mostre apenas o nome e o sobrenome dos atores que atuam em todos os filmes de Star Wars e que estes não se repitam.
#select m.id, m.title, a.first_name, a.last_name from actors as a inner join actor_movie as am on (am.actor_id = a.id) inner join movies as m on (am.movie_id = m.id) where (m.title like 'La Guerra de las galaxias%');

#Mostre apenas o nome e o sobrenome dos atores que atuam em todos os filmes de Star Wars e que estes não se repitam.
#select a.first_name, a.last_name from actors as a join actor_movie ae on (a.id = ae.actor_id) join movies as m on (ae.movie_id = m.id) where (m.title like 'La guerra de las galaxia%')

select a.first_name, a.last_name 
	from actors as a ,
		(select id from movies as m where (m.title like 'La guerra de las galaxia%')) as m
        inner join actor_movie ae where (ae.actor_id = a.id) and (ae.movie_id = m.id) group by (a.first_name) having count(a.first_name) > 1;

