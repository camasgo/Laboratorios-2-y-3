<%-- 
    Document   : eliminarAutor
    Created on : May 19, 2014, 7:45:14 PM
    Author     : Carlos
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
        <h1>Borrado de autores</h1>
        <s:form action="EliminarAutor" method="eliminar">
            <s:text name="autor.borrado.identificacion" var="%{autor.codAutor}"/>
            <s:text name="autor.borrado.nombre" var="%{autor.nombreAutor}+' '+ %{autor.apellidosAutor}"/> 
        ¿Seguro que desea borrar este autor?
        <s:submit action="EliminarAutor" value="Borrar"/>
        <s:submit value="Cancelar"/>
        </s:form>        
    </body>
</html>
