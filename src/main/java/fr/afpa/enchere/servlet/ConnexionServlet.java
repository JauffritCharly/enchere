package fr.afpa.enchere.servlet;

import fr.afpa.enchere.dal.MethodSQL;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/ConnexionServlet")
public class ConnexionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("login")) {
                System.out.println(cookie.getValue());
                request.setAttribute("login", cookie.getValue());
            }
        }
        request.getRequestDispatcher("WEB-INF/connexion.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String saisieIdentifiant = request.getParameter("saisieIdentifiant");
        String password = request.getParameter("saisiePassword");
        MethodSQL methodSQL = new MethodSQL();
        boolean connexion = methodSQL.connexion(saisieIdentifiant, password);
        String check = request.getParameter("rememberMe");

        if (check != null) {
            Cookie connexionCookie = new Cookie("login", saisieIdentifiant);
            response.addCookie(connexionCookie);
        }

        if (connexion) {
            request.getRequestDispatcher("WEB-INF/accueilConnected.jsp").forward(request, response);
            
        } else {
            request.getRequestDispatcher("WEB-INF/pasbon.jsp").forward(request, response);
        }

    }
}
