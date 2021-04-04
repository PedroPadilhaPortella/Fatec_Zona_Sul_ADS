create table usuario (
id int not null auto_increment primary key,
login varchar(50) not null,
senha varchar(50) not null,
status varchar(50) not null,
tipo varchar(50) not null
);

create table departamento (
id int not null auto_increment primary key,
nome varchar(50) not null,
descricao varchar(50) not null,
centrodecusto varchar(50) not null
);

create table pessoa (
id int not null auto_increment primary key,
nome varchar(50) not null,
idade varchar(10) not null,
genero varchar(50) not null,
peso varchar(10) not null,
altura varchar(10) not null
);