package fr.afpa.enchere.servlet;

import fr.afpa.enchere.bo.ArticleVendu;
import fr.afpa.enchere.dal.MethodSQL;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "AccueilConnectedServlet", value = "/AccueilConnectedServlet")
public class AccueilConnectedServlet extends HttpServlet {
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
