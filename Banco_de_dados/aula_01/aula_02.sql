use movies_db;

-- mostrar todos os campos da tabela moviies
select * from movies;

-- mostrar o nome, sobrenome, e classificaçao de todos os atores.
select first_name, last_name, rating from actors;

-- mostrar título de todas as séries e use alias para que tanto o nome da tabela
-- quanto o campo estejam em português

select séries.title as 'título' from series as séries;

-- Mostrar o nome e sobrenome dos atores cuja classificação é superior a 7,5
select first_name, last_name, rating from actors where rating > 7.5;

-- Mostrar o título dos filmes, a classificação e os prêmios dos filmes com classificação
-- superior a 7,5 e com mais de dois prêmios
select title, rating, awards
from movies 
where rating > 7.5 and awards > 2;

-- Mostrar o título dos filmes e. a classificação ordenados por classificação em ordem crescente
SELECT title, rating
FROM movies
ORDER BY rating;

-- Mostrar o título dos filmes e. a classificação ordenados por classificação em ordem decrescente
SELECT title, rating
FROM movies
ORDER BY rating desc;

-- Mostrar os títulos dos 3 primeiros filmes do banco de dados
SELECT title
FROM movies
limit 3;

-- Mostrar os 5 melhores filmes coom a classificação mais altaa;
SELECT title, rating
from movies
order by rating desc
limit 5;

-- Mostrar o título e a classificação dos filmes cujo título é toy story
SELECT title, rating
from movies
where  title like '%Toy Story%';

-- Mostrar todos os atores cujos nomes começam com Sam

SELECT first_name, last_name
FROM actors 
where first_name like 'Sam%';

-- Mostrar o título dos filmes que saíram entre 2004 e 2008
SELECT title, release_date, year(release_date)
FROM movies
where year(release_date) >= 2004 and year(release_date) <= 2008;

SELECT title, release_date, year(release_date)
FROM movies
where year(release_date) between 2004 AND 2008;

-- Mostrar o títuulo dos filmes com classificação superior a 3, com mais de 1 prêmio e
-- com data de lançamento entre 1988 e 2009. ordenar os resultados por classificação
SELECT title, rating, awards, year(release_date)
FROM movies
WHERE rating > 3 AND awards > 1 AND year(release_date) between 1988 AND 2009
order by rating;


-- inserindo informações em uma tabela
insert into actors values (null, null, null, 'Armando', 'Santos', 5.7, 1);

-- atualizando informações em uma tabela
update actors
set last_name = 'Ferreira'
where id = 50;

-- deletando informações do banco de dados
delete from actors
where id = 50;
