# Command Query Responsibility Segregation

* Constat : les utilisateurs lisent plus de données qu'ils en écrivent
* Idée : la lecture doit être rapide et l'écriture peut être plus lente
* Séparation entre les demandes d'écriture (Command) et les demandes de lecture (Query)
* Ecriture : normalisation de la données, cohérence des données fortees
* Lecture : données dénormalisés, accès le plus rapide possible

![](https://herbertograca.files.wordpress.com/2017/07/2006-1-cqrs.png)


# CQRS + Event Sourcing 

![](https://miro.medium.com/max/700/1*feM_-VHhK670LlEQekesKg.png)

* Constat : difficulté de savoir ce qu'il s'est passé
* Idée : stocker tous les changements métiers dans des évènements
* Ne stocke plus les états finaux mais les deltas uniquements (un peu comme git)
* Les évènements sont lus pour créer une base dénormalisée de lecteur (adapté aux clients)
* Retour arrière possible en jouant les évènements uniquement à une certaine date