<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Cliente"%>
<%@page import="revisaodm2021n.controles.ControleCliente"%>

<%
    String nome = request.getParameter("NOME");
    String cpf = request.getParameter("CPF");
    String email = request.getParameter("EMAIL");

    Cliente uEntrada = new Cliente(nome, cpf, email);
    ControleCliente usuCont = new ControleCliente();
    Cliente uSaida = usuCont.inserir(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>INCLUSÃO CONCLUIDA</h1>
        ID = <%=uSaida.getId()%> <br>
        NOME = <%=uSaida.getNome()%> <br>
        CPF = <%=uSaida.getCpf()%> <br>
        EMAIL = <%=uSaida.getEmail()%> <br>
    </div>
    </body>
</html>
