USE BookStore
GO
CREATE PROCEDURE sp_editar_autor
(
	@cod_autor int,
	@nombre_autor varchar(25),
	@apellidos_autor varchar(50)
)
AS
BEGIN
	UPDATE Autor
	SET nombre_autor = @nombre_autor
      ,apellidos_autor = @apellidos_autor
	WHERE cod_autor = @cod_autor
END
GO
