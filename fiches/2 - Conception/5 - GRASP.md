# G.R.A.S.P.

* General responsibility assignment software principles
* L'idée est de savoir comment assigner des responsabilités/rôles aux classes
* Se poser des questions. 
* Choisir les réponses

## Spécialiste de l'information

* A qui donner la responsabilité ?
* Qui dispose de l'information nécessaire à la réalisation de cette tâche ?

* À celui qui connait les informations permettant de résoudre la responsabilité.

* Exemple dans Schotten Totten
- Qui sait si c'est au joueur 1 ou 2 de jouer ? la classe Game, Board, Joueur ?
- Qui sait piocher une carte ? La classe Game, la classe Board, la classe Stock ?

## Créateur

* Qui prend la responabilité de créer une instance de la classe ?

* Les conteneurs créent le contenu
* Les objets complexes sont créés par des objets responsable de la création.

* Exemple 
- qui crée les 54 cartes ? La classe Game, Board, Stock ?
- qui crée la pioche ?

http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLWWkoK_ELgZcgkL25d1BJ2x9ByfCBGRAA6XN0_MKP2RNAYGNfIQMf3hd9EQ1LMbe0hMXgTVJiuCO0JFFAJ-nA0Li0OIbgmjL0E73DI3CuE9oICrB0JeH0000

## Faible couplage

* Minimiser les dépendances entre les objets et réduire l'impact des changements

* Lors d'un ajout d'un couplage, se poser la question comment réduire le couplage ?

* X est couplé fortement à Y =
- X possède un attribut de type Y ou
- X est une sous-classe de Y (directement ou indirectement)

* X est couplé faiblement à Y
- X utilise Y dans une de ses méthode

* Exemple
- Qui a la responsabilité de piocher ?

http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLd3AJonAKQZcqaufIYpN2CX9h4mjqb48BibFpjRagkM2geA8WvGbfgGu0tLeW0YG0eX-NLqx1IKj9QWwc2wFnBmKR7eWga2Qm4eWgY5smbsYQQK0Kevi0qG5p71diBk1ya0Zu0w0w06hGnLoICrB0NeQ0000

http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKfCBialKYZ8IQnCBUA2K0gwkdOAJlc9HIaALWefHOdb6X1n7ONYalpaR4qki1nOLJ180APAamlCHT6U3AIGr0U03GAA9wQaE0C5DK3ocbm127iz4lDICEGTKlDIW8u50000

Attention : aux GOD classes. Compromis entre Couplage et Spécialiste de l'info

## Contrôleur

* Comment coordonner les messages provenant de l'extérieur (ex IHM) sans coupler le modèle à l'extérieur ?

* Inventer un objet qui va servir de zone tampon entre le système externe et le modèle objet

* Exemple 
- Comment associer le gérer le fait qu'un joueur joue une carte sur une tuile ?



http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKfCBialKYZ8IQnCBUA2K0gwkdOAJlc9HIaALc0P3OYuZa8oK4n7eRWaFozLamki0gms02mDKmnIfCaLW33A8p4FP59HQcv-MQepK1Qg1650CCX4LFqEgNafGFS10000


## Forte cohésion

* Comment s'assurer que les objets restent compréhensibles et faciles à gérer tout en gardant un faible couplage ?

* Attribuer les responsabilités de telle sorte que la cohésion soit forte

* Cohésion = font des trucs qui vont ensemble. Notion sémantique. Notion subjective.

* Exemple
- Comment vérifier que le vainqueur d'une borne ?



http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLd3EpqtAp4lCBCxFKx2n0V8A4eiIat9IxUmKghbgkLBpIdEHrOHK5gG29HIqgu7cb6Gcroeu-_lu1yK7XVeX2uPu1BcwnlkxnNjx-hbWg4OMGDCO7EeBj1NPKRgwTkWEW3aziIX5eHfJjPA1dfwn4bYQ2weqk2G_3-nk1UsqpBoKyCoylDGY3KqhP9E1zeALGSmmKaAHSqZDIm466W00

## Polymorphisme

* Comment gérer des alternatives structurelles ? (if / switch)

* Affecter la responsabilité aux types et proposer plusieurs implémentations alternatives

* Exemple
- Commment gérer les combinaisons de Schotten-Totten ?



http://www.plantuml.com/plantuml/svg/ZP4nQyCm48Lt_GhXAIKab7OBngHaRA7G6ZgK3cVfJ0Mdav3a8OJyzoek2auy9AFkFhttkBUD2K8QB0b54AFSETiP1XCToxhEBmy1EiAcaGUnF6Gw6NMKAY0aNBoPcEeT1DqyRAPVnL4OJXXwK3YTjtkFMKUUXO3eDDjSGzy_6LB0BzxJldMNHfrpX70oAPd9XO-1fR6Uq2AdE3SjSFiR4D_xLyFwDb_4xoBlJV0vs1kScBQmMZNNJ8a6GMTyHbUFw_LpDQv5yKoEnylBPMzOVnbc38jPQV_OgF5KNUoso7gmz0S0

## Fabrication pure

* Comment faire quand les objets du monde réel ne sont pas utilisables en fiable couplage et forte cohésion ?

* Affecter un ensemble de responsabilités fortement cohésives dans une classe créée artificiellement pour l'occassion

* Exemple:
- comment gérer le fait qu'un joueur peut avoir uniquement 3 cartes par tuile de frontière ?
=> création d'une classe StoneArea. Chaque Stone possède une StoneArea par joueur.

## Indirection

* Comment éviter un couplage immédiat entre plusieurs éléments ?

* Introduire un élément dédié à ce couplage pour laisser les éléments pré-existants isolés

* Exemple:
- Comment découpler les actions des joueurs sur l'ensemble des objets ?


http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLd1Fp4rLgEPIK2X8BKhBByhLS4mkoSpFq-IgvShCAm6A9IQdAa345Ag1Wc3rkhfsK36eAIv5YULGHPcv1JcfkQbv9SL8sg3A0d8IAubGvfgN4b9Qb8TRPIsNGsfU2j0J0000

## Protégé des variations

* Comment concevoir des objets qui ne seront pas impactés par les variations ou l'instabilités d'autres parties du système ?

* Trouver ce qui varie et l'encapsuler dans une interface stable

* Exemple:
- Comment gérer les cartes "joker" ?

http://www.plantuml.com/plantuml/svg/XP91QiCm44NtFeNM1US0MOH0QWebj90kIYbTJErfBJ8Q6KaE59ExLx6nv2egsLb-Vvxd2s-j0-DwHOKzIkx0W18a6TrFXq8Rr-f2iaFp1JMAdIPjn52S2-HUYHS7t81ffjTITOGAsTcG4uEtErcV3zLzFBnL-_tpQpm_7AhgoJjh0kjdMwqjV1B-RotX198k6Rl-kyJxtOV7zKM1d33_XSIzMcsIIEpgWK7-TgqOmcfpDg2ut38koXDGZslXPTUrRWpdoys1VB-0bnM3Szao19TDTnwCBSU7ijnCDnsFOMhkGi0ZZ1MY9C2hsysZLFweZsYovedusUGVoO5WtI8tlQ9V
