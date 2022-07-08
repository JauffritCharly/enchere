package fr.afpa.enchere.servlet;

import fr.afpa.enchere.bo.Utilisateur;
import fr.afpa.enchere.dal.MethodSQL;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "MonProfilServlet", value = "/MonProfilServlet")
public class MonProfilServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        MethodSQL methodSQL = new MethodSQL();
        Utilisateur utilisateur = methodSQL.affichageMonProfil((Integer) session.getAttribute("id"));
        System.out.println(utilisateur);
        request.setAttribute("utilisateur", utilisateur);

        request.getRequestDispatcher("WEB-INF/monProfil.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/modifierMonProfil.jsp").forward(request, response);
    }
}
