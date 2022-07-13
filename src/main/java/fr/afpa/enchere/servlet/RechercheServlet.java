package fr.afpa.enchere.servlet;

import fr.afpa.enchere.bo.ArticleVendu;
import fr.afpa.enchere.dal.MethodSQL;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/RechercheServlet")
public class RechercheServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MethodSQL methodSQl = new MethodSQL();
        String recherche = request.getParameter("rechercheArticle");
        int noCategorie = Integer.parseInt(request.getParameter("categorie"));
        ArrayList<ArticleVendu> affichageArticlePageAcceuil = methodSQl.RechercheAcceuilConnecte(recherche, noCategorie);
        System.out.println(affichageArticlePageAcceuil);
        request.setAttribute("affichageArticle", affichageArticlePageAcceuil);

        System.out.println(recherche);
        System.out.println(noCategorie);

        if (recherche.isEmpty() && noCategorie == 0) {
            MethodSQL methodSQL = new MethodSQL();

            ArrayList<ArticleVendu> affichageArticles = methodSQL.affichageArticlePageConnecte();
            request.setAttribute("affichageArticle", affichageArticles);

            request.getRequestDispatcher("WEB-INF/accueilConnected.jsp").forward(request, response);
        }

        request.getRequestDispatcher("WEB-INF/accueilConnected.jsp").forward(request, response);
    }
}
