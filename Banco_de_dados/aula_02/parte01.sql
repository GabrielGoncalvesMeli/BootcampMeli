use bd_meli01;
SELECT * FROM user;

-- apagar toda a tabela
-- drop table user;



create table user(
  id integer,
  nome varchar(100)
  
);

insert into user values(1, 'Gabriel Goncalves');

-- modificaa o id já criado para ser uma primary key
alter table user
add constraint primary key(id);

-- nao permite pois ja existe com id 1
insert into user values(1, 'Fabiana Rocha');

-- onde já tinha informação o campo email vai ficar como null
alter table user
add email varchar(50);


-- atualiza/adiciona email ao dado já existente
update user set email = 'marcos@email.com' where id = 1;


-- tornar o email ccomo campo q nao permite duplicação
alter table user
add constraint unique(email);
-- com isso o email passa a ser um campo indexado