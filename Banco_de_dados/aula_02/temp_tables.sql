use movies_db;

SELECT * FROM actors;

-- cria uma tabela temporária até q a conexão com o banco seja encerrada
create temporary table actors_names 
SELECT first_name, last_name
from actors
where rating > 5;


select * from actors_names;