<%-- 
    Document   : validaInseriUsuario
    Created on : 08/04/2021, 20:39:51
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Notebook"%>
<%@page import="revisaodm2021n.controles.ControleNotebook"%>

<%
    String nome = request.getParameter("NOME");
    String marca = request.getParameter("MARCA");
    String processador = request.getParameter("PROCESSADOR");
    String ram = request.getParameter("RAM");
    String preco = request.getParameter("PRECO");

    Notebook uEntrada = new Notebook(nome, marca, processador, ram, preco);
    ControleNotebook usuCont = new ControleNotebook();
    Notebook uSaida = usuCont.inserir(uEntrada);
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
        MARCA = <%=uSaida.getMarca()%> <br>
        PROCESSADOR = <%=uSaida.getProcessador()%> <br>
        RAM = <%=uSaida.getRam()%> <br>
        PRECO = R$ <%=uSaida.getPreco()%> <br>
    </div>
    </body>
</html>
