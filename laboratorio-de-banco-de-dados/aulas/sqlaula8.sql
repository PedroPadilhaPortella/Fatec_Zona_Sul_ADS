-- nome dos cds da gravadora 1
select cd.nome, gravadora.nome, gravadora.id
	from cd inner join gravadora
	on cd.gravadoraId = gravadora.id
    where cd.gravadoraId = 1;
    
-- quais as musicas do cd 1
select cd.nome, cd.id, musica.id, musica.nome
	from cd join faixa on cd.id = faixa.cdId
    join musica on faixa.musicaId = musica.id
	where cd.id = 1
    group by musica.nome;
    
select cd.nome, cd.id, musica.id, musica.nome
	from cd, faixa, musica
    where cd.id = faixa.cdId
    and faixa.musicaId = musica.id
	and cd.id = 1
    group by musica.nome;
    
-- quais os autores da gravadora 1
select autor.nome, autor.id, gravadora.id, gravadora.nome
	from gravadora join cd on cd.gravadoraId = gravadora.id
    join faixa on cd.id = faixa.cdId
    join musica on faixa.musicaId = musica.id
    join musica_autor on musica.id = musica_autor.musicaId
    join autor on musica_autor.autorId = autor.id
	where gravadora.id = 1
    group by autor.id;
    
select autor.nome, autor.id, gravadora.id, gravadora.nome
	from gravadora, cd, faixa, musica, musica_autor, autor
    where gravadora.id = cd.gravadoraId
    and cd.id = faixa.cdId
    and faixa.musicaId = musica.id
    and musica.id = musica_autor.musicaId
    and musica_autor.autorId = autor.id
	and gravadora.id = 1
    group by autor.id;