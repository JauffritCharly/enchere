<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="styleAccueilConnected.css">
    <title>Encheres</title>
</head>
<body>
<header>
    <div class="rowheader">
        <a href="AccueilConnectedServlet">Enchere</a>
        <a href="${pageContext.request.contextPath}/EnchereServlet">Vendre un article</a>
        <a href="${pageContext.request.contextPath}/MonProfilServlet">Mon profil</a>
        <a href="${pageContext.request.contextPath}/DeconnexionServlet">Deconnexion</a>
    </div>
</header>
<main>

    <h1>Liste des enchères - Connecté</h1>
    <div id="divform">
        <form action="RechercheServlet" method="post" class="row">
            <div class="rowform">
                <div class="filtre">
                    <label for="rechercheArticle"> Filtres :</label>
                    <input type="search" name="rechercheArticle" id="rechercheArticle"
                           placeholder="Le nom de l'article contient">
                    <label for="categorie"> Catégorie :</label>
                    <select name="categorie" id="categorie">
                        <option value="0">Toutes</option>
                        <option value="1">Informatique</option>
                        <option value="2">Ameublement</option>
                        <option value="3">Vêtement</option>
                        <option value="4">Sport&Loisirs</option>
                    </select>
                </div>
                <fieldset>
                    <div class="column">
                        <div class="row">
                            <input type="radio" id="radioAchat" name="achatVente" value="achat" disabled>
                            <label for="radioAchat">Achats</label>
                        </div>

                        <div class="row">
                            <input type="checkbox" id="encheresOuvertes" name="encheresOuvertes" disabled>
                            <label for="encheresOuvertes">Enchères Ouvertes</label>
                        </div>
                        <div class="row">
                            <input type="checkbox" id="encheresEnCours" name="encheresEnCours" disabled>
                            <label for="encheresEnCours">Enchères en cours</label>
                        </div>
                        <div class="row">
                            <input type="checkbox" id="encheresRemportees" name="encheresRemportees" disabled>
                            <label for="encheresRemportees">Enchères remportées</label>
                        </div>
                    </div>
                    <div class="column">
                        <div class="row">
                            <input type="radio" id="radioVente" name="achatVente" value="vente" disabled>
                            <label for="radioVente">Mes ventes</label>
                        </div>
                        <div class="row">
                            <input type="checkbox" id="ventesEnCours" name="ventesEnCours" disabled>
                            <label for="ventesEnCours">Ventes en cours</label>
                        </div>
                        <div class="row">
                            <input type="checkbox" id="ventesNonDebutees" name="ventesNonDebutees" disabled>
                            <label for="ventesNonDebutees">Ventes non débutées</label>
                        </div>
                        <div class="row">
                            <input type="checkbox" id="ventesTerminées" name="ventesTerminées" disabled>
                            <label for="ventesTerminées">Ventes terminées</label>
                        </div>
                    </div>
                </fieldset>
                <div>
                    <input type="submit" value="Rechercher" id="rechercherEnchere">
                </div>
            </div>
        </form>
    </div>
    <div class="touteEnchere">
        <c:forEach var="article" items="${affichageArticle}">
            <div class="enchere">
                <div>
                    <h2>${article.nomArticle}</h2>
                </div>
                <div>
                    <p>Prix : ${article.prixInitial}</p>
                </div>
                <div>
                    <p>Fin de l'enchère : ${article.dateFinEncheres1}</p>
                </div>
                <div>
                    <a href="AfficherProfilServlet?pseudo=${article.pseudo}">${article.pseudo}</a>
                </div>
            </div>
        </c:forEach>
    </div>
</main>

</body>
</html>
