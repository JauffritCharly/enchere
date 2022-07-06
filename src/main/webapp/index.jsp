<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="UT

    <meta name=" viewport
    "
    content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Accueil</title>
</head>
<body>

<!--  !!!!!!!!!!
2 #Servlets
input type password
!!!!!!!!!!!!!! -->

<form action="#AccueilServlet" method="get">

    <label for="saisieIdentifiant"> Identifiant :</label>
    <input type="email" name="saisieIdentifiant" id="saisieIdentifiant">
    <label for="saisiePassword">Mot de Passe : </label>
    <!--  !!!!!!!!!!input type password!!!!!!!!!!!!!! -->
    <input type="password" name="saisiePassword" id="saisiePassword">
    <input type="submit" value="Connexion">
    <input type="checkbox" name="rememberMe" id="rememberMe">
    <label for="rememberMe">Se souvenir de moi</label>
    <a href="#Servlet">Mot de passe oublié</a>

    <input type="submit" value="Créer un compte">

</form>

</body>
</html>