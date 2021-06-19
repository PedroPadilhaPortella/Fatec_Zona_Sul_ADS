<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Cliente"%>
<%@page import="revisaodm2021n.controles.ControleCliente"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Cliente uEntrada = new Cliente(id);
    ControleCliente contUsu = new ControleCliente();
    Cliente uSaida = contUsu.buscar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
    <h1>VALIDA BUSCA</h1>
        <% if(uSaida != null) { %>
        Livro = <%=uSaida.getId()%> | <%=uSaida.getNome()%> | <%=uSaida.getCpf()%> | <%=uSaida.getEmail()%> <br>   
        <% } else { %>
            Este Cliente não existe!
        <% } %>
    </div>
    </body>
</html>
