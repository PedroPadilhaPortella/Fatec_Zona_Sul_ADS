<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Tenis"%>
<%@page import="revisaodm2021n.controles.ControleTenis"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Tenis uEntrada = new Tenis(id);
    ControleTenis contUsu = new ControleTenis();
    Tenis uSaida = contUsu.buscar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
    <h1>VALIDA BUSCA</h1>
        <% if(uSaida != null) { %>
        Tenis = <%=uSaida.getId()%> | <%=uSaida.getMarca()%> | <%=uSaida.getTamanho()%> | <%=uSaida.getCor()%> | <%=uSaida.getOrigem()%> | R$ <%=uSaida.getPreco()%> <br>   
        <% } else { %>
            Este Tênis não existe!
        <% } %>
    </div>
    </body>
</html>
