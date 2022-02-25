<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Generación de números aleatorios</title>
    </head>
    <body>
        <div class="d-flex flex-column justify-content-start align-items-start m-5">
            <h1>Generación de números aleatorios</h1>
            <%
                try {
                    int max = Integer.parseInt(request.getParameter("sup"));
                    int min = Integer.parseInt(request.getParameter("inf"));
                    if (min < max) {
                        Random rand = new Random();
                        int randomNum = rand.nextInt((max - min) + 1) + min;
                        out.print("<h2>El número generado es el... " + randomNum + "</h2>");
                    } else {
                        out.print("<h2>Error: el límite superior debe ser un número mayor que el límite inferior</h2>");
                    }
                } catch (NumberFormatException e) {
                    out.print("<h2>Error:Error en los parámetros enviados</h2>");
                } catch (Exception e) {
                    out.print("<h2>Error:</h2>" + e);
                }
            %>
            <a href="formulario.html">Volver al formulario</a>
        </div>
    </body>
</html>
