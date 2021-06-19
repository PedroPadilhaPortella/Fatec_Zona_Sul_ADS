<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Tenis"%>
<%@page import="revisaodm2021n.controles.ControleTenis"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Tenis uEntrada = new Tenis(id);
    ControleTenis usuCont = new ControleTenis();
    Tenis uSaida = usuCont.excluir(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>VALIDA EXCLUSÃO</h1>
        ID = <%=uSaida.getId()%> <br>
        MARCA = <%=uSaida.getMarca()%> <br>
        TAMANHO = <%=uSaida.getTamanho()%> <br>
        COR = <%=uSaida.getCor()%> <br>
        ORIGEM = <%=uSaida.getOrigem()%> <br>
        PRECO = R$ <%=uSaida.getPreco()%> <br>
    </div>
    </body>
</html>
