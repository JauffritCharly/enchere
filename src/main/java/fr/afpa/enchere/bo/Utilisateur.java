package fr.afpa.enchere.bo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Utilisateur {
    private int idUtilisateur;
    private String pseudo;
    private String nom;
    private String email;
    private String telephone;
    private String rue;
    private String codePostal;
    private String ville;
    private String motDePasse;
    private int credit;
    private boolean administrateur;
}
