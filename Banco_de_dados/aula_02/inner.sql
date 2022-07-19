use movies_db;

-- quantas séries
SELECT COUNT(*) FROM series;

-- quantas temporadas estão cadastradas
SELECT COUNT(*) FROM seasons;

-- quantas temporadas existem para cada série
SELECT series.title, count(*) as temporadas
FROM seasons INNER JOIN series on series.id = seasons.serie_id
GROUP BY series.id;

-- quantas temporadas existem para a série "The Walking Dead"
SELECT series.title, count(*) as temporadas
FROM seasons INNER JOIN series on series.id = seasons.serie_id
WHERE series.title = 'The Walking Dead'
GROUP BY series.id;


-- Quais séries tem mais de 5 temporadas
SELECT series.title, count(*) as temporadas
FROM seasons INNER JOIN series on series.id = seasons.serie_id
GROUP BY series.id
HAVING temporadas > 5;

-- quas as 3 séries com maior número de temporadas
select series.title, count(*) as temporadas
from seasons inner join series on series.id = seasons.serie_id
group by series.id
order by temporadas desc
limit 3;

-- SUBCONSULTAS

-- quas os nomes dos atores que trabalham em filmes com avaliação maior que 9.1
SELECT * FROM actors where id in (
SELECT actor_movie.actor_id from movies
inner join actor_movie on movies.id = actor_movie.movie_id 
where rating > 9.1);

-- Resolvendo com o join
SELECT actors.first_name, actors.last_name from movies
inner join actor_movie
on movies.id = actor_movie.movie_id
inner join actors on actors.id = actor_movie.actor_id
where movies.rating > 9.1
order by actors.first_name;
