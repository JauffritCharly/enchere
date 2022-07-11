package fr.afpa.enchere.servlet;

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

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
