package fr.afpa.enchere.servlet;

import fr.afpa.enchere.bo.ArticleVendu;
import fr.afpa.enchere.bo.Utilisateur;
import fr.afpa.enchere.dal.MethodSQL;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/MiseAJourProfilServlet")
public class MiseAJourProfilServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println(session);
        MethodSQL methodSQL = new MethodSQL();
        Utilisateur utilisateur = methodSQL.affichageMonProfil((Integer) session.getAttribute("id"));

        int id = (int) session.getAttribute("id");
        int no_utilisateur = id;
        String pseudo = request.getParameter("pseudo");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");
        String rue = request.getParameter("rue");
        String code_postal = request.getParameter("code_postal");
        String ville = request.getParameter("ville");
        String mot_de_passe = request.getParameter("mot_de_passe");
        methodSQL.miseAJourProfil(no_utilisateur, pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe);

        ArrayList<ArticleVendu> affichageArticles = methodSQL.affichageArticlePageAcceuil();
        request.setAttribute("affichageArticle", affichageArticles);

        request.setAttribute("utilisateur", utilisateur);
        request.getRequestDispatcher("AccueilConnectedServlet").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        MethodSQL methodSQL = new MethodSQL();

        int id = (int) session.getAttribute("id");
        int no_utilisateur = id;
        methodSQL.supprimerCompte((no_utilisateur));


        ArrayList<ArticleVendu> affichageArticles = methodSQL.affichageArticlePageAcceuil();
        request.setAttribute("affichageArticle", affichageArticles);

        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }
}
