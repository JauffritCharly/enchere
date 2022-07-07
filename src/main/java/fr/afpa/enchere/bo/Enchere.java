package fr.afpa.enchere.bo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Enchere {
    private LocalDate dateEnchere;
    private float montant_enchere;
    private ArrayList<Enchere> enchere;

}
