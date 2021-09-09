-- upper and lower
select upper(nome) from autor where nome like 'r%';

-- ascii
select ascii('F') as F, ascii('A') as A, ascii('T') as T, ascii('E') as E, ascii('C') as C, 
	ascii('F') + ascii('A') + ascii('T') + ascii('E') + ascii('C') as FATEC;
    
select ascii('P') as P, ascii('e') as e, ascii('d') as d, ascii('r') as r, ascii('o') as o, ascii(' ') as '_', ascii('H') as H, 
	ascii('P') + ascii('e') + ascii('d') + ascii('r') + ascii('o') + ascii(' ') + ascii('H') as NOME;
    
-- left and right
select left(endereco, 2) from gravadora;
select * from gravadora where upper(left(endereco, 3))  = "ROD";
select * from gravadora where lower(left(endereco, 2))  = "av";
select * from gravadora where lower(right(url, 2))  = "br";
select * from gravadora where lower(right(endereco, 1))  = "8";
select left(nome, 11) from autor;

-- substring
select nome from musica;
select substring(nome, 2, 4) from musica;
select substring(nome, -5) from musica;

-- data e hora