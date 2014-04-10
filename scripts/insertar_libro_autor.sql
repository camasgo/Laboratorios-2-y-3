
CREATE PROCEDURE insertar_libro_autor
(
	@cod_libro int,
	@cod_autor int
)
AS
BEGIN
INSERT INTO Libro_Autor
(
	cod_libro,
	cod_autor
)
     VALUES
	(
		@cod_libro,
		@cod_autor
	)
END
GO
