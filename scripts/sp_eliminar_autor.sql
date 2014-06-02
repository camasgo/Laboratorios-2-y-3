
DELETE sp_eliminar_autor

go

USE BookStore

go

CREATE PROCEDURE sp_eliminar_autor
(
	@cod_autor int
)
AS
BEGIN
	DELETE FROM Autor
      WHERE cod_autor = @cod_autor
END
GO
