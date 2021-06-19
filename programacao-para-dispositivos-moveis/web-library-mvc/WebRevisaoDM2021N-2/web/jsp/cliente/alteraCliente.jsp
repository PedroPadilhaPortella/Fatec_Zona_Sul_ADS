<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Cliente"%>
<%@page import="revisaodm2021n.controles.ControleCliente"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Cliente uEntrada = new Cliente(id);
    ControleCliente usuCont = new ControleCliente();
    Cliente uSaida = usuCont.buscar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>ALTERA</h1>
        <form name="validaAlteraCliente" action="validaAlteraCliente.jsp" method="post">
            ID <%=uSaida.getId()%> <br>
            NOME <input type="text" name="TITULO" value="<%=uSaida.getNome()%>"> <br>
            CPF <input type="text" name="AUTOR" value="<%=uSaida.getCpf()%>"> <br>
            EMAIL <input type="text" name="EDITORA" value="<%=uSaida.getEmail()%>"> <br>
            <input type="hidden" name="ID" value="<%=uSaida.getId()%>"> <br>
            <input type="submit" name="ALTERAR" value="ALTERAR"> <br>
        </form>
    </div>
    </body>
</html>