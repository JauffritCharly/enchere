package fr.afpa.enchere.servlet;

import fr.afpa.enchere.bo.ArticleVendu;
import fr.afpa.enchere.dal.MethodSQL;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "index", value = "/index")
public class index extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MethodSQL methodSQl = new MethodSQL();
        HttpSession session = request.getSession();
        ArrayList<ArticleVendu> affichageArticles = methodSQl.affichageArticlePageAcceuil();
        request.setAttribute("affichageArticle", affichageArticles);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
