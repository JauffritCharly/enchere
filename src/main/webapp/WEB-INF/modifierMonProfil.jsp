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
    <link rel="stylesheet" href="modifierMonProfil.css">
    <title>Modifier mon profil</title>
</head>
<header>
    <div class="logo">
        <a href="RetourServlet"><img src="img/Capture2-removebg-preview.png" alt="" class="imgLogo"></a>
    </div>
</header>
<body>
<div id="formulaire">
    <div id="titrePage">
        <p>Modifier mon Profil</p>
    </div>
    <div id="champs">
        <form action="MiseAJourProfilServlet" method="get" id="form">
            <div>
                <div class="case">
                    <p>Pseudo</p>
                    <input type="text" name="pseudo" value="${utilisateur.pseudo}">
                </div>
                <div class="case">
                    <p>Nom</p>
                    <input type="text" name="nom" value="${utilisateur.nom}">
                </div>
                <div class="case">
                    <p>Prénom</p>
                    <input type="text" name="prenom" value="${utilisateur.prenom}">
                </div>
                <div class="case">
                    <p>Email</p>
                    <input type="text" name="email" value="${utilisateur.email}">
                </div>
                <div class="case">
                    <p>Téléphone</p>
                    <input type="text" name="telephone" value="${utilisateur.telephone}">
                </div>
                <div class="case">
                    <p>Rue</p>
                    <input type="text" name="rue" value="${utilisateur.rue}">
                </div>
                <div class="case">
                    <p>Code postal</p>
                    <input type="text" name="code_postal" value="${utilisateur.codePostal}">
                </div>
                <div class="case">
                    <p>Ville</p>
                    <input type="text" name="ville" value="${utilisateur.ville}">
                </div>
            </div>
            <div id="bouton">
                <input type="submit" value="Enregistrer la modification">
            </div>
        </form>
        <form action="MiseAJourProfilServlet" method="post">
            <input type="submit" value="Supprimer le compte">
        </form>
    </div>
</div>
</body>
</html>