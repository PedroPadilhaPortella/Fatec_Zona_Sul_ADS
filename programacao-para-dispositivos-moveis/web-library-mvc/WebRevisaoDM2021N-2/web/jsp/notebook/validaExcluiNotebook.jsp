<%-- 
    Document   : validaExcluiUsuario
    Created on : 08/04/2021, 20:34:03
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Notebook"%>
<%@page import="revisaodm2021n.controles.ControleNotebook"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Notebook uEntrada = new Notebook(id);
    ControleNotebook usuCont = new ControleNotebook();
    Notebook uSaida = usuCont.excluir(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>VALIDA EXCLUSÃO</h1>
        ID = <%=uSaida.getId()%> <br>
        NOME = <%=uSaida.getNome()%> <br>
        MARCA = <%=uSaida.getMarca()%> <br>
        PROCESSADOR = <%=uSaida.getProcessador()%> <br>
        RAM = <%=uSaida.getRam()%> <br>
        PRECO = R$ <%=uSaida.getPreco()%> <br>
    </div>
    </body>
</html>
