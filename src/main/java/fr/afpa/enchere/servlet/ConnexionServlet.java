package fr.afpa.enchere.servlet;

import fr.afpa.enchere.bo.ArticleVendu;
import fr.afpa.enchere.bo.Utilisateur;
import fr.afpa.enchere.dal.MethodSQL;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;

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

            ArrayList<ArticleVendu> affichageArticles = methodSQL.affichageArticlePageAcceuil();
            request.setAttribute("affichageArticle", affichageArticles);

            request.getRequestDispatcher("WEB-INF/accueilConnected.jsp").forward(request, response);

        } else {
            request.getRequestDispatcher("connexion.jsp").forward(request, response);
        }

    }
}
