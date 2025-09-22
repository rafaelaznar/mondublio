package net.ausiasmarch.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String passwordRepeat = request.getParameter("passwordRepeat");

        // Obtener el "mapa de usuarios" global
        HashMap<String, String> users = (HashMap<String, String>) getServletContext().getAttribute("users");
        if(users == null) {
            users = new HashMap<>();
        }

        //confirmar que el usuario no existe y es nuevo
        if(!users.containsKey(username)) {
            //confirmar contraseña
            if (password.equals(passwordRepeat)) {
                // Guardar el usuario
                users.put(username, password);
                getServletContext().setAttribute("users", users);

                response.sendRedirect("login.jsp?registrado=1");
            }else{
                response.sendRedirect("register.jsp?error=2");
            }
        } else{
            response.sendRedirect("register.jsp?error=1");
        }
    }
}
