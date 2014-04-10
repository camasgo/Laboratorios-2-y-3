
ALTER PROCEDURE insertar_libro 
(
	@num_libro int OUTPUT,
	@cod_publicador int,
	@titulo_libro varchar(50),
	@ano_publicacion smallint,
	@isbn varchar(15),
	@precio float
)
AS
BEGIN
	INSERT INTO Libro
(
	cod_publicador,
	titulo_libro,
	ano_publicacion,
	isbn,
	precio
)
     VALUES
	(
		@cod_publicador,
		@titulo_libro,
		@ano_publicacion,
		@isbn,
		@precio
	)
	SELECT num_libro = @@IDENTITY;
END
GO
