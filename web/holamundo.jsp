<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! String valor = "Mundo";%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <div class="d-flex flex-column justify-content-center align-items-center m-5">
            <!-- comentario en HTML -->
            <%
                String nombre = "Repeticiones";
                // comentario en Java
                for (int i = 1; i <= 3; i++) {
                    /* comentario en java
                    multiline
                     */
            %>                            
            <h3>3 Repeticiones</h3>
            <% } %>    
            <hr>
            <!-- ejercicio -->
            <%
                for (int i = 1; i <= 4; i++) {
                    out.print("<h3>4 Repeticiones</h3>");
                }
            %>
            <hr>                      
            <!-- ejercicio variables -->
            <%
                for (int i = 1; i <= 10; i++) {
                    out.println("<h6>EL valor de i es: " + i + "</h6>");
                }
            %>
            <hr>               
            <!-- ejercicio variables -->
            <%
                // comentario en Java
                for (int i = 1; i <= 10; i++) {
                    /* comentario en java
                    multiline
                     */
            %>                            
            <h6>El valor de i es ... <%=i%></h6>
            <% }%>  
            <hr>         
            <!-- ejercicio variables e if -->
            <%
                // comentario en Java
                for (int i = 1; i <= 10; i++) {
                    /* comentario en java
                    multiline
                     */
                    if (i < 5) {
            %>                            
            <h2>El valor de i es ... <%=i%></h2>
            <% } else {%>  
            <h2>******** El valor de i es ... <%=i%></h2>
            <% }
                }%>

            <hr>         
            <h1>Hola <%=valor%></h1>

        </div>
        <div class="d-flex flex-column justify-content-left m-5">
            <%@include file="incluir_estatica.jsp" %>  <!-- estática: en tiempo de compilacion -->
            <hr>
            <% String command = "hola";%>
            <!-- dinámica: en tiempo de ejecución -->   
            <jsp:include page="incluir_dinamica.jsp" flush="true">                      
                <jsp:param name="p1" value="<%=command%>" />                
                <jsp:param name="p2" value="Rafa" /> 
            </jsp:include>
            <a href="index.html">Volver al inicio</a>
        </div>
    </body>
</html>
