# Architecture n-tiers

* Découpage des composants du système
* Chaque tiers représente où le code est exécuté.
* Un tiers est une application
* Ne pas confondre avec le modèle en couche !! (cf Internet)

## 1 tiers

* Client simple sans serveur; ie client lourd
* Exemple Word
* Analogie : vous vous faîtes à manger

## 2 tiers ou client-serveur

* Un client avec un serveur
* Exemple un site web sans base de données
* Le client est exécuté dans le navigateur
* Le serveur est le serveur traitant les demandes du client
* Analogie : vous allez manger dans un petit snack

## 3 tiers

* Très commun
* 3 éléments souvent : client, serveur d'application, base de données
* Le client est la partie web
* L'application réponde aux demandes du client
* et délègue la lecture et la sauvegarde des données à une base
* Analogie : vous allez manger dans un restaurant.
* Le client c'est vous,
* l'application est le serveur qui prend votre commande
* la base de données est le chef qui cuisine votre commande
* le serveur est aussi client du chef (client-serveur)

## n-tiers

* On multiplie les acteurs spécifiques
* Par exemple un proxy gérant la sécurité ou le cache
* Analogie : vous allez dans un grand restaurant
* un tiers est la personne d'accueil qui vous place dans le restaurant
* un autre est le serveur qui prend votre commande et vous apporte vos plats
* un autre est le sommelier
* d'autres pour le chef et ses commis de cuisine.
* Beaucoup de tiers = architecture microservice

!(exemple)[https://microservices.io/i/Microservice_Architecture.png]
