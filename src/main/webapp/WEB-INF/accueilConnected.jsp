<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Encheres</title>
</head>
<body>
<header>
    <a href="${pageContext.request.contextPath}/EnchereServlet">Enchere</a>
    <a href="${pageContext.request.contextPath}/NouvelleVenteServlet">Vendre un article</a>
    <a href="${pageContext.request.contextPath}/MonProfilServlet">Mon profil</a>
    <a href="${pageContext.request.contextPath}/DeconnexionServlet">Deconnexion</a>

</header>
<main>

    <h1>Liste des enchères - Connecté</h1>
    <form action="#RechercheServlet" method="get">
        <label for="rechercheArticle"> Filtres :</label>
        <input type="search" name="rechercheArticle" id="rechercheArticle" placeholder="Le nom de l'article contient">
        <label for="categorie"> Catégorie :</label>
        <select name="categorie : " id="categorie">
            <option value="0" selected>Toutes</option>
            <option value="1">Informatique</option>
            <option value="2">Ameublement</option>
            <option value="3">Vêtement</option>
            <option value="4">Sport&Loisirs</option>
        </select>
        <input type="submit" value="Rechercher">

        <fieldset>
            <legend><input type="radio">Achats</legend>

            <input type="checkbox" id="encheresOuvertes" name="encheresOuvertes">
            <label for="encheresOuvertes">enchères Ouvertes</label><br/>

            <input type="checkbox" id="encheresEnCours" name="encheresEnCours">
            <label for="encheresEnCours">mes enchères en cours</label><br/>

            <input type="checkbox" id="encheresRemportees" name="encheresRemportees">
            <label for="encheresRemportees">mes enchères remportées</label>

            <legend><input type="radio">Ventes</legend>

            <input type="checkbox" id="ventesEnCours" name="ventesEnCours">
            <label for="ventesEnCours">mes ventes en cours</label><br/>

            <input type="checkbox" id="ventesNonDebutees" name="ventesNonDebutees">
            <label for="ventesNonDebutees">ventes non débutées</label><br/>

            <input type="checkbox" id="ventesTerminées" name="ventesTerminées">
            <label for="ventesTerminées">ventes terminées</label>
        </fieldset>
    </form>
    <!--
    <c:forEach var="article" items="${allArticles.selectAllArticleVendu}">
        <ul class="list-group col-4 offset-4">
            <li class="list-group-item text-center">
                <p>${article.nom}</p>
            </li>
        </ul>
    </c:forEach>
    -->
</main>

</body>
</html>
