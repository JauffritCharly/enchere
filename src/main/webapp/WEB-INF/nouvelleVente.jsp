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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styleNouvelleVente.css">
</head>
<body>

<main>
    <h1>Nouvelle Vente</h1>
    <form id="form1" action="EnchereServlet" method="post">
        <label for="saisieArticle"> Article :</label>
        <input type="" name="saisieArticle" id="saisieArticle" value="${article}">
        <label for="descriptionSaisie">Description : </label>
        <textarea name="descriptionSaisie" id="descriptionSaisie" cols="30" rows="10"></textarea>
        <label for="categorieChoisie"> Catégorie :</label>
        <select name="categorieChoisie : " id="categorieChoisie">
            <option value="0" selected disabled>Toutes</option>
            <option value="1">Informatique</option>
            <option value="2">Ameublement</option>
            <option value="3">Vêtement</option>
            <option value="4">Sport&Loisirs</option>
        </select>
        <label for="imageArticle">Photo de l'article : </label>
        <input type="file" name="imageArticle" id="imageArticle">
        <label for="prixSaisie">Mise à prix : </label>
        <input type="number" name="prixSaisie" id="prixSaisie">
        <label for="debutEnchereSaisie">Début de l'enchère : </label>
        <input type="date" name="debutEnchereSaisie" id="debutEnchereSaisie">
        <label for="finEnchereSaisie">Fin de l'enchère : </label>
        <input type="date" name="finEnchereSaisie" id="finEnchereSaisie">
        <p>Retrait</p>
        <label for="rueRetrait">Rue : </label>
        <input type="text" name="rueRetrait" id="rueRetrait" value="${utilisateur.getRue()}">
        <label for=" cPRetrait">Code Postal : </label>
        <input type="text" name="cPRetrait" id="cPRetrait" value="${utilisateur.codePostal}">
        <label for="villeRetrait">Ville : </label>
        <input type="text" name="villeRetrait" id="villeRetrait" value="${utilisateur.ville}">

        <input type="submit" value="Enregistrer">
        <input type="reset" value="Annuler">

    </form>


</main>
</body>
</html>