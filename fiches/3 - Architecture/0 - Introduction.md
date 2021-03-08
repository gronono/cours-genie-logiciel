# Architecture logiciel

## Définitions

* Décrit les différents éléments d'un logiciel et leurs interactions.
* Se concentre sur le comment.
* Martin Fowler (aka Uncle Bob) :
> A second common style of definition for architecture is that it's “the design decisions that need to be made early in a project”, but Ralph (NDLR: Ralph Johnson) complained about this too, saying that it was more like the decisions you wish you could get right early in a project.
> His conclusion was that “Architecture is about the important stuff. Whatever that is”
* Autre définition de Fowler : tout ce qui est difficilement changeable (modifiable)

## Processus d'élaboration

* Diviser pour mieux régner => complexité(A + B) > complexité(A) + complexité(B)
* Raisonnement par niveau d'abstraction => language + données + métier + IHM = application
* Processus intératif: résoudre les problèmes les uns après les autres

Exemple pour aller à la tour Eiffel à Paris :
Grandes lignes : Prendre l'avion pour aller à Tokyo, Prendre l'avion pour Paris
Raffinement 1 : Prendre la navette sur Tontouta, prendre l'avion à Tokyo, prendre l'avion pour Paris, prendre le métro jusqu'à la tour Eiffel
....
Jusqu'à un niveau de détails suffisants.


## Bonne architecture ?

* Réduire les coûts: réutilisation, *diminution du temps de maintenance*
* Augmenter la *qualité logiciel*

![qualite](https://codinghorror.typepad.com/.a/6a0120a85dcdae970b012877707a45970c-pi)

## Quelques "choses" importantes

* Interopérabilité
* Portabilité / Compatibilité
* Conformité avec le besoin
* Sécurité (Confidentialité, Authenticité, Intégrité, Disponibilité)
* Extensibilité (évolutions)
* Maintenabilité (bugs)
* Convivialité (apprentissage par les autres)


## Quelques styles d'architecture

* Architecture n-tiers
* Service Oriented Architecture, Web Oriented Architecture, Microservices
* Modèle en couches
* Architecture en oignons
* Architecture Hexagonale
* Clean Architecture
* Command Query Responsibility Segregation
* Event Sourcing

Peuvent se combiner entre elles.

Pas d'architecture ultime.