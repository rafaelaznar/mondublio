package net.ausiasmarch.servlet;

import java.io.IOException;
import java.util.ArrayList; // import arraylist
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/conexion")
public class Conexion extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // crear un arraylist de strings
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.add("Elemento 4");
        lista.add("Elemento 5");
        //pasar como parametro a la jsp para que lo muestre
        request.setAttribute("listaDeElementos", lista);
        String nombre = "Rafa";
        request.setAttribute("nombre", nombre);
        //redirigir a la jsp
        request.getRequestDispatcher("conexion.jsp").forward(request, response);
        //response.sendRedirect("conexion.jsp");
    }
}
