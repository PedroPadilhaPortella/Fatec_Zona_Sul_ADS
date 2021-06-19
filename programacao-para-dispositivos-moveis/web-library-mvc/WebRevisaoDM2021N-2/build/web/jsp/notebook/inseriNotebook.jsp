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
        <form name="validaInseriNotebook" action="validaInseriNotebook.jsp" method="post">
            NOME <input type="text" name="NOME" value=""> <br>
            MARCA <input type="text" name="MARCA" value=""> <br>
            PROCESSADOR <input type="text" name="PROCESSADOR" value=""> <br>
            RAM <input type="text" name="RAM" value=""> <br>
            PRECO <input type="text" name="PRECO" value=""> <br>
            <input type="submit" name="INSERIR" value="INSERIR"> <br>
        </form>
    </div>
   </body>
</html>