create database bdNoite2021;
use bdNoite2021;

create table autor (
	id integer not null primary key auto_increment,
    nome varchar(50) not null
);

create table musica (
	id integer not null primary key auto_increment,
    nome varchar(50) not null,
    duracao decimal(4,2) not null
);

create table musica_autor (
	musicaId integer not null,
    autorId integer not null,
    foreign key (autorId) references autor(id),
    foreign key (musicaId) references musica(id)
);

create table cd_categoria (
	id integer not null primary key auto_increment,
    menorPreco decimal(6, 2) not null,
    maiorPreco decimal(7, 2) not null
);

create table gravadora (
	id integer not null primary key auto_increment,
    nome varchar(50) not null,
    endereco varchar(100) not null,
    telefone numeric(14, 0) not null,
    contato numeric(14, 0) not null,
    url varchar(80) not null
);

create table cd (
	id integer not null primary key auto_increment,
    nome varchar(50) not null,
    precoVenda decimal(7,2) not null,
    dataLancamento datetime not null,
    gravadoraId integer not null,
    cdCategoriaId integer not null,
    cdIndicado integer not null,
    foreign key(gravadoraId) references gravadora(id),
    foreign key(cdCategoriaId) references cd_categoria(id),
    foreign key(cdIndicado) references cd(id)
);

create table faixa (
	numeroFaixa integer not null,
    cdId integer not null, 
    musicaId integer not null,
    foreign key(cdId) references cd(id),
    foreign key(musicaId) references musica(id)
);

-- create table item_cd (
-- 	cdId integer not null,
--     musicaId integer not null,
--     numeroFaixa integer not null,
--     foreign key(cdId) references cd(id),
--     foreign key(musicaId) references musica(id),
--     foreign key(numeroFaixa) references faixa(id)
-- );