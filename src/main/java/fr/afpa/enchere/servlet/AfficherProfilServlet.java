package fr.afpa.enchere.servlet;

import fr.afpa.enchere.bo.ArticleVendu;
import fr.afpa.enchere.bo.Utilisateur;
import fr.afpa.enchere.dal.MethodSQL;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "AfficherProfilServlet", value = "/AfficherProfilServlet")
public class AfficherProfilServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MethodSQL methodSQL = new MethodSQL();
        Utilisateur utilisateur = methodSQL.affichageUnProfil(request.getParameter("pseudo"));
        System.out.println(utilisateur);
        request.setAttribute("utilisateur", utilisateur);

        request.getRequestDispatcher("WEB-INF/profilUtilisateur.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
