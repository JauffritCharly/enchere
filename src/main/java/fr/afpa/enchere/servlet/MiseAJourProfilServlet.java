package fr.afpa.enchere.servlet;

import fr.afpa.enchere.bo.Utilisateur;
import fr.afpa.enchere.dal.MethodSQL;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/MiseAJourProfilServlet")
public class MiseAJourProfilServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int id = (int) session.getAttribute("id");
        int no_utilisateur = id;
        MethodSQL methodSQL = new MethodSQL();
        String pseudo = request.getParameter("pseudo");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");
        String rue = request.getParameter("rue");
        String codePostale = request.getParameter("codePostale");
        String ville = request.getParameter("ville");
        String mot_de_passe = request.getParameter("mot_de_passe");
        methodSQL.miseAJourProfil(no_utilisateur,pseudo, nom, prenom, email, telephone, rue, codePostale, ville, mot_de_passe);

        request.getRequestDispatcher("WEB-INF/monProfil.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
