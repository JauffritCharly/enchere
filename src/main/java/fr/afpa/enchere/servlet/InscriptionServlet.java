package fr.afpa.enchere.servlet;

import fr.afpa.enchere.dal.MethodSQL;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/InscriptionServlet")
public class InscriptionServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/inscription.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MethodSQL methodSQl = new MethodSQL();
        String pseudo = request.getParameter("pseudo");
        String nom = request.getParameter("name");
        String prenom = request.getParameter("firstName");
        String email = request.getParameter("email");
        String telephone = request.getParameter("phone");
        String rue = request.getParameter("rue");
        String codePostale = request.getParameter("postalCode");
        String ville = request.getParameter("city");
        String mot_de_passe = request.getParameter("password");
        String confirmationmdp = request.getParameter("confirmationmdp");
        methodSQl.insertNouvelleConnection(pseudo, nom, prenom, email, telephone, rue, codePostale, ville, mot_de_passe);


        if (mot_de_passe.equals(confirmationmdp)) {
            request.getRequestDispatcher("WEB-INF/accueilConnected.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("WEB-INF/pasbon.jsp").forward(request, response);
        }

    }
}
