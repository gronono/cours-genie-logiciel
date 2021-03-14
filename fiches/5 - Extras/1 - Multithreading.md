# Multithreading

## Définition

* Parallélisme
* Concurrency

![multithreading](https://miro.medium.com/max/700/1*OVznN7DeSoY05aUPNMhpwg.jpeg)

## Problème 

* Accès mémoire partagé
* Accès concurrent : lectures / écritures simultanées.

## Exemple

![exemple](https://raw.githubusercontent.com/gronono/cours-genie-logiciel/main/exemples/multithreading/exemple.png)

* Machines à cafée avec une file d'attente
* Mode séquentiel : une machine => durée longue mais code simple
* Mode parallèle : plusieurs machines, plusieurs files d'attente => durée rapide, code complexe, mais pas source bug
* Mode concurrent : plusieurs machines, aucune file d'attente => durée rapide, code complexe, mais source de bug (synchronized)

## Utilisations courantes

* Serveur web => Un Thread par requete HTTP.
* Accès à la base de données => Pool de Threads
* Traitement très long / Traitement en background => un Thread non géré par UI / le serveur

## Recommandations

* Éviter les accès concurrents lorsque c'est possible : système de lock, le dernier à raison
* Gérer le multhreading par des librairies : API Executors, API Stream, Spring Job, Guava, ...
* Éviter le multhreading lorsque c'est possible : Promise JS, RxJS, Flux, invokeLater, ...
* Attention : Chaque Thread possède sa Stack => consommation mémoire (augmentée)