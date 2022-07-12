package fr.afpa.enchere.dal;

import fr.afpa.enchere.bo.ArticleVendu;
import fr.afpa.enchere.bo.Utilisateur;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
            System.out.println(pstmt1);
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

    public Utilisateur affichageMonProfil(int id) {
        int no_utilisateur = 0;
        Utilisateur utilisateur = null;
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement pstmt1 = connection.prepareStatement("SELECT pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,credit FROM utilisateurs WHERE no_utilisateur = ?");
            pstmt1.setInt(1, id);
            ResultSet rs = pstmt1.executeQuery();
            while (rs.next()) {
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

                utilisateur = new Utilisateur(pseudoUtilisateur, nomUtilisateur, prenom, email, telephone, rue, codePostal, ville, motDePasse, credit);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return utilisateur;
    }

    public ArrayList<ArticleVendu> affichageArticlePageAcceuil() {
        ArrayList<ArticleVendu> affichageArticles = new ArrayList<>();

        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement pstmt1 = connection.prepareStatement("SELECT nom_article,description,date_debut_encheres,date_fin_encheres, prix_initial,prix_vente, pseudo FROM articles_vendus inner join utilisateurs  on articles_vendus.no_utilisateur = utilisateurs.no_utilisateur order by no_article desc limit 2");
            ResultSet rs = pstmt1.executeQuery();

            while (rs.next()) {
                ArticleVendu articleVendu = new ArticleVendu(
                        rs.getString("nom_article"),
                        rs.getString("description"),
                        rs.getDate("date_debut_encheres"),
                        rs.getDate("date_fin_encheres"),
                        rs.getInt("prix_initial"),
                        rs.getInt("prix_vente"),
                        rs.getString("pseudo")
                );
                affichageArticles.add(articleVendu);
            }
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return affichageArticles;
    }

    public void miseAJourProfil(int no_utilisateur, String pseudo, String nom, String prenom, String email, String telephone, String rue, String codePostal, String ville, String motDePasse) {
        //Cette methode sert à modifier le profil
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("UPDATE utilisateurs set pseudo = ?, nom = ?, prenom = ?, email = ?, telephone = ?, rue = ?, code_postal = ?, ville = ? where no_utilisateur = ?");
            pstmt.setString(1, pseudo);
            pstmt.setString(2, nom);
            pstmt.setString(3, prenom);
            pstmt.setString(4, email);
            pstmt.setString(5, telephone);
            pstmt.setString(6, rue);
            pstmt.setString(7, codePostal);
            pstmt.setString(8, ville);
            pstmt.setInt(9, no_utilisateur);
            pstmt.executeUpdate();
            System.out.println(pstmt);
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void supprimerCompte(int no_utilisateur) {
        //Cette methode sert à supprimer un compte
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("DELETE FROM utilisateurs where no_utilisateur = ?");
            pstmt.setInt(1, no_utilisateur);
            pstmt.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertNouvelleVente(String nom_article, String description, int prix_initial, LocalDate date_debut_encheres, LocalDate date_fin_encheres, int no_utilisateur, int no_categorie) {
        //Cette methode sert a inserer un utilisateur dans la BDD
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO articles_vendus (nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, no_utilisateur, no_categorie)" + " values(?,?,?,?,?,?,?);");
            pstmt.setString(1, nom_article);
            pstmt.setString(2, description);
            pstmt.setDate(3, Date.valueOf(date_debut_encheres));
            pstmt.setDate(4, Date.valueOf(date_fin_encheres));
            pstmt.setInt(5, prix_initial);
            pstmt.setInt(6, no_utilisateur);
            pstmt.setInt(7, no_categorie);
            pstmt.executeUpdate();

            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Utilisateur affichageUnProfil(String pseudo) {
        Utilisateur utilisateur = null;
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement pstmt1 = connection.prepareStatement("SELECT nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe FROM utilisateurs WHERE pseudo = ?");
            pstmt1.setString(1, pseudo);
            ResultSet rs = pstmt1.executeQuery();
            while (rs.next()) {
                String nomUtilisateur = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String email = rs.getString("email");
                String telephone = rs.getString("telephone");
                String rue = rs.getString("rue");
                String codePostal = rs.getString("code_postal");
                String ville = rs.getString("ville");

                utilisateur = new Utilisateur(nomUtilisateur, prenom, email, telephone, rue, codePostal, ville);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return utilisateur;


/*
    // ----------------------A MODIFIER LE SELECT ALL AVEC UN WHERE --------------------------------------
    public List<ArticleVendu> selectAllArticleVendu() {
        //Cette methode sert à afficher toutes les enchères dans la BDD
        List<ArticleVendu> listeArticles = new ArrayList<>();
        try (Connection connection = ConnectionProvider.getConnection()) {
            PreparedStatement pstmt = connection.prepareStatement("SELECT no_encheres, no_utilisateur, no_article, date_enchere, montant_enchere FROM encheres");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                listeArticles.add(new ArticleVendu(rs.getInt("noArticle"), rs.getString("nomArticle"), rs.getString("description"), rs.getDate("dateDebutEncheres"), rs.getDate("dateFinEncheres"), rs.getInt("prixInitial"), rs.getInt("prixVente")));
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listeArticles;
    }
*/

}

}


