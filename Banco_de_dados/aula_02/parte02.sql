use movies_db;

select * from genres;
select * from movies;


SELECT COUNT(*) as total_genres FROM genres;
SELECT COUNT(*) as total_movies FROM movies;


select count(*) from movies, genres
where movies.genre_id = genres.id;

select title from movies where genre_id = null;

SELECT movies.title, movies.rating, genres.name FROM movies
inner join genres
on movies.genre_id = genres.id;

-- liste todos os filmes e seus nomes de classificação, inclusive sem classificação
select *
from movies 
left join genres on movies.genre_id = genres.id;

-- liste todas os classificações e os filmes correspondentes
select *
from movies 
right join genres on movies.genre_id = genres.id;
