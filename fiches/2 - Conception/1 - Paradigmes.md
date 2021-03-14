# Les paradigmes de programmation

Exemples : https://github.com/gronono/cours-genie-logiciel/tree/main/exemples/paradigms

## Impératif / Procédural

* Déroulement du code simple
* Variables globales
* Pleins d'effets de bords possibles
* Exemple typique : PL/SQL

## Programmation Orienté Objet

* Déroulement du code plus complexe
* Difficulté à bien controller les états
* Exemple Java "classique"

## Programmation Fonctionnelle

* Fonction mathématiques => tjrs le même résultat
* Immutabilité des états
* Difficulté à créer des effets de bords
* Exemple typique Scala

## Programmation Réactive Fonctionnelle

* Fonctionnel + traitements non bloquants (voir async)
* Gestion de flux de données continues
* Idée : plus d'états.
* Utilisation de libs : RxJS / RxJava, Flux, ...