<%@page import="revisaodm2021n.controles.ControleEmprestimo"%>
<%@page import="revisaodm2021n.dados.Emprestimo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    request.setCharacterEncoding("UTF-8"); 
    String cliente_id = request.getParameter("IDCLIENTE");    
    String livro_id = (request.getParameter("IDLIVRO"));    
    String dataemprestimo = request.getParameter("DATAEMPRESTIMO");
    
    Emprestimo entrada = new Emprestimo(livro_id, cliente_id, dataemprestimo);
    ControleEmprestimo controle = new ControleEmprestimo();
    Emprestimo emprestimo = controle.inserir(entrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>CRUD Bittencourt - Inserir Alocação</title>
    <body>
    <div class="container"/>
        <h1>INCLUSÃO CONCLUIDA</h1>
        ID = <%=emprestimo.getId()%> <br>
        ID DO CLIENTE = <%=emprestimo.getIdCliente()%> <br>        
        ID DO LIVRO = <%=emprestimo.getIdLivro()%> <br>
    </div>
    </body>
</html>
