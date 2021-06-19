<%-- 
    Document   : validaInseriUsuario
    Created on : 08/04/2021, 20:39:51
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Livro"%>
<%@page import="revisaodm2021n.controles.ControleLivro"%>

<%
    String titulo = request.getParameter("TITULO");
    String autor = request.getParameter("AUTOR");
    String editora = request.getParameter("EDITORA");
    String genero = request.getParameter("GENERO");

    Livro uEntrada = new Livro(titulo, autor, editora, genero);
    ControleLivro usuCont = new ControleLivro();
    Livro uSaida = usuCont.inserir(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>INCLUSÃO CONCLUIDA</h1>
        ID = <%=uSaida.getId()%> <br>
        TITULO = <%=uSaida.getTitulo()%> <br>
        AUTOR = <%=uSaida.getAutor()%> <br>
        EDITORA = <%=uSaida.getEditora()%> <br>
        GENERO = <%=uSaida.getGenero()%> <br>
    </div>
    </body>
</html>
