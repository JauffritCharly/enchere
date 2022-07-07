package fr.afpa.enchere.bo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Retrait {
    private String rue;
    private String codePostal;
    private String ville;
}
