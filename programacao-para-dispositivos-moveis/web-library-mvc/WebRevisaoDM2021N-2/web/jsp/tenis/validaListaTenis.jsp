<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="revisaodm2021n.dados.Tenis" %>
<%@page import="revisaodm2021n.controles.ControleTenis" %>

<%
    String marca = request.getParameter("MARCA");
    Tenis uEntrada = new Tenis(marca);
    ControleTenis contUsu = new ControleTenis();
    List<Tenis> usSaida = contUsu.listar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>LISTA</h1> <br>
            <TABLE>
                <TR>
                    <TD>ID</TD>
                    <TD>MARCA</TD>
                    <TD>TAMANHO</TD>
                    <TD>COR</TD>
                    <TD>ORIGEM</TD>
                    <TD>PRECO</TD>
                    <TD>ALTERAR</TD>
                    <TD>EXCLUIR</TD>

                </TR>
             <% if(!(usSaida.isEmpty())) { %>
                <% for (Tenis tenis :usSaida){ %>
                <TR>
                    <TD><%=tenis.getId()%></TD>
                    <TD><%=tenis.getMarca()%></TD>
                    <TD><%=tenis.getTamanho()%></TD>
                    <TD><%=tenis.getCor()%></TD>
                    <TD><%=tenis.getOrigem()%> GB</TD>
                    <TD>R$<%=tenis.getPreco()%></TD>
                    <TD><a href="alteraTenis.jsp?ID=<%=tenis.getId()%>">Altera</a></TD>
                    <TD><a href="validaExcluiTenis.jsp?ID=<%=tenis.getId()%>">Excluir</a></TD>
                </TR>
                <% } %>
            <% } else { %>
                <TR>
                    <TD>Não há nenhum tênis cadastrado</TD>
                </TR>
           <% } %>
            </table>
    </div>
    </body>
</html>
