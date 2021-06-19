<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>INSERI</h1>
        <form name="validaInseriCliente" action="validaInseriCliente.jsp" method="post">
            NOME <input type="text" name="NOME" value=""> <br>
            CPF <input type="text" name="CPF" value=""> <br>
            EMAIL <input type="text" name="EMAIL" value=""> <br>
            <input type="submit" name="INSERIR" value="INSERIR"> <br>
        </form>
    </div>
   </body>
</html>