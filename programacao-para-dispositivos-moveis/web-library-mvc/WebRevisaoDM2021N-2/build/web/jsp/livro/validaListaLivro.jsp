<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="revisaodm2021n.dados.Livro" %>
<%@page import="revisaodm2021n.controles.ControleLivro" %>

<%
    String titulo = request.getParameter("TITULO");
    Livro uEntrada = new Livro(titulo);
    ControleLivro contUsu = new ControleLivro();
    List<Livro> usSaida = contUsu.listar(uEntrada);
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
                    <TD>TITULO</TD>
                    <TD>AUTOR</TD>
                    <TD>EDITORA</TD>
                    <TD>GENERO</TD>
                    <TD>ALTERAR</TD>
                    <TD>EXCLUIR</TD>

                </TR>
             <% if(!(usSaida.isEmpty())) { %>
                <% for (Livro usu :usSaida){ %>
                <TR>
                    <TD><%=usu.getId()%></TD>
                    <TD><%=usu.getTitulo()%></TD>
                    <TD><%=usu.getAutor()%></TD>
                    <TD><%=usu.getEditora()%></TD>
                    <TD><%=usu.getGenero()%></TD>
                    <TD><a href="alteraLivro.jsp?ID=<%=usu.getId()%>">Altera</a></TD>
                    <TD><a href="validaExcluiLivro.jsp?ID=<%=usu.getId()%>">Excluir</a></TD>
                </TR>
                <% } %>
            <% } else { %>
                <TR>
                    <TD>Não há nenhum livro cadastrado</TD>
                </TR>
           <% } %>
            </table>
    </div>
    </body>
</html>
