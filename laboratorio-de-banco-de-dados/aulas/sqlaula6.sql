-- quais os autores do cd 2 ?
select * from autor where id in (
	select autorId from musica_autor where id in (
		select musicaId from musica where id in (
			select  musicaId from faixa where cdId = 2 )));
            
-- quais os nomes das gravadoras em que os autores de id 5 e 6 gravaram suas musicas
select nome from gravadora
	where id in (select gravadoraId from cd
		where id in (select cdId from faixa
			where musicaId in (select id from musica
				where id in (select musicaId from musica_autor
					where autorId in (5,6)))));
            
-- quais os codigos das gravadoras, nomes dos CD's e precos de vendas das gravadoras do cd 2 e das que tem o preco menor que o do cd 5
select  gravadoraId, nome, precoVenda, id from cd where gravadoraId = (
	select gravadoraId from cd where id = 2) and precoVenda < ( select  precoVenda from cd where id = 5);