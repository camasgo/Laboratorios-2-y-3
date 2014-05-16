<%-- 
    Document   : insertarLibro
    Created on : Apr 3, 2014, 3:55:23 PM
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar un nuevo libro</title>
    </head>
    <body>
        <h1>Insertar un nuevo libro</h1>
        <s:form  action="InsertarLibroSalvar" method="post">
            <s:textfield name="titulo" label="Título"/>
            <s:textfield name="anoPublicacion" label="Año"/>
            <s:select name="nombrePublicador" list="publicadores" listKey="codPublicador" listValue="nombrePublicador" label="Publicador"/>
            <s:textfield name="isbn" label="ISBN"/>                        
            <s:select name="nombreAutor" list="autoresDisponibles" multiple="true" listKey="codAutor" listValue="%{apellidosAutor + ', ' + nombreAutor}"></s:select>            
            <s:submit type="submit" action="InsertarLibroIncluir" value=">>" />
            <s:submit type="submit" action="InsertarLibroExcluir" value="<<"/>
            <s:select name="nombreAutor" list="libro.autores" multiple="true" listKey="codAutor" listValue="%{apellidosAutor + ', ' + nombreAutor}"></s:select>
            <s:submit type="submit" value="Insertar Libro"/>
        </s:form>
    </body>
</html>
