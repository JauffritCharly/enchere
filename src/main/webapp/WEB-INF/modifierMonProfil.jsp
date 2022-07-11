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
    <link href="modifierMonProfil.css" rel="stylesheet">
    <title>Mon profil</title>
</head>
<body>
<div id="formulaire">
    <div id="titrePage">
        <p>--- Mon profil ---</p>
    </div>
    <div id="champs">
        <form action="" method="get" id="form">
            <div id="partieGaucheForm">
                <div class="case">
                    <p>Pseudo</p>
                    <input type="text" name="pseudo">
                </div>
                <div class="case">
                    <p>Prénom</p>
                    <input type="text" name="prenom">
                </div>
                <div class="case">
                    <p>Téléphone</p>
                    <input type="text" name="telephone">
                </div>
                <div class="case">
                    <p>Code postal</p>
                    <input type="text" name="codePostal">
                </div>
                <div class="case">
                    <p>Mot de passe actuel</p>
                    <input type="text" name="motDePasseActuel">
                </div>
                <div class="case">
                    <p>Nouveau mot de passe</p>
                    <input type="text" name="nouveauMotDePasse">
                </div>
            </div>
            <div id="partieDroiteForm">
                <div class="case">
                    <p>Nom</p>
                    <input type="text" name="nom">
                </div>
                <div class="case">
                    <p>Email</p>
                    <input type="text" name="email">
                </div>
                <div class="case">
                    <p>Rue</p>
                    <input type="text" name="rue">
                </div>
                <div class="case">
                    <p>Ville</p>
                    <input type="text" name="ville">
                </div>
                <div class="case">
                    <br>
                </div>
                <div class="case">
                    <p>Confirmation</p>
                    <input type="text" name="confirmation">
                </div>
            </div>
            <div id="credit">
                <p>Crédit</p>
                <input type="text" name="credit" disabled>
            </div>
            <div id="bouton">
                    <input type="submit" value="Enregistrer la modification">
            </div>
        </form>
    </div>
</div>
</body>
</html>