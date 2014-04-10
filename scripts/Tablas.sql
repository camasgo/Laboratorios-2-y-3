USE BookStoreA80703
GO

--CREATE TABLE Publicador(
--	cod_publicador int IDENTITY(1,1) NOT NULL,
--	nombre_publicador varchar(50) NOT NULL,
--	url_sitio_web varchar(60) NOT NULL,
--	telefono varchar(8) NOT NULL,
-- CONSTRAINT PK_Publicador PRIMARY KEY (cod_publicador) 
--)

--CREATE TABLE Autor(
--	cod_autor int IDENTITY(1,1) NOT NULL,
--	nombre_autor varchar(25) NOT NULL,
--	apellidos_autor varchar(50) NOT NULL,
-- CONSTRAINT PK_Autor PRIMARY KEY (cod_autor) 
--)


--CREATE TABLE Libro(
--	cod_libro int IDENTITY(1,1) NOT NULL,
--	titulo_libro varchar(50) NOT NULL,
--	ano_publicacion smallint NOT NULL,
--	isbn varchar(15) NOT NULL,
--	cod_publicador int NOT NULL,
--	precio float NOT NULL,
-- CONSTRAINT PK_Libro PRIMARY KEY (cod_libro) 
--)


--ALTER TABLE Libro ADD  CONSTRAINT FK_Libro_Publicador FOREIGN KEY(cod_publicador)
--REFERENCES Publicador (cod_publicador)

CREATE TABLE Libro_Autor(
	cod_libro int NOT NULL,
	cod_autor int NOT NULL,
 CONSTRAINT PK_Libro_Autor PRIMARY KEY (cod_libro, cod_autor)
)
GO

ALTER TABLE Libro_Autor  WITH CHECK ADD  CONSTRAINT FK_Libro_Autor_Autor FOREIGN KEY(cod_autor)
REFERENCES Autor (cod_autor)
Go
ALTER TABLE Libro_Autor  WITH CHECK ADD  CONSTRAINT FK_Libro_Autor_Libro FOREIGN KEY(cod_autor)
REFERENCES Libro (cod_libro)
GO

