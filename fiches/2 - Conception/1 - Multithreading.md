# Multithreading

## Définition

* Parallélisme
* Concurrency

![multithreading](https://miro.medium.com/max/700/1*OVznN7DeSoY05aUPNMhpwg.jpeg)

## Problème 

* Accès mémoire partagé
* Accès concurrent : lectures / écritures simultanées.

## Exemple


* Machines à cafée avec une file d'attente
* Mode séquentiel : une machine => durée longue mais code simple
* Mode parallèle : plusieurs machines, plusieurs files d'attente => durée rapide, code complexe, mais pas source bug
* Mode concurrent : plusieurs machines, aucune file d'attente => durée rapide, code complexe, mais source de bug (synchronized)

