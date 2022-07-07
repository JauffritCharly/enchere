package fr.afpa.enchere.dal;

import fr.afpa.enchere.bo.ArticleVendu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLRuddy {
    // ----------------------A MODIFIER LE SELECT ALL AVEC UN WHERE --------------------------------------
    public List<ArticleVendu> selectAllArticleVendu() {
        //Cette methode sert à afficher toutes les enchères dans la BDD
        List<ArticleVendu> listeArticles = new ArrayList<>();
        try (Connection connection = ConnectionProvider.getConnection()) {
            PreparedStatement pstmt = connection.prepareStatement("SELECT no_encheres, no_utilisateur, no_article, date_enchere, montant_enchere FROM encheres");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                listeArticles.add(new ArticleVendu(rs.getInt("noArticle"), rs.getString("nomArticle"),rs.getString("description"),rs.getDate("dateDebutEncheres"),rs.getDate("dateFinEncheres"),rs.getInt("prixInitial"),rs.getInt("prixVente")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listeArticles;
    }
}
