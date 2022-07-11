package fr.afpa.enchere.servlet;

import fr.afpa.enchere.bo.Utilisateur;
import fr.afpa.enchere.dal.MethodSQL;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "EnchereServlet", value = "/EnchereServlet")
public class EnchereServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MethodSQL methodSQL = new MethodSQL();
        HttpSession session = request.getSession();
        Utilisateur utilisateur = methodSQL.affichageMonProfil((Integer) session.getAttribute("id"));
        request.setAttribute("utilisateur", utilisateur);

        request.getRequestDispatcher("WEB-INF/nouvelleVente.jsp").forward(request, response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MethodSQL methodSQL = new MethodSQL();
        HttpSession session = request.getSession();
        Utilisateur utilisateur = methodSQL.affichageMonProfil((Integer) session.getAttribute("id"));
        request.setAttribute("utilisateur", utilisateur);

        String nomArticle = request.getParameter("saisieArticle");
        String description = request.getParameter("descriptionSaisie");
        int prix = Integer.parseInt(request.getParameter("prixSaisie"));
        LocalDate dateDebut = LocalDate.parse(request.getParameter("debutEnchereSaisie"));
        LocalDate dateFin = LocalDate.parse(request.getParameter("finEnchereSaisie"));

        int categorieChoisie = Integer.parseInt(request.getParameter("categorieChoisie"));
        methodSQL.insertNouvelleVente(nomArticle, description, prix, dateDebut, dateFin, (Integer) session.getAttribute("id"), categorieChoisie);


        request.getRequestDispatcher("WEB-INF/accueilConnected.jsp").forward(request, response);


    }
}
