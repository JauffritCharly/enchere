<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="monProfil.css">
    <title>Mon Profil</title>
</head>
<header>
<h1 id="titre">Mon profil :</h1>
</header>
<body>
<div>
    <div id="informations">
        <div class="caseProfil">
            <p>Pseudo</p>
            <input type="text" name="pseudo" value="${utilisateur.pseudo}" disabled >
        </div>
        <div class="caseProfil">
            <p>Nom</p>
            <input type="text" name="nom" value="${utilisateur.nom}" disabled>
        </div>
        <div class="caseProfil">
            <p>Prénom</p>
            <input type="text" name="prénom" value="${utilisateur.prenom}" disabled>
        </div>
        <div class="caseProfil">
            <p>Email</p>
            <input type="text" name="email" value="${utilisateur.email}" disabled>
        </div>
        <div class="caseProfil">
            <p>Téléphone</p>
            <input type="text" name="telephone" value="${utilisateur.telephone}" disabled>
        </div>
        <div class="caseProfil">
            <p>Rue</p>
            <input type="text" name="rue" value="${utilisateur.rue}" disabled>
        </div>
        <div class="caseProfil">
            <p>Code postal</p>
            <input type="text" name="codePostal" value="${utilisateur.codePostal}" disabled>
        </div>
        <div class="caseProfil">
            <p>Ville</p>
            <input type="text" name="ville" value="${utilisateur.ville}" disabled>
        </div>
    </div>
    <div id="boutonProfil">
        <div>
            <form action="MonProfilServlet" method="post">
                <input type="submit" name="modifier" value="Modifier">
            </form>
        </div>
        <div>
            <form action="AccueilConnectedServlet" method="get">
                <input type="submit" name="retourAccueil" value="Retour">
            </form>
        </div>
    </div>
</div>
</body>
<footer>

</footer>
</html>