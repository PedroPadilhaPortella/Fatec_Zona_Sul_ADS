<%-- 
    Document   : validaExcluiUsuario
    Created on : 08/04/2021, 20:34:03
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Livro"%>
<%@page import="revisaodm2021n.controles.ControleLivro"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Livro uEntrada = new Livro(id);
    ControleLivro usuCont = new ControleLivro();
    Livro uSaida = usuCont.excluir(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>VALIDA EXCLUSÃO</h1>
        ID = <%=uSaida.getId()%> <br>
        TITULO = <%=uSaida.getTitulo()%> <br>
        AUTOR = <%=uSaida.getAutor()%> <br>
        EDITORA = <%=uSaida.getEditora()%> <br>
        GENERO = <%=uSaida.getGenero()%> <br>
    </div>
    </body>
</html>
