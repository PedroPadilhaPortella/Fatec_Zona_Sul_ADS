<%@page import="revisaodm2021n.controles.ControleEmprestimo"%>
<%@page import="revisaodm2021n.dados.Emprestimo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    request.setCharacterEncoding("UTF-8"); 
    int id = Integer.parseInt(request.getParameter("ID"));
    String cliente_id = request.getParameter("IDCLIENTE");    
    String livro_id = (request.getParameter("IDLIVRO"));    
    String dataemprestimo = request.getParameter("DATAEMPRESTIMO");
    
    Emprestimo entrada = new Emprestimo(id, cliente_id, livro_id, dataemprestimo);
    ControleEmprestimo controle = new ControleEmprestimo();
    Emprestimo emprestimo = controle.alterar(entrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>ALTERAÇÃO CONCLUIDA</h1>
        ID = <%=emprestimo.getId()%> <br>
        ID DO CLIENTE = <%=emprestimo.getIdCliente()%> <br>        
        ID DO LIVRO = <%=emprestimo.getIdLivro()%> <br>  
        DATA DE EMPRESTIMO = <%=emprestimo.getDataEmprestimo()%>
    </div>
    </body>
</html>
