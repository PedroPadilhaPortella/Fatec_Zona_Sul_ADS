# Exercicio 1
select * from musica where duracao >= 5.0 and duracao <= 9.0;
select * from faixa where numeroFaixa = 11 or numeroFaixa = 13 or numeroFaixa = 17 or numeroFaixa = 33 or numeroFaixa = 50;
select * from gravadora order by nome;
select * from cd_categoria where menorPreco > 20.0 and maiorPreco < 40.0;

alter table gravadora modify endereco varchar(100) null;

insert into gravadora (id, nome, endereco, telefone, contato, url) values
	(6, "GR6", NULL, 551598764142, 551598764142, "gr6@explode@gmail.com.br"),
    (7, "KondZilla", NULL, 5511987654321, 5511987654321, "kondzilla.funk@gmail.com.br"),
    (8, "Bendita", NULL, 551156473829, 551156473829, "bendita_gravadora@hotmail.com.br");
    
select * from gravadora where endereco is null;

select nome, dataLancamento from cd where dataLancamento between '1980-01-01 00:00:00' and '2001-31-12 00:00:00';

select * from musica where id in (10, 11, 13, 20);

select * from cd where precoVenda like "-%";

# Exercicio 2
select * from musica where nome like "__r_";
select * from musica where nome like "_a%";
select * from musica where nome like "a%";
select * from musica where nome like "_i_";
select * from musica where nome like "%a_";
select * from musica where nome like binary "%a_";