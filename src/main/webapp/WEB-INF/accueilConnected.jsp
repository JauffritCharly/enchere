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
    <h1>Liste des enchères Connecté</h1>
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

</main>

</body>
</html>
