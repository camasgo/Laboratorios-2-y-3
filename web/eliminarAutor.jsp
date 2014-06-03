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
        <title><s:text name="autor.borrado.titulo"/></title>
    </head>
    <body>
        <h1><s:text name="autor.borrado.encabezado"/></h1>
        <s:text name="autor.borrado.identificacion"/>
        <s:property value="autor.codAutor"/><br>
        <s:text name="autor.borrado.nombre"/> 
        <s:property value="autor.nombreAutor"/> <s:property value="autor.apellidosAutor"/><br>
        <s:property value="autor.borrado.msj_confirmacion="/>
        <s:form action="BorrarAutor">
            <s:hidden name="codAutor" value="%{codAutor}"/>
            <s:submit value="Borrar"/>
        </s:form>  
        <s:form action="Cancelar">            
            <s:submit value="Cancelar"/>
        </s:form>        
    </body>
</html>
