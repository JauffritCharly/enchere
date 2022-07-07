package fr.afpa.enchere.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/ConnectionInscriptionServlet")
public class ConnectionInscriptionServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.getRequestDispatcher("WEB-INF/accueilConnected.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/accueilConnected.jsp").forward(request, response);
    }
}
