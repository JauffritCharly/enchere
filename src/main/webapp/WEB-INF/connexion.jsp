<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="styleConnexion.css">
    <title>Accueil</title>
</head>
<header>
    <h1>Connexion :</h1>
</header>
<body>

<form action="ConnexionServlet" method="post" id="form">

    <label for="saisieIdentifiant"> Identifiant :</label>
    <input type="text" name="saisieIdentifiant" id="saisieIdentifiant" value="${login}">
    <label for="saisiePassword">Mot de Passe : </label>
    <input type="password" name="saisiePassword" id="saisiePassword">
    <input type="submit" value="Connexion">
    <input type="checkbox" name="rememberMe" id="rememberMe">
    <label for="rememberMe">Se souvenir de moi</label>


    <a class="button" href="#popup1">Mot de passe oublié</a>

    <div id="popup1" class="overlay">
        <div class="popup">
            <h2>Réinitialisation du mot de passe</h2>
            <a class="close" href="#">&times;</a>
            <div class="content">
                Nous sommes navrés d'apprendre que vous oubliez si rapidement votre mot de passe... <br>
                Un administrateur doit valider votre demande de réinitialisation de mot de passe. <br>
                Vous recevrez sous peu un lien vous permettant de créer un nouveau mot de passe. <br>
                Un peu de patience, la réinitialisation peut prendre jusqu'à 24h.
            </div>
        </div>
    </div>
</form>
<div class="connection">
    <div class="lien">
        <a href="InscriptionServlet">S'inscrire </a>
    </div>
</div>

</body>
</html>