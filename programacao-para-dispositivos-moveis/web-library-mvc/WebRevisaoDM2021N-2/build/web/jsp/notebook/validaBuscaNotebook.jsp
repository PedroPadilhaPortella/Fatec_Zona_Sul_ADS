<%-- 
    Document   : validaBuscaUsuario
    Created on : 09/04/2021, 20:09:56
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Notebook"%>
<%@page import="revisaodm2021n.controles.ControleNotebook"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Notebook uEntrada = new Notebook(id);
    ControleNotebook contUsu = new ControleNotebook();
    Notebook uSaida = contUsu.buscar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
    <h1>VALIDA BUSCA</h1>
        <% if(uSaida != null) { %>
        Notebook = <%=uSaida.getId()%> | <%=uSaida.getNome()%> | <%=uSaida.getMarca()%> | <%=uSaida.getProcessador()%> | <%=uSaida.getRam()%> GB | R$ <%=uSaida.getPreco()%> <br>   
        <% } else { %>
            Este Notebook não existe!
        <% } %>
    </div>
    </body>
</html>
