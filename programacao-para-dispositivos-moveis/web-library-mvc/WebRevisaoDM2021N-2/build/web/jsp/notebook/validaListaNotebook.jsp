<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="revisaodm2021n.dados.Notebook" %>
<%@page import="revisaodm2021n.controles.ControleNotebook" %>

<%
    String nome = request.getParameter("NOME");
    Notebook uEntrada = new Notebook(nome);
    ControleNotebook contUsu = new ControleNotebook();
    List<Notebook> usSaida = contUsu.listar(uEntrada);
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
                    <TD>NOME</TD>
                    <TD>MARCA</TD>
                    <TD>PROCESSADOR</TD>
                    <TD>RAM</TD>
                    <TD>PRECO</TD>
                    <TD>ALTERAR</TD>
                    <TD>EXCLUIR</TD>

                </TR>
             <% if(!(usSaida.isEmpty())) { %>
                <% for (Notebook note :usSaida){ %>
                <TR>
                    <TD><%=note.getId()%></TD>
                    <TD><%=note.getNome()%></TD>
                    <TD><%=note.getMarca()%></TD>
                    <TD><%=note.getProcessador()%></TD>
                    <TD><%=note.getRam()%> GB</TD>
                    <TD>R$<%=note.getPreco()%></TD>
                    <TD><a href="alteraNotebook.jsp?ID=<%=note.getId()%>">Altera</a></TD>
                    <TD><a href="validaExcluiNotebook.jsp?ID=<%=note.getId()%>">Excluir</a></TD>
                </TR>
                <% } %>
            <% } else { %>
                <TR>
                    <TD>Não há nenhum notebook cadastrado</TD>
                </TR>
           <% } %>
            </table>
    </div>
    </body>
</html>
