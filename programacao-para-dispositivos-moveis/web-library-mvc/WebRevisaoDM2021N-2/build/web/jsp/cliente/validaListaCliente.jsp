<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="revisaodm2021n.dados.Cliente" %>
<%@page import="revisaodm2021n.controles.ControleCliente" %>

<%
    String nome = request.getParameter("NOME");
    Cliente uEntrada = new Cliente(nome);
    ControleCliente contUsu = new ControleCliente();
    List<Cliente> usSaida = contUsu.listar(uEntrada);
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
                    <TD>CPF</TD>
                    <TD>EMAIL</TD>
                    <TD>ALTERAR</TD>
                    <TD>EXCLUIR</TD>

                </TR>
             <% if(!(usSaida.isEmpty())) { %>
                <% for (Cliente usu :usSaida){ %>
                <TR>
                    <TD><%=usu.getId()%></TD>
                    <TD><%=usu.getNome()%></TD>
                    <TD><%=usu.getCpf()%></TD>
                    <TD><%=usu.getEmail()%></TD>
                    <TD><a href="alteraCliente.jsp?ID=<%=usu.getId()%>">Altera</a></TD>
                    <TD><a href="validaExcluiCliente.jsp?ID=<%=usu.getId()%>">Excluir</a></TD>
                </TR>
                <% } %>
            <% } else { %>
                <TR>
                    <TD>Não há nenhum Cliente cadastrado</TD>
                </TR>
           <% } %>
            </table>
    </div>
    </body>
</html>
