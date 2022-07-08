package fr.afpa.enchere.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AccueilConnectedServlet", value = "/AccueilConnectedServlet")
public class AccueilConnectedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //SQLRuddy allArticles = new SQLRuddy();
        //request.setAttribute("allArticles", allArticles.selectAllArticleVendu());
        request.getRequestDispatcher("WEB-INF/accueilConnected.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
