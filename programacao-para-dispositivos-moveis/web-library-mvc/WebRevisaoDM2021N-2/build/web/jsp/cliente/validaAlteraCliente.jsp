<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Cliente"%>
<%@page import="revisaodm2021n.controles.ControleCliente"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    String nome = request.getParameter("TITULO");
    String cpf = request.getParameter("AUTOR");
    String email = request.getParameter("EDITORA");

    Cliente uEntrada = new Cliente(id, nome, cpf, email);
    ControleCliente usuCont = new ControleCliente();
    Cliente uSaida = usuCont.alterar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>ALTERAÇÃO CONCLUIDA</h1>
        ID = <%=uSaida.getId()%> <br>
        TITULO = <%=uSaida.getNome()%> <br>
        AUTOR = <%=uSaida.getCpf()%> <br>
        EDITORA = <%=uSaida.getEmail()%> <br>
    </div>
    </body>
</html>
