<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="stylePageacceuil.css">
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"
    />
    <title>Encheres</title>
</head>
<body>
<header>
    <div class="connection">
        <div class="lien">
            <a href="InscriptionServlet">S'inscrire</a>
        </div>
        <div class="lien">
            <a href="ConnexionServlet">Se connecter</a>
        </div>
    </div>
    <div class="enTete">
        <div>
            <img class="logo" src="img/logo-g9fe0fcf63_1280-removebg-preview.png" alt="">
        </div>
        <div class="titre">
            <h1>Bienvenue sur les enchères trop bien </h1>
        </div>
    </div>
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
            <a href="AfficherProfilServlet?pseudo=${article.pseudo}">${article.pseudo} </a>
        </div>
    </c:forEach>
</main>

</body>
</html>
