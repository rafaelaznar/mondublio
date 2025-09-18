package net.ausiasmarch.servlet;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Obtener el "mapa de usuarios" global
        HashMap<String, String> users = (HashMap<String, String>) getServletContext().getAttribute("users");
        if(users == null) {
            users = new HashMap<>();
        }

        if(!users.containsKey(username)) {
            // Guardar el usuario
            users.put(username, password);
            getServletContext().setAttribute("users", users);

            response.sendRedirect("login.jsp?registrado=1");
        } else{
            response.sendRedirect("register.jsp?error=1");
        }
    }
}
