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
        <s:set value="Guardar" name="action"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar un nuevo libro</title>
        <script type="text/javascript">
            function incluir() {
                document.getElementById("action").action = "IncluirAutor";
            }
            function excluir() {
                document.getElementById("action").action = "ExcluirAutor";
            }
            function guardar() {
                document.getElementById("action").action = "Guardar";
            }
        </script>

    </head>
    <body>
        <h1>Insertar un nuevo libro</h1>
        <s:form method="post" id="action">
            <s:textfield name="tituloLibro" label="Título"/><br>
            <s:textfield name="anoPublicacion" label="Año"/>
            <s:select name="publicador.codPublicador" list="publicadores" listKey="codPublicador" listValue="nombrePublicador" label="Publicador"/>
            <s:textfield name="isbn" label="ISBN"/>                        
            <s:select name="autoresSel" list="autoresDisponibles" multiple="true" listKey="codAutor" listValue="%{apellidosAutor + ', ' + nombreAutor}"></s:select>            
            <s:submit onclick="incluir()" value=">>" />
            <s:submit onclick="excluir()" value="<<"/>
            <s:select name="autoresSel" list="libro.autores" multiple="true" listKey="codAutor" listValue="%{apellidosAutor + ', ' + nombreAutor}"></s:select>
            <s:submit onclick="guardar()" value="Insertar Libro"/>
        </s:form>
    </body>
</html>