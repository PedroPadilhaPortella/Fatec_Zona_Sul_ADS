<%-- 
    Document   : validaBuscaUsuario
    Created on : 09/04/2021, 20:09:56
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Livro"%>
<%@page import="revisaodm2021n.controles.ControleLivro"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Livro uEntrada = new Livro(id);
    ControleLivro contUsu = new ControleLivro();
    Livro uSaida = contUsu.buscar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
    <h1>VALIDA BUSCA</h1>
        <% if(uSaida != null) { %>
            Livro = <%=uSaida.getId()%> | <%=uSaida.getTitulo()%> | <%=uSaida.getAutor()%> | <%=uSaida.getEditora()%> | <%=uSaida.getGenero()%> <br>   
        <% } else { %>
            Este Livro não existe!
        <% } %>
    </div>
    </body>
</html>
