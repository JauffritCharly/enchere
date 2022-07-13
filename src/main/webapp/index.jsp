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
            <a href="InscriptionServlet">S'inscrire </a>
        </div>
        <div class="lien">
            <a href="ConnexionServlet"> Se connecter</a>
        </div>
    </div>
    <div class="enTete">
        <div class="titre  animate__animated animate__bounce">
            <h1>Interenchere </h1>
            <h2>Le meilleur site d'enchères Français </h2>
        </div>
        <div class="logo">
            <img src="img/Capture2-removebg-preview.png" alt="" class="imgLogo">
        </div>
    </div>
</header>
<main>
    <div>
        <form action="index" method="post" class="formeAcceuil">
            <input type="text" name="rechercheArticle" id="rechercheArticle"
                   placeholder="Le nom de l'article contient">
            <select name="categorie : " id="categorie">
                <option value="">Toutes</option>
                <option value="1">Informatique</option>
                <option value="2">Ameublement</option>
                <option value="3">Vêtement</option>
                <option value="4">Sport&Loisirs</option>
            </select>
            <option value=""></option>
            <input type="submit" value="Rechercher" class="boutonrechercher">
        </form>
    </div>
    <div class="touteEnchere">
        <c:forEach var="article" items="${affichageArticle}">
            <div class="enchere">
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
                    <p>${article.pseudo}</p>
                </div>
            </div>
        </c:forEach>
    </div>

</main>

</body>
</html>
