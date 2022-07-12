<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Modifier ma vente</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styleNouvelleVente.css">
</head>
<body>

<main>
    <h1>MODIFIER MON ARTICLE</h1>
    <form id="form1" action="ModifierMaVenteTestServlet" method="get">
        <label for="saisieArticle"> Article :</label>
        <input type="" name="saisieArticle" id="saisieArticle" required value="${article.nom}">
        <label for="descriptionSaisie">Description : </label>
        <textarea name="descriptionSaisie" id="descriptionSaisie" required cols="30" rows="10"
                  value="${article.description}"></textarea>
        <label for="categorieChoisie"> Catégorie :</label>
        <select name="categorieChoisie" id="categorieChoisie" required>
            <option value="0" selected disabled>Choisissez une catégorie</option>
            <option value="1">Informatique</option>
            <option value="2">Ameublement</option>
            <option value="3">Vêtement</option>
            <option value="4">Sport&Loisirs</option>
        </select>
        <label for="imageArticle">Photo de l'article : </label>
        <input type="file" name="imageArticle" id="imageArticle">
        <label for="prixSaisie">Mise à prix : </label>
        <input type="number" name="prixSaisie" id="prixSaisie" required value="${article.prixInitial}">
        <label for="debutEnchereSaisie">Début de l'enchère : </label>
        <input type="date" name="debutEnchereSaisie" id="debutEnchereSaisie" required value="${article.dateDebut}">
        <label for="finEnchereSaisie">Fin de l'enchère : </label>
        <input type="date" name="finEnchereSaisie" id="finEnchereSaisie" required value="${article.dateFin}">

        <fieldset>
            <Legend>Retrait</Legend>
            <label for="rueRetrait">Rue : </label>
            <input type="text" name="rueRetrait" id="rueRetrait" value="${utilisateur.rue}" required>
            <label for="cPRetrait">Code Postal : </label>
            <input type="text" name="cPRetrait" id="cPRetrait" value="${utilisateur.codePostal}" required>
            <label for="villeRetrait">Ville : </label>
            <input type="text" name="villeRetrait" id="villeRetrait" value="${utilisateur.ville}" required>
        </fieldset>

        <input type="submit" value="Enregistrer">
        <input type="reset" value="Reset formulaire">
    </form>

    <form action="AccueilConnectedServlet" method="get">
        <input type="submit" name="retourAccueil" value="Retour">
    </form>
</main>
</body>
</html>