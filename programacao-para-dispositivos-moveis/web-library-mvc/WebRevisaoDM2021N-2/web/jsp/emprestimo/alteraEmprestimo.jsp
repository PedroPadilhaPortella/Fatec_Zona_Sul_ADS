<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="revisaodm2021n.dados.Emprestimo"%>
<%@page import="revisaodm2021n.controles.ControleEmprestimo"%>
<%@page import="revisaodm2021n.dados.Cliente"%>
<%@page import="revisaodm2021n.controles.ControleCliente"%>
<%@page import="revisaodm2021n.dados.Livro"%>
<%@page import="revisaodm2021n.controles.ControleLivro"%>

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
<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Emprestimo uEntrada = new Emprestimo(id);
    ControleEmprestimo controle = new ControleEmprestimo();
    Emprestimo emprestimo = controle.buscar(uEntrada);
%>


<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>Editar Emprestimo</title>
    <body>
        <div class="container"/>
        <h1>ALTERAR</h1>
        <form name="validaAlteraEmprestimo" action="validaAlteraEmprestimo.jsp" method="post">
            ID -> <%=emprestimo.getId()%> <br>
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
                DATA DE EMPRESTIMO <input type="text" name="DATAEMPRESTIMO" value="<%=emprestimo.getDataEmprestimo()%>" style="width: 300px"> <br>          

            <input type="hidden" name="ID" value="<%=emprestimo.getId()%>"> <br>
            <input type="submit" name="ALTERAR" value="ALTERAR"> <br>
        </form>
    </div>
</body>
</html>