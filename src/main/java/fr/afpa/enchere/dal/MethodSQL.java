package fr.afpa.enchere.dal;

import fr.afpa.enchere.bo.Utilisateur;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MethodSQL {

    public void insertNouvelleConnection(String pseudo, String nom, String prenom, String email, String telephone, String rue, String codePostal, String ville, String motDePasse) {
        //Cette methode sert a inserer un utilisateur dans la BDD
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO utilisateurs(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe) value(?,?,?,?,?,?,?,?,?);");
            pstmt.setString(1, pseudo);
            pstmt.setString(2, nom);
            pstmt.setString(3, prenom);
            pstmt.setString(4, email);
            pstmt.setString(5, telephone);
            pstmt.setString(6, rue);
            pstmt.setString(7, codePostal);
            pstmt.setString(8, ville);
            pstmt.setString(9, motDePasse);
            pstmt.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Utilisateur selectPseudo(String pseudo) {
        Utilisateur utilisateur = null;
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement pstmt1 = connection.prepareStatement("SELECT no_utilisateur,pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,credit FROM utilisateurs WHERE pseudo = ?");
            pstmt1.setString(1, pseudo);
            ResultSet rs = pstmt1.executeQuery();

            while (rs.next()) {
                int idUtilisateur = rs.getInt("no_utilisateur");
                String pseudoUtilisateur = rs.getString("pseudo");
                String nomUtilisateur = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String email = rs.getString("email");
                String telephone = rs.getString("telephone");
                String rue = rs.getString("rue");
                String codePostal = rs.getString("code_postal");
                String ville = rs.getString("ville");
                String motDePasse = rs.getString("mot_de_passe");
                int credit = rs.getInt("credit");

                utilisateur = new Utilisateur(idUtilisateur, pseudoUtilisateur, nomUtilisateur, prenom, email, telephone, rue, codePostal, ville, motDePasse, credit);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return utilisateur;
    }

    public boolean connexion(String pseudo, String motDePasse) {
        int idUtilisateur = 0;
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("Select no_utilisateur from utilisateurs where pseudo = ? and mot_de_passe = ?;");
            pstmt.setString(1, pseudo);
            pstmt.setString(2, motDePasse);
            ResultSet rs = pstmt.executeQuery();
            System.out.println(pstmt);
            while (rs.next()) {

                idUtilisateur = rs.getInt("no_utilisateur");

            }
            System.out.println(idUtilisateur);

            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idUtilisateur != 0;

    }
}