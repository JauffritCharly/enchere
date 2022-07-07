<%--
  Created by IntelliJ IDEA.
  User: stagiaire
  Date: 07/07/2022
  Time: 09:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Mon profil</title>
</head>
<head>
    <title>Modifier mon profil</title>
</head>
<body>
<h1>--- Modifier mon profil ---</h1>
<form action="/enchere/MiseAJourProfil" method="get">
    <input type="button" name="miseAJourProfil" value="Enregistrer">
</form>
<form action="/enchere/MiseAJourProfil" method="post">
    <input type="button" name="supprimerProfil" value="Supprimer">
</form>
</body>
</html>
