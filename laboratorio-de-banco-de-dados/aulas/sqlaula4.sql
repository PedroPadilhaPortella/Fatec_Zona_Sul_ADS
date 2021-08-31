select count(*) as cds, gravadoraId from cd group by gravadoraId;
-- Quantas músicas tem cada cd?

-- Qual a média de preço dos cd´s por gravadora?
select avg(precoVenda) as preco, gravadoraId from cd group by gravadoraId;

-- Qual a menor data de lançamento?
select min(dataLancamento) from cd;

-- Qual a maior duração?
select max(duracao) from musica;

-- Qual o total de autores agrupados por música? E das músicas menores que 15?
select count(autorId) as autores, musicaId from musica_autor group by musicaId;
select count(autorId) as autores, musicaId from musica_autor where musicaId < 15 group by musicaId;

-- Monte o CD=3 com a menor quantidade de músicas, sabendo-se que um cd possui o total de 77 min.
select * from musica order by duracao desc;
select sum(duracao) from musica where id in(8, 12, 15, 10, 5, 30, 13, 4, 6, 31, 2, 22, 17, 11, 14, 23, 25);

-- musicas por cd
select count(faixa.musicaId) as musicas, faixa.cdId from faixa group by cdId;

-- musicas por autor
select count(musicaId) as musicas, autorId from musica_autor group by autorId;