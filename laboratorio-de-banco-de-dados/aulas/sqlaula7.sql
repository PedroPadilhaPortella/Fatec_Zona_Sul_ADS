select id, nome from autor union all select id, nome from musica;

select id, nome from autor where autor.id between 1 and 5 
	union select id, nome from musica where musica.id between 6 and 10;

-- União entre Cd e Gravadora
select id, nome from cd union select id, nome from gravadora;


-- União entre cd.id 1 e as gravadoras.id >= 6
select id, nome from cd where cd.id = 1 
	union select id, nome from gravadora where gravadora.id >= 6;
 
 -- União em Blocos de Cd e Gravadora
select id, nome from cd
	union all select id, nome from gravadora;
    
-- União em blocos de Cds, gravadoras, músicas e autores
select id, nome from cd
	union all select id, nome from gravadora
	union all select id, nome from musica
	union all select id, nome from autor;

-- A união das músicas do cd 1 e o cd1
select id, nome from musica where id in (select musicaId from faixa where cdId = 1) union select id, nome from cd where id = 1;

-- Quais são as musicas que foram gravadas
 -- select id from musica intersect select id from cd;

-- autores que não tem musica
-- SELECT id FROM autor EXCEPT SELECT autorId FROM musica_autor;

select nome, precoVenda
	case 
		when precoVenda < 10 then *.9
        when precoVenda >= 10 and precoVenda < 13 then *.8
        when precoVenda >= 13 then *.7
	end as venda
from cd;