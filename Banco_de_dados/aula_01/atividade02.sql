DROP DATABASE IF EXISTS internet_provider;
CREATE DATABASE internet_provider;
USE internet_provider;

DROP TABLE IF EXISTS clients_plans;
DROP TABLE IF EXISTS clients;
DROP TABLE IF EXISTS plans;

CREATE TABLE plans(
	id int(10) unsigned NOT NULL auto_increment,
    speed integer not null,
    price decimal(5,2) not null,
    discount decimal(3,2) not null default 0,
    PRIMARY KEY(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE clients (
	id int(10) unsigned NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    birth_date DATE NOT NULL,
    state VARCHAR(50),
    city VARCHAR(50),
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE clients_plans(
    client_id int(10) unsigned not null,
    plan_id int(10) unsigned not null,
    constraint client_plan PRIMARY KEY(client_id, plan_id),
    constraint plan_client_plan_id_foreign foreign key (plan_id) references plans(id),
    constraint plan_client_client_id_foreign foreign key (client_id) references clients(id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- drop table plans;

-- delete from plans where id = 150;

INSERT INTO plans values (null, 50, 99.90, 0.05);
INSERT INTO plans values (null, 100, 109.90, 0.05);
INSERT INTO plans values (null, 150, 139.90, 0.1);
INSERT INTO plans values (null, 200, 149.90, 0.05);
INSERT INTO plans values (null, 500, 179.90, 0.02);


INSERT into clients values(null, "Gabriel", "Medeiros", "1998-05-28", "Goiás", "Trindade");
INSERT into clients values(null, "Deyvid", "Mendes", "1998-01-13", "Goiás", "Trindade");
INSERT into clients values(null, "Arthur", "Massaini", "1992-11-15", "Goiás", "Goiânia");
INSERT into clients values(null, "Winsgton", "Gonçalves", "1997-05-14", "Goiás", "Trindade");

INSERT into clients_plans values(1, 2);
INSERT into clients_plans values(1, 3);
INSERT into clients_plans values(2, 1);
INSERT into clients_plans values(3, 4);
INSERT into clients_plans values(4, 3);
INSERT into clients_plans values(4, 5);



SELECT * FROM clients
inner join clients_plans
on clients.id = clients_plans.client_id
inner join plans
on plans.id = clients_plans.plan_id
where plans.id = 3;


SELECT clients.first_name, clients.last_name, plans.speed, plans.price
from clients
inner join clients_plans
on clients.id = clients_plans.client_id
inner join plans
on plans.id = clients_plans.plan_id;


