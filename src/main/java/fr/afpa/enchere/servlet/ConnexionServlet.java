package fr.afpa.enchere.servlet;

import fr.afpa.enchere.bo.Utilisateur;
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
                cookie.setMaxAge(5000);
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
        Utilisateur utilisateur = methodSQL.selectPseudo(saisieIdentifiant);
        boolean connexion = methodSQL.connexion(saisieIdentifiant, password);
        String check = request.getParameter("rememberMe");


        if (check != null) {
            Cookie connexionCookie = new Cookie("login", saisieIdentifiant);
            response.addCookie(connexionCookie);
        }

        if (connexion) {
            HttpSession session = request.getSession();
            session.setAttribute("verifconnexion", true);
            session.setAttribute("id", utilisateur.getIdUtilisateur());
            System.out.println(session.getAttribute("id"));
            request.getRequestDispatcher("WEB-INF/accueilConnected.jsp").forward(request, response);

        } else {
            request.getRequestDispatcher("WEB-INF/pasbon.jsp").forward(request, response);
        }

    }
}
