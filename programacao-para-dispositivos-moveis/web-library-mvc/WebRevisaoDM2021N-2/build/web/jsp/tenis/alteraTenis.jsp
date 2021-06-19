<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Tenis"%>
<%@page import="revisaodm2021n.controles.ControleTenis"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Tenis uEntrada = new Tenis(id);
    ControleTenis usuCont = new ControleTenis();
    Tenis uSaida = usuCont.buscar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>ALTERA</h1>
        <form name="validaAlteraTenis" action="validaAlteraTenis.jsp" method="post">
            ID <%=uSaida.getId()%> <br>
            MARCA <input type="text" name="MARCA" value="<%=uSaida.getMarca()%>"> <br>
            TAMANHO <input type="text" name="TAMANHO" value="<%=uSaida.getTamanho()%>"> <br>
            COR <input type="text" name="COR" value="<%=uSaida.getCor()%>"> <br>
            ORIGEM <input type="text" name="ORIGEM" value="<%=uSaida.getOrigem()%>"> <br>
            PRECO <input type="text" name="PRECO" value="<%=uSaida.getPreco()%>"> <br>
            <input type="hidden" name="ID" value="<%=uSaida.getId()%>"> <br>
            <input type="submit" name="ALTERAR" value="ALTERAR"> <br>
        </form>
    </div>
    </body>
</html>