<%-- 
    Document   : editarAutor
    Created on : 15-may-2014, 15:53:25
    Author     : Equipo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edici&oacute;n de la informaci&oacute;n del autor:</h1>
        <s:form action="GuardarAutor" method="post">
            <s:textfield name="codAutor" label="Indentificación" value="%{autor.codAutor}" readonly="true"/>
            <s:textfield name="nombreAutor" label="Nombre" value="%{autor.nombreAutor}"/>
            <s:textfield name="apellidosAutor" label="Indentificación" value="%{autor.apellidosAutor}"/>
            <s:textfield name="codAutor" label="Indentificación" value="#autor.codAutor" readonly="true"/>
            <s:textfield name="nombreAutor" label="Nombre" value="#autor.nombreAutor"/>
            <s:textfield name="apellidosAutor" label="Indentificación" value="#autor.apellidosAutor"/>
            <s:submit type="submit" value="Editar"/>
            <s:submit type="button" value="Cancelar"/>
        </s:form>
    </body>
</html>
