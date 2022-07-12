<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Nouvelle vente</title>
    <link rel="stylesheet" href="styleNouvelleVente.css">
</head>
<body>

<main>
    <div class="column">
        <h1>Nouvelle Vente</h1>
        <form action="EnchereServlet" method="post">
            <div class="row">
                <div class="column1">
                    <label for="saisieArticle"> Article : </label>
                    <label for="descriptionSaisie">Description : </label>
                    <label for="categorieChoisie"> Catégorie : </label>
                    <label for="imageArticle">Photo de l'article : </label>
                    <label for="prixSaisie">Mise à prix : </label>
                    <label for="debutEnchereSaisie">Début de l'enchère : </label>
                    <label for="finEnchereSaisie">Fin de l'enchère : </label>
                </div>
                <div class="column1">
                    <input type="text" name="saisieArticle" id="saisieArticle" required>
                    <input type="text" name="descriptionSaisie" id="descriptionSaisie" required>
                    <select name="categorieChoisie" id="categorieChoisie" required>
                        <option disabled>Choisissez une catégorie</option>
                        <option value="1">Informatique</option>
                        <option value="2">Ameublement</option>
                        <option value="3">Vêtement</option>
                        <option value="4">Sport&Loisirs</option>
                    </select>
                    <input type="file" name="imageArticle" id="imageArticle">
                    <input type="number" name="prixSaisie" id="prixSaisie" required>
                    <input type="date" name="debutEnchereSaisie" id="debutEnchereSaisie" required>
                    <input type="date" name="finEnchereSaisie" id="finEnchereSaisie" required>
                </div>
            </div>

            <fieldset>
                <Legend>Retrait</Legend>
                <div class="row">
                    <div class="column">
                        <label for="rueRetrait" class="retrait">Rue : </label>
                        <label for="cPRetrait" class="retrait">Code Postal : </label>
                        <label for="villeRetrait" class="retrait">Ville : </label>
                    </div>
                    <div class="column">

                        <input type="text" name="rueRetrait" id="rueRetrait" value="${utilisateur.rue}" required>
                        <input type="text" name="cPRetrait" id="cPRetrait" value="${utilisateur.codePostal}" required>
                        <input type="text" name="villeRetrait" id="villeRetrait" value="${utilisateur.ville}" required>
                    </div>
                </div>
            </fieldset>

            <input class="inputCreer" type="submit" value="Enregistrer">
            <input class="inputCreer" type="reset" value="Reset formulaire">
        </form>
        <form action="AccueilConnectedServlet" method="get">
            <input class="inputCreer" type="submit" name="retourAccueil" value="Retour">
        </form>
    </div>


</main>
</body>
</html>