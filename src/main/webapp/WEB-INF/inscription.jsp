<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="stylesheet" href="styleInscription.css">
    <title>Inscription</title>
</head>
<body>
<div class="header">
    <div class="imglogoInscription">
        <img src="img/Capture2-removebg-preview.png" alt="" class="imgLogo">
    </div>
    <div class="titreInscription">
        <h2>Inscription Profil :</h2>
    </div>
</div>
<form action="InscriptionServlet" method="post">
    <div class="formulaireInscription">
        <div class="formGauche">
            <div class="input">
                <label for="pseudo">Pseudo :</label>
                <input type="text" id="pseudo" name="pseudo" value="bob">
            </div>
            <div class="input">
                <label for="firstName">Prenom :</label>
                <input type="text" id="firstName" name="firstName">
            </div>
            <div class="input">
                <label for="phone">Telephone :</label>
                <input type="text" id="phone" name="phone">
            </div>
            <div class="input">
                <label for="postalCode">Code Postale :</label>
                <input type="text" id="postalCode" name="postalCode">
            </div>
            <div class="input">
                <label for="password">Mot de passe :</label>
                <input type="password" id="password" name="password">
            </div>
        </div>
        <div>
            <div class="input">
                <label for="name">Nom :</label>
                <input type="text" id="name" name="name">
            </div>
            <div class="input">
                <label for="email">Email :</label>
                <input type="email" id="email" name="email">
            </div>
            <div class="input">
                <label for="rue">Rue :</label>
                <input type="text" id="rue" name="rue">
            </div>
            <div class="input">
                <label for="city">Ville :</label>
                <input type="text" id="city" name="city">
            </div>
            <div class="input">
                <label for="confirmationmdp">Confirmation MdP :</label>
                <input type="password" id="confirmationmdp" name="confirmationmdp">
            </div>
        </div>
    </div>
    <div class="inputCreer">
        <input type="submit" name="valider" value="CREER">
        <a href="index">Annuler</a>
    </div>
</form>
</body>
</html>
