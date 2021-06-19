<%-- 
    Document   : inseriUsuario
    Created on : 08/04/2021, 20:37:49
    Author     : User
--%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>INSERI</h1>
        <form name="validaInseriLivro" action="validaInseriLivro.jsp" method="post">
            TITULO <input type="text" name="TITULO" value=""> <br>
            AUTOR <input type="text" name="AUTOR" value=""> <br>
            EDITORA <input type="text" name="EDITORA" value=""> <br>
            GENERO <input type="text" name="GENERO" value=""> <br>
            <input type="submit" name="INSERIR" value="INSERIR"> <br>
        </form>
    </div>
   </body>
</html>