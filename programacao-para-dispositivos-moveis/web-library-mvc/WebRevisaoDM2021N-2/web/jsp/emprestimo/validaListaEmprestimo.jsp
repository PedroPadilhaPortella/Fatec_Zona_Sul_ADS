<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="revisaodm2021n.dados.Emprestimo" %>
<%@page import="revisaodm2021n.controles.ControleEmprestimo" %>

<%
    String nome = request.getParameter("NOME");
    Emprestimo uEntrada = new Emprestimo(nome);
    ControleEmprestimo contUsu = new ControleEmprestimo();
    List<Emprestimo> usSaida = contUsu.listarPorCliente(uEntrada);
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
                    <TD>TITULO</TD>
                    <TD>DATA DE EMPRESTIMO</TD>
                    <TD>ALTERAR</TD>
                    <TD>EXCLUIR</TD>

                </TR>
             <% if(!(usSaida.isEmpty())) { %>
                <% for (Emprestimo usu :usSaida){ %>
                <TR>
                    <TD><%=usu.getId()%></TD>
                    <TD><%=usu.getIdCliente()%></TD>
                    <TD><%=usu.getIdLivro()%></TD>
                    <TD><%=usu.getDataEmprestimo()%></TD>
                    <TD><a href="alteraEmprestimo.jsp?ID=<%=usu.getId()%>">Altera</a></TD>
                    <TD><a href="validaExcluiEmprestimo.jsp?ID=<%=usu.getId()%>">Excluir</a></TD>
                </TR>
                <% } %>
            <% } else { %>
                <TR>
                    <TD>Não há nenhum Emprestimo realizado por este Cliente até o momento</TD>
                </TR>
           <% } %>
            </table>
    </div>
    </body>
</html>
