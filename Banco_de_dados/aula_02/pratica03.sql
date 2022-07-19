use movies_db;
-- Mostrar todos os registros da tabela de filmes.
SELECT * FROM movies;

-- Mostrar o nome, sobrenome e classificação de todos os atores.
SELECT first_name, last_name, rating FROM actors;

-- Mostrar o título de todas as séries e use alias para que tanto o nome da tabela quanto o campo estejam em Português.
SELECT title as `título` FROM series as `séries`;

-- Mostrar o nome e sobrenome dos atores cuja classificação é superior a 7,5.
SELECT first_name, last_name, rating
FROM actors
WHERE rating > 7.5;

-- Mostrar o título dos filmes, a classificação e os prêmios dos filmes com classificação superior a 7,5 e com mais de dois prêmios.
SELECT title, rating, awards
FROM movies
WHERE rating > 7.5 AND awards > 2;

-- Mostrar o título dos filmes e a classificação ordenados por classificação em ordem crescente.
SELECT title, rating
FROM movies
ORDER BY rating;

-- Mostrar os títulos dos três primeiros filmes no banco de dados.
SELECT title FROM movies limit 3;

-- Mostrar os 5 melhores filmes com a classificação mais alta.
SELECT title, rating
FROM movies
Order by rating desc
limit 5;

-- Listar os 10 primeiros atores.
SELECT * FROM actors limit 10;

-- Mostrar o título e a classificação de todos os filmes cujo título é Toy Story.
SELECT title, rating FROM movies WHERE title like 'Toy Story%';

-- Mostrar todos os atores cujos nomes começam com Sam.
SELECT * FROM actors where first_name Like 'Sam%';

-- Mostrar o título dos filmes que saíram entre 2004 e 2008.
SELECT title, year(release_date) as `release` from movies where year(release_date) between 2004 and 2008;

-- Mostrar o título dos filmes com classificação superior a 3, com mais de 1 prêmio e
SELECT title, rating, awards from movies where rating > 3 and awards > 1;

-- com data de lançamento entre 1988 e 2009. Ordenar os resultados por classificação.
SELECT 
    title, YEAR(release_date), rating AS `release`
FROM
    movies
WHERE
    YEAR(release_date) BETWEEN 2004 AND 2008
ORDER BY rating;