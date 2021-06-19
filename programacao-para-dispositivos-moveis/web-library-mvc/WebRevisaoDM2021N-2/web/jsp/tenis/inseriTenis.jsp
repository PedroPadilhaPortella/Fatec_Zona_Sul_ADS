<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>INSERI</h1>
        <form name="validaInseriTenis" action="validaInseriTenis.jsp" method="post">
            MARCA <input type="text" name="MARCA" value=""> <br>
            TAMANHO <input type="text" name="TAMANHO" value=""> <br>
            COR <input type="text" name="COR" value=""> <br>
            ORIGEM <input type="text" name="ORIGEM" value=""> <br>
            PRECO <input type="text" name="PRECO" value=""> <br>
            <input type="submit" name="INSERIR" value="INSERIR"> <br>
        </form>
    </div>
   </body>
</html>