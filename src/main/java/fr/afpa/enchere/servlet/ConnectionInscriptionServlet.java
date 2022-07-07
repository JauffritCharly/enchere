package fr.afpa.enchere.servlet;

import fr.afpa.enchere.dal.MethodSQL;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/ConnectionInscriptionServlet")
public class ConnectionInscriptionServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("login")) {
                System.out.println(cookie.getValue());
                request.setAttribute("login", cookie.getValue());
            }
        }

        String saisieIdentifiant = request.getParameter("saisieIdentifiant");
        String password = request.getParameter("saisiePassword");
        System.out.println(password);
        MethodSQL methodSQL = new MethodSQL();
        boolean connexion = methodSQL.connexion(saisieIdentifiant, password);
        System.out.println(connexion);

        if (connexion) {
            Cookie connexionCookie = new Cookie("login", saisieIdentifiant);
            response.addCookie(connexionCookie);
            request.getRequestDispatcher("WEB-INF/accueilConnected.jsp").forward(request, response);

        } else {
            request.getRequestDispatcher("WEB-INF/pasbon.jsp").forward(request, response);
        }
        Cookie connexionCookie = new Cookie("login", saisieIdentifiant);
        response.addCookie(connexionCookie);

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
        System.out.println(mot_de_passe);
        System.out.println(confirmationmdp);

        if (mot_de_passe.equals(confirmationmdp)) {
            request.getRequestDispatcher("WEB-INF/accueilConnected.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("WEB-INF/pasbon.jsp").forward(request, response);
        }

    }
}
