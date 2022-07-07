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
    <title>inscription</title>
</head>
<body>
<h1>Inscription Profil</h1>
<form action="ConnectionInscriptionServlet" method="post">
    <div>
        <div>
            <label for="pseudo">Pseudo :</label>
            <input type="text" id="pseudo" name="pseudo">
        </div>
        <div>
            <label for="firstName">Prenom :</label>
            <input type="text" id="firstName" name="firstName">
        </div>
        <div>
            <label for="phone">Telephone</label>
            <input type="text" id="phone" name="phone">
        </div>
        <div>
            <label for="postalCode">Code Postale :</label>
            <input type="text" id="postalCode" name="postalCode">
        </div>
        <div>
            <label for="password">Mot de passe :</label>
            <input type="password" id="password" name="pasword">
        </div>
    </div>
    <div>
        <div>
            <label for="name">Nom :</label>
            <input type="text" id="name" name="name">
        </div>
        <div>
            <label for="firstName">Prenom :</label>
            <input type="text" id="firstName" name="firstName">
        </div>
        <div>
            <label for="phone">Telephone</label>
            <input type="text" id="phone" name="phone">
        </div>
        <div>
            <label for="postalCode">Code Postale :</label>
            <input type="text" id="postalCode" name="postalCode">
        </div>
        <div>
            <label for="password">Mot de passe :</label>
            <input type="password" id="password" name="pasword">
        </div>
    </div>

    <input type="submit" name="valider">
</form>
</body>
</html>
