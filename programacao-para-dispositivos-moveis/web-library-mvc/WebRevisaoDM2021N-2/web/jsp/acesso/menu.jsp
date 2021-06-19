<%-- 
    Document   : menu
    Created on : 09/04/2021, 20:09:32
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Usuario"%>
<%@page import="revisaodm2021n.controles.ControleUsuario"%>

<%
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");
    Usuario uEntrada = new Usuario(login,senha);
    ControleUsuario contUsu = new ControleUsuario();
    Usuario uSaida = contUsu.validar(uEntrada);
%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>MENU</h1>
        <% if(uSaida != null) { %>
            <!-- Usuario = <%=uSaida.getId()%> | <%=uSaida.getLogin()%> | <%=uSaida.getSenha()%> | <%=uSaida.getStatus()%> | <%=uSaida.getTipo()%> <br>   
            Usuario = <a href="../usuario/buscaUsuario.jsp">Buscar</a> = <a href="../usuario/listaUsuario.jsp">Lista</a> = <a href="../usuario/inseriUsuario.jsp">Inserir</a> <br> -->
            Livro = <a href="../livro/buscaLivro.jsp">Buscar</a> = <a href="../livro/listaLivro.jsp">Lista</a> = <a href="../livro/inseriLivro.jsp">Inserir</a> <br/>
            Cliente = <a href="../cliente/buscaCliente.jsp">Buscar</a> = <a href="../cliente/listaCliente.jsp">Lista</a> = <a href="../cliente/inseriCliente.jsp">Inserir</a> <br/>
            Empréstimo = <a href="../emprestimo/buscaEmprestimo.jsp">Buscar</a> = <a href="../emprestimo/listaEmprestimo.jsp">Lista</a> = <a href="../emprestimo/inseriEmprestimo.jsp">Inserir</a> <br/>
            <!-- Notebook = <a href="../notebook/buscaNotebook.jsp">Buscar</a> = <a href="../notebook/listaNotebook.jsp">Lista</a> = <a href="../notebook/inseriNotebook.jsp">Inserir</a> <br/>
            Tenis = <a href="../tenis/buscaTenis.jsp">Buscar</a> = <a href="../tenis/listaTenis.jsp">Lista</a> = <a href="../tenis/inseriTenis.jsp">Inserir</a> <br/> -->
        <% } else { %>
            Usuário Inválido
        <% } %>
    </div>
    </body>
</html>
