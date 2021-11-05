/*Desafio valendo nota!!!
EXEC sp_calcula +, 13, 28 e a procedure retorna o resultado,
sabendo-se que o usu�rio poder� escolher as op��es:
+
-
*
/
i -> parImpar
p -> primo
f -> fatorial
g -> imc
*/

CREATE PROCEDURE sp_soma @num1 INT, @num2 INT AS
DECLARE @res INT
SET @res = @num1 + @num2
PRINT @res;
GO


CREATE PROCEDURE sp_sub @num1 INT, @num2 INT AS
DECLARE @res INT
SET @res = @num1 - @num2
PRINT @res;
GO


ALTER PROCEDURE sp_div @num1 DECIMAL(4,2), @num2 DECIMAL(4,2) AS
DECLARE @res DECIMAL(4,2)
IF @num2 != 0 BEGIN
	SET @res = @num1 / @num2
	PRINT @res
END
ELSE
	PRINT 'IMPOSSIVEL DIVIDIR POR 0!'
GO


CREATE PROCEDURE sp_mult @num1 INT, @num2 INT AS
DECLARE @res INT
SET @res = @num1 * @num2
PRINT @res;
GO


CREATE PROCEDURE sp_calcula @operador CHAR(1), @num1 INT, @num2 INT AS
DECLARE @res INT
IF @operador = '+'  
	EXEC sp_soma @num1, @num2
ELSE IF @operador = '-' 
	EXEC sp_sub @num1, @num2
ELSE IF
	@operador = '/' 
	EXEC sp_div @num1, @num2
ELSE IF @operador = '*' 
	EXEC sp_mult @num1, @num2


EXEC sp_calcula '+', 13, 28;
GO


CREATE PROCEDURE sp_parImpar @num INT AS
IF @num % 2 = 0
	PRINT 'NUMERO PAR'
ELSE
	PRINT 'NUMERO IMPAR'
GO


EXEC sp_parImpar 10
GO


CREATE PROCEDURE sp_primo @num INT AS
DECLARE @isPrimo CHAR(1)
DECLARE @cont INT
SET @cont = 2
SET @isPrimo = 's'

IF @num<2
	SET @isPrimo = 'n'
WHILE @num > @cont BEGIN
	IF @num % @cont = 0
		SET @isPrimo = 'n'
	SET @cont = @cont + 1
END

IF @isPrimo = 's'
	PRINT 'O NUMERO E PRIMO'
ELSE 
	PRINT 'O NUMERO NAO E PRIMO'
GO

EXEC sp_primo 4
go


CREATE PROCEDURE sp_imc @peso DECIMAL(5,2), @altura DECIMAL(3,2) AS
DECLARE @imc DECIMAL(4,2)
SET @imc = @peso / (@altura*@altura)
PRINT @imc
GO

EXEC sp_imc 66, 1.70
GO


CREATE PROCEDURE sp_fatorial @num INT AS
DECLARE @f INT
DECLARE @c INT
SET @f = 1
SET @c = @num
WHILE @c >= 1 BEGIN
	SET @f = @f * @c
	SET @c = @c - 1
END
PRINT @f
GO

EXEC sp_fatorial 10