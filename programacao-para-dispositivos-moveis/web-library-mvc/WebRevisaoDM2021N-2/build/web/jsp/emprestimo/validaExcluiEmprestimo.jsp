<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Emprestimo"%>
<%@page import="revisaodm2021n.controles.ControleEmprestimo"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Emprestimo entrada = new Emprestimo(id);
    ControleEmprestimo controle = new ControleEmprestimo();
    Emprestimo emprestimo = controle.excluir(entrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>VALIDA EXCLUSÃO</h1>
        ID = <%=emprestimo.getId()%> <br>
        ID DO CLIENTE = <%=emprestimo.getIdCliente()%> <br>
        ID DO LIVRO = <%=emprestimo.getIdLivro()%> <br>
        DATA DE EMPRESTIMO = <%=emprestimo.getDataEmprestimo()%> <br>
    </div>
    </body>
</html>
