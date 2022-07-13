package fr.afpa.enchere.servlet;

import fr.afpa.enchere.bo.ArticleVendu;
import fr.afpa.enchere.bo.Utilisateur;
import fr.afpa.enchere.dal.MethodSQL;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "RetourServlet", value = "/RetourServlet")
public class RetourServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MethodSQL methodSQL = new MethodSQL();

        ArrayList<ArticleVendu> affichageArticles = methodSQL.affichageArticlePageConnecte();
        request.setAttribute("affichageArticle", affichageArticles);

        request.getRequestDispatcher("WEB-INF/accueilConnected.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
