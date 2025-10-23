package net.ausiasmarch.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// le hemos quitado la anotacion @WebServlet("/aleatorio") como ejemplo de servlet con mapeo en web.xml
public class Aleatorio extends HttpServlet {
    
    private String iterarRafa(int veces) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            resultado.append("<p>Hecho por Rafa</p>");
        }
        return resultado.toString();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        int superior = request.getParameter("superior") != null ? Integer.parseInt(request.getParameter("superior")) : 100;
        int inferior = request.getParameter("inferior") != null ? Integer.parseInt(request.getParameter("inferior")) : 0;


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hola Mundo de rafa</title>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css' rel='stylesheet' crossorigin='anonymous'>");
        out.println("</head>");
        out.println("<body class='bg-light d-flex flex-column min-vh-100'>");
        out.println("<main class='container py-5'>");
        out.println("<div class='row justify-content-center'>");
        out.println("<div class='col-md-8 col-lg-6'>");
        out.println("<div class='card shadow'>");
        out.println("<div class='card-body text-center'>");
        out.println("<a href='index.jsp' class='btn btn-link mb-3'>&larr; Volver al menú principal</a>");
        out.println("<h1 class='mb-4'>¡Hola Mundo desde un Servlet de rafa!</h1>");
        int alea = (int) Math.floor(Math.random() * (superior - inferior + 1) + inferior);
        out.println("<p class='mb-4'>Número aleatorio entre " + inferior + " y " + superior + ": <strong>" + alea + "</strong></p>");
        // muestra en la página alea veces el texto "Hecho por Rafa"


        out.println(this.iterarRafa(alea));

        /*
        for (int i = 0; i < alea; i++) {
            out.println("<p>Hecho por Rafa</p>");
        }
        */
        
        out.println("</div></div></div></div></main>");
        out.println("</body>");
        out.println("</html>");
      



    }
}
