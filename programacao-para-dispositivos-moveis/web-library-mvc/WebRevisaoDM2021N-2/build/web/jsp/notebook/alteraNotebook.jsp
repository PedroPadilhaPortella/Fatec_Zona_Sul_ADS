<%-- 
    Document   : alteraUsuario.jsp
    Created on : 08/04/2021, 20:13:33
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Notebook"%>
<%@page import="revisaodm2021n.controles.ControleNotebook"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Notebook uEntrada = new Notebook(id);
    ControleNotebook usuCont = new ControleNotebook();
    Notebook uSaida = usuCont.buscar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>ALTERA</h1>
        <form name="validaAlteraNotebook" action="validaAlteraNotebook.jsp" method="post">
            ID <%=uSaida.getId()%> <br>
            NOME <input type="text" name="NOME" value="<%=uSaida.getNome()%>"> <br>
            MARCA <input type="text" name="MARCA" value="<%=uSaida.getMarca()%>"> <br>
            PROCESSADOR <input type="text" name="PROCESSADOR" value="<%=uSaida.getProcessador()%>"> <br>
            RAM <input type="text" name="RAM" value="<%=uSaida.getRam()%>"> <br>
            PRECO <input type="text" name="PRECO" value="<%=uSaida.getPreco()%>"> <br>
            <input type="hidden" name="ID" value="<%=uSaida.getId()%>"> <br>
            <input type="submit" name="ALTERAR" value="ALTERAR"> <br>
        </form>
    </div>
    </body>
</html>