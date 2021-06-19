<%-- 
    Document   : alteraUsuario.jsp
    Created on : 08/04/2021, 20:13:33
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Livro"%>
<%@page import="revisaodm2021n.controles.ControleLivro"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Livro uEntrada = new Livro(id);
    ControleLivro usuCont = new ControleLivro();
    Livro uSaida = usuCont.buscar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>ALTERA</h1>
        <form name="validaAlteraLivro" action="validaAlteraLivro.jsp" method="post">
            ID <%=uSaida.getId()%> <br>
            TITULO <input type="text" name="TITULO" value="<%=uSaida.getTitulo()%>"> <br>
            AUTOR <input type="text" name="AUTOR" value="<%=uSaida.getAutor()%>"> <br>
            EDITORA <input type="text" name="EDITORA" value="<%=uSaida.getEditora()%>"> <br>
            GENERO <input type="text" name="GENERO" value="<%=uSaida.getGenero()%>"> <br>
            <input type="hidden" name="ID" value="<%=uSaida.getId()%>"> <br>
            <input type="submit" name="ALTERAR" value="ALTERAR"> <br>
        </form>
    </div>
    </body>
</html>