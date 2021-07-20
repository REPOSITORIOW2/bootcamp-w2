-- 2.1
select series.title, genres.name
from series
inner join genres on genres.id = series.genre_id;

-- 2.2
select episodes.title, actors.first_name, actors.last_name 
from episodes
inner join actor_episode on episodes.id = actor_episode.episode_id
inner join actors on actors.id = actor_episode.actor_id;

-- 2.3
select A.title, count(*) as quantidade_series
from series A
inner join seasons B on B.serie_id = A.id
group by A.title;

-- 2.4
select A.name, count(*) quantidade_filmes
from genres A
inner join movies B on B.genre_id = A.id
group by A.name
having quantidade_filmes >= 3;

-- 2.5
select C.first_name, C.last_name
from actors C
Where (C.id, (Select count(*) from movies where lower(title) like "La Guerra de las galaxias%")) in 
(select distinct B.actor_id, count(*) filmes_atuou
from movies A
inner join actor_movie B on B.movie_id = A.id
where lower(A.title) like "La Guerra de las galaxias%"
group by B.actor_id);
