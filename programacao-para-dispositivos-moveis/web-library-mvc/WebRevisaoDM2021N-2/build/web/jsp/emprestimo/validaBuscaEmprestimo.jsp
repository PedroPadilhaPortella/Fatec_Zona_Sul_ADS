<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Emprestimo"%>
<%@page import="revisaodm2021n.controles.ControleEmprestimo"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Emprestimo uEntrada = new Emprestimo(id);
    ControleEmprestimo contUsu = new ControleEmprestimo();
    Emprestimo uSaida = contUsu.buscar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
    <h1>VALIDA BUSCA</h1>
        <% if(uSaida != null) { %>
        Livro = <%=uSaida.getId()%> | <%=uSaida.getIdCliente()%> | <%=uSaida.getIdLivro()%> | <%=uSaida.getDataEmprestimo()%> <br>   
        <% } else { %>
            Este Emprestimo não está registrado!
        <% } %>
    </div>
    </body>
</html>
