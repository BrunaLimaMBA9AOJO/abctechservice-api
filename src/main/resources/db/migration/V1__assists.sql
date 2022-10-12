create table assistances
(
    id          bigint auto_increment
        primary key,
    description varchar(300) not null,
    name        varchar(100) not null
);

INSERT INTO assistances (name,description) VALUES ('Troca de Aparelho','Troca de Aparelho decodificador de Sinal');
INSERT INTO assistances (name,description) VALUES ('Troca de Cabo Interno','Troca de cabo interno');
INSERT INTO assistances (name,description) VALUES ('Troca de Fiação Interna','Troca de Fiação Interna Residencial');
INSERT INTO assistances (name,description) VALUES ('Manutenção de Fogão','Reparo sem a necessidade de comprar peças');
INSERT INTO assistances (name,description) VALUES ('Troca de Geladeira','Reparo sem a necessidade de comprar peças');
INSERT INTO assistances (name,description) VALUES ('Troca de Maquina de Lavar','Reparo sem a necessidade de comprar peças');