<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Tenis"%>
<%@page import="revisaodm2021n.controles.ControleTenis"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    String marca = request.getParameter("MARCA");
    String tamanho = request.getParameter("TAMANHO");
    String cor = request.getParameter("COR");
    String origem = request.getParameter("ORIGEM");
    String preco = request.getParameter("PRECO");

    Tenis uEntrada = new Tenis(id, marca, tamanho, cor, origem, preco);
    ControleTenis usuCont = new ControleTenis();
    Tenis uSaida = usuCont.alterar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>ALTERAÇÃO CONCLUIDA</h1>
        ID = <%=uSaida.getId()%> <br>
        MARCA = <%=uSaida.getMarca()%> <br>
        TAMANHO = <%=uSaida.getTamanho()%> <br>
        COR = <%=uSaida.getCor()%> <br>
        ORIGEM = <%=uSaida.getOrigem()%> <br>
        PRECO = R$ <%=uSaida.getPreco()%> <br>
    </div>
    </body>
</html>
