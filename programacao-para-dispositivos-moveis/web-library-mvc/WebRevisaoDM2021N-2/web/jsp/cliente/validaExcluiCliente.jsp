<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Cliente"%>
<%@page import="revisaodm2021n.controles.ControleCliente"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Cliente uEntrada = new Cliente(id);
    ControleCliente usuCont = new ControleCliente();
    Cliente uSaida = usuCont.excluir(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>VALIDA EXCLUSÃO</h1>
        ID = <%=uSaida.getId()%> <br>
        NOME = <%=uSaida.getNome()%> <br>
        CPF = <%=uSaida.getCpf()%> <br>
        EMAIL = <%=uSaida.getEmail()%> <br>
    </div>
    </body>
</html>
