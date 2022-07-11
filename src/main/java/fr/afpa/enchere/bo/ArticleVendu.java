package fr.afpa.enchere.bo;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

@Data
@AllArgsConstructor
public class ArticleVendu {
    private int noArticle;
    private String nomArticle;
    private String description;
    private LocalDate dateDebutEncheres;
    private LocalDate dateFinEncheres;
    private int prixInitial;
    private int prixVente;

    private String pseudo;
    private ArrayList<ArticleVendu> articleVendu;


    public ArticleVendu(int noArticle, String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres, int prixInitial, int prixVente) {
        this.noArticle = noArticle;
        this.nomArticle = nomArticle;
        this.description = description;
        this.dateDebutEncheres = dateDebutEncheres;
        this.dateFinEncheres = dateFinEncheres;
        this.prixInitial = prixInitial;
        this.prixVente = prixVente;
    }

    public ArticleVendu(int noArticle, String nomArticle, String description, Date dateDebutEncheres, Date dateFinEncheres, int prixInitial, int prixVente) {
    }

    private Date dateDebutEncheres1;
    private Date dateFinEncheres1;

    public ArticleVendu(String nomArticle, String description, Date dateDebutEncheres1, Date dateFinEncheres1, int prixInitial, int prixVente, String pseudo) {
        this.nomArticle = nomArticle;
        this.description = description;
        this.dateDebutEncheres1 = dateDebutEncheres1;
        this.dateFinEncheres1 = dateFinEncheres1;
        this.prixInitial = prixInitial;
        this.prixVente = prixVente;
        this.pseudo = pseudo;
    }


}
