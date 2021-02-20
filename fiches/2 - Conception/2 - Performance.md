# Performance

## Citations

* "L'optimisation prématurée est la source de tous les maux."
* "On devrait oublier les petites optimisations locales, disons, 97 % du temps : l'optimisation prématurée est la source de tous les maux"
* "Règle 1 : ne pas optimiser. Règle 2 (pour les experts uniquement) : il est trop tôt."

## Dualité

* Mémoire vs CPU
* Diminuer le CPU = Augmenter la mémoire (cache)
* Diminuer la mémoire = Augmenter le CPU (recalcul)

## Compléxité

* Une JVM est complexe: bytecode + JIT + GC + OS = prédictions impossibles
* Le code écrit n'est pas celui executé !!!
* Latences diverses : accès à la mémoire, CPU, disques, réseau, base de données, ....

## Bonnes pratiques

* Évite d'avoir à optimiser trop tôt.
* Portée des variables doit être réduite au maximum => facilitation du GC, évite les memory leaks
* Collections statiques (donc globales) = fuite mémoire si non controllées
* Créer de nombreux petits objets avec une durée de vie faible
* Créer des gros objets avec un durée de vie évelée.
* Réduire les I/O
* Lisibilité vs Optiomisation => préférer la lisibilité

## Optimisation

* Uniquement si nécessaire
* Métriques avant
* Optimisation
* Métriques après
* Comparaison avant et après
* Gagner au moins une 1 seconde sinon non visible pour l'utilisateur

## Problèmes récurrents

* Collection statique => memory leak
* Lire trop de données de la base => OutOfMemory ou latence réseau
* Requête non optimisée sur la base => latence
* Ne pas fermer les ressources => memory leak + os leak
* HeapSpace trop grand + memory leak => GC Overload
* Pas assez de threads sur un serveur => attente des clients

## Exemples

* 