# Diagramme de classes

* Permet de visualiser l'ensemble des classes avec leurs états (les attributs) et leurs comportement (méthodes).
* Diagramme statique
* Ne permet pas voir le comportement (l'enchainement des méthodes)

## Exemple

![exemple](https://www.uml-diagrams.org/examples/class-example-android-camera.png?ut=151210)

## Schéma d'une classe

* Rectangle découpée en trois partie. En haut le nom de la classe, au milieu les attributs, en bas les méthodes

![class](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLl1DT0RHgLmmXeALGcv-dcD9IL5cKcc9ePL2C92Lbuv3tiXAmJEl93KzjGX5GQ9lQab6VaggeOOcp02iyaP8yWwfUIb0Tm40)

### Nom

* Classe abstraite en italique (inclus les interfaces)

![nom](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLl1DT0RHgLo9ISKbHOd99N0HHx10PaagLsPUIMfHMc9oge9lVfudZCFba9gN0ZG80000)

### Classes génériques

* Type dans un rectangle en pointiller en haut à droite

![generics](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLd3EpyrDp4ln0EASr28RPuNKYfBKl1IuX1sN0v0BL0y0)

### Les attributs

* syntaxe : \[\<visibilite>] \<nom> \[<multiplicité>] : \<type> \[= \<valeur par défaut>]
* visibilité : + = public, # protected, ~ package, - private

![visivilite](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLl2jT0RHDgvs2jLSkhcLZYKbHPb9fIMf0KMPPOabgGfM2i50aRnq1Li59O_Kd9ny9Ivb56Nv9Qd99QafG8MUUIMfwQb5N7N8yed9sOdf86DyCejBWDPmQIFBbYRbP2P76yS2vLs0jd7LSZcavgK0dGS0)

## Les méthodes

