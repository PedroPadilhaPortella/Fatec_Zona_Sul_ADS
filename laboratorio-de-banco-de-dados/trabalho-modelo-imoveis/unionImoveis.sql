-- Faça uma lista com todos os códigos e nomes de compradores e códigos e nomes de vendedores
select id, nome from comprador union all select id, nome from vendedor;

/* Faça uma lista com todos os códigos e nomes de compradores e códigos e nomes de vendedores
e admita que não há repetições das linhas. */
select id, nome from comprador union select id, nome from vendedor;


/* Faça uma lista com todos os códigos e nomes de vendedores e endereço dos respectivos imóveis,
e o comprador tenha o código 2 ou o bairro seja código 1. */
select id, nome, enderecoId from vendedor union select id, nome, enderecoId from comprador where id = 2 or enderecoId = 1;

-- Faça uma lista com todos os compradores que não tenham ofertas cadastradas
select comprador.id, comprador.nome from comprador join oferta on (comprador.id = oferta.compradorId) group by comprador.id;

-- Faça uma lista de todos os vendedores que não tenham imóveis cadastrados.

-- Faça uma lista com todos os vendedores que tenham imóveis cadastrados.
-- Faça uma lista com todos os compradores que tenham ofertas cadastradas
/*Faça uma lista que mostre o código e o endereço do imóvel e aplique um desconto
no preço do imóvel seguindo estas condições:
a) Caso o preço do imóvel seja maior que 100 mil, desconto de 10%;
b) Caso seja maior que 50 mil e menor ou igual a 100 mil, desconto de 5%;
c) Caso seja maior que 30 mil e menor ou igual a 50 mil, desconto de 3% e
d) Não aplicar desconto a imóveis com valor igual ou menor que 30 mil.
*/
/*Faça uma lista que mostre o endereço do imóvel e o código do vendedor, e que,
caso o campo STVENDIDO tenha conteúdo S,
escreva VENDIDO, e do contrário, escreva DISPONÍVEL
*/
/*Faça uma lista que mostre o código do comprador e,
caso a oferta tenha data superior a 30 dias, apareça ANTIGA e, do contrário apareça NOVA.
*/