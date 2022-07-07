<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="monProfil.css.css" rel="stylesheet">
    <title>Mon Profil</title>
</head>
<body>
<div>
    <div id="profil">
        <div class="caseProfil">
            <p>Pseudo</p>
            <input type="text" name="pseudo" disabled>
        </div>
        <div class="caseProfil">
            <p>Nom</p>
            <input type="text" name="nom" disabled>
        </div>
        <div class="caseProfil">
            <p>Prénom</p>
            <input type="text" name="prénom" disabled>
        </div>
        <div class="caseProfil">
            <p>Email</p>
            <input type="text" name="email" disabled>
        </div>
        <div class="caseProfil">
            <p>Téléphone</p>
            <input type="text" name="telephone" disabled>
        </div>
        <div class="caseProfil">
            <p>Rue</p>
            <input type="text" name="rue" disabled>
        </div>
        <div class="caseProfil">
            <p>Code postal</p>
            <input type="text" name="codePostal" disabled>
        </div>
        <div class="caseProfil">
            <p>Ville</p>
            <input type="text" name="ville" disabled>
        </div>
    </div>
    <div id="boutonProfil">
        <div>
            <a href="modifierMonProfil">Modifier</a>
        </div>
        <div>
            <form action="/enchere/AccueilBis" method="get">
                <input type="button" name="retourAccueil" value="Retour">
            </form>
        </div>
    </div>
</div>

</body>
</html>