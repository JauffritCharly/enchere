package fr.afpa.enchere.bo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Categorie {
    private int idCategorie;
    private String libelle;
}
