
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="revisaodm2021n.dados.Cliente" %>
<%@page import="revisaodm2021n.controles.ControleCliente" %>
<%@page import="revisaodm2021n.dados.Livro" %>
<%@page import="revisaodm2021n.controles.ControleLivro" %>

<%
    request.setCharacterEncoding("UTF-8");
    String nome = "";
    Cliente clienteEntrada = new Cliente(nome);
    ControleCliente controleCliente = new ControleCliente();
    List<Cliente> listaClientes = controleCliente.listar(clienteEntrada);
%>

<%
    Livro livroEntrada = new Livro(nome);
    ControleLivro controleLivro = new ControleLivro();
    List<Livro> listaLivros = controleLivro.listar(livroEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <head>
        <title>Emprestar Livro</title>
    </head>
    <body>
        <div class="container">
            <h1>INSERIR</h1>
            <form name="validaInseriEmprestimo" action="validaInseriEmprestimo.jsp" method="post">
                NOME DO CLIENTE <select name="IDCLIENTE" class="browser-default" style="width: 300px">
                    <% if (!(listaClientes.isEmpty())) { %>
                    <% for (Cliente cliente : listaClientes) {%>
                    <option value="<%=cliente.getId()%>"><%=cliente.getNome()%></option>
                    <% } %>
                    <% } else { %><% }%>
                </select><br>
                NOME DO LIVRO <select name="IDLIVRO" class="browser-default" style="width: 300px">
                    <% if (!(listaLivros.isEmpty())) { %>
                    <% for (Livro livro : listaLivros) {%>
                    <option value="<%=livro.getId()%>"><%=livro.getTitulo()%></option>
                    <% } %>
                    <% } else { %><% }%>
                </select>                       
                DATA DE EMPRESTIMO <input type="text" name="DATAEMPRESTIMO" value="" style="width: 300px"> <br>          
                <input type="submit" name="INSERIR" value="INSERIR"> <br>
            </form>
        </div>
    </body>
</html>