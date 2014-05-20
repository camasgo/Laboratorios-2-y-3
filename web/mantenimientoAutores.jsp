<%-- 
    Document   : mantenimientoAutores
    Created on : 15-may-2014, 13:21:51
    Author     : Equipo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento de Autores</title>
    </head>
    <body>
        <h1>Mantenimiento de Autores</h1>

        <s:form action="MantenerAutores" method="get">            
            <s:textfield name="apellidos" label="Ingrese el(los) apellido(s)"/>
            <s:submit type="submit" value="Buscar"/>
        </s:form>
        <s:if test="%{autores.size() > 0}">
            <table>
                <tr>
                    <td>Identificaci&oacute;n</td>
                    <td>Nombre</td>
                    <td>Apellidos</td>
                    <td colspan="2">Acci&oacute;n</td>
                </tr>
                <s:iterator value="autores" var="autorActual">
                    <tr>
                        <td><s:property value="#autorActual.codAutor"/></td>
                        <td><s:property value="#autorActual.nombreAutor"/></td>
                        <td><s:property value="#autorActual.apellidosAutor"/></td>
                        <td>
                            <s:url action="EditarAutor.action" var="url">
                                <s:param name="codAutor" value="#autorActual.codAutor"/>
                            </s:url>
                            <a href="<s:property value="#url"/>">Editar</a>
                        </td>
                        <td>
                            <s:url action="EliminarAutor.action" var="url">
                                <s:param name="codAutor" value="#autorActual.codAutor"/>
                            </s:url>
                            <a href="<s:property value="#url"/>">Eliminar</a>
                        </td>
                    </tr>
                </s:iterator>                
            </table>
        </s:if>
    </body>
</html>
