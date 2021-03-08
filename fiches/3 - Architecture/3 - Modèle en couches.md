# Modèle en couches

* Idée générale regrouper les traitements en couches
* Généralement:
** une couche pour la présentation
** une couche pour le métier (les services)
** une couche pour l'accès aux données
* Mais pas que : couche de sécurité, de transaction, de log, ...

![layers](https://hendryluk.files.wordpress.com/2009/08/image.png)

* Règle absolue : la couche supérieur ne peut dépendre que de la couche directement inférieure
* Permet de structurer facilement son projet (un package par couche)


## Exemple Strict

![strict](http://www.plantuml.com/plantuml/svg/jP31QiD034Jl-nKw9XIdTnzoQ59e8Cqbz0EMjMABh2MpgmHCoR_NjHtgsYxaqjio6cdVZCUJWWe4oWk5Z08w9M5Zufcuii6Mu8bHwmf1WXPYJ6NTsUO8cHNuD03EsnZXGybJj8gNyCfAMhSpWCHBJfp2KGDntaaivKRAogF-rhDc_M0fHiiEKzYBitxRQEtqAKTL376nX6U8ztSpkfavY6rFrooUYBENUl_DiUY-MwPJtlOIZ4-iLkiPw-sdXOZXIWxdc_Y_3lxCVHpmF91zclf-84dMepBcVVCDFM8TraX5sIDtYJR2KJpktjvxkKqJBjn6xw1Xw1hXzb-ENLE2Bm00)

Sources : dans exemples/layers/strict

Avantages :
* On peut facilement changer les implémentations sans casser les autres logiques
* On peut tester chaque couche de façon unitaire ou en dépendant de la couche inférieur

Inconvénients :
* Code dupliqué : deux classes utilisateurs dans l'exemple
* Services sans logique : passe plat entre les couches
* Lorsque le projet grossit, difficile de s'y retrouver.

## Exemple avec DTO

On peut ajouter des DTO (Data Transfert Object) pour résoudre le problème de la duplication.
Ces objets sont visibles par toutes les couches


