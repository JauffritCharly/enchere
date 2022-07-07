package fr.afpa.enchere.dal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Categorie {
    private int idCategorie;
    private String libelle;
}
