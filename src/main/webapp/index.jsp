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
    <a href="InscriptionServlet">S'inscrire</a> -
    <a href="ConnexionServlet">Se connecter</a>
    <h1>Liste des enchères Invité</h1>
</header>
<main>

    <form action="#RechercheServlet" method="get">


        <label for="rechercheArticle"> Filtres :</label>
        <input type="search" name="rechercheArticle" id="rechercheArticle" placeholder="Le nom de l'article contient">
        <label for="categorie"> Filtres :</label>
        <select name="categorie : " id="categorie">
            <option value="">Toutes</option>
            <option value="1">Informatique</option>
            <option value="2">Ameublement</option>
            <option value="3">Vêtement</option>
            <option value="4">Sport&Loisirs</option>
        </select>
        <option value=""></option>
        <input type="submit" value="Rechercher">
    </form>
    <c:forEach var="article" items="${affichageArticle}">
        <div>
            <h2>${article.nomArticle}</h2>
        </div>
        <div>
            <p>Prix : ${article.prixInitial}</p>
        </div>
        <div>
            <p>Fin de l'enchère : ${article.dateFinEncheres1}</p>
        </div>
        <div>
            <p>Vendeur : ${article.pseudo}</p>
        </div>
    </c:forEach>
</main>

</body>
</html>
