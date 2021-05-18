# Devoir CC1 : PMT

Q1 - Pas de multijoueur, déployé uniquement sur Mobile, pas de stockage d'information : réponse a client simple
Q2 - diagramme de séquence
Q3 - diagramme de classes
Q4 - diagramme des cas d'utilisation

Q5 - Diagramme de séquence

Je suppose que les lancer de dés se font sans interraction de la part du joueur.
J'ai considéré que le joueur interragit avec la porte pour l'ouvrir.
Pendant le combat à chaque fois que c'est à lui de jouer, il doit utiliser le CU "Combattre monstre" pour déclencher son action.

Il peut désider de récupérer ou pas le trésor.

Les CU sont conditionnés à l'affichage des écrans. Par exemple, il faut être sur l'écran de combat pour "Combattre le monstre"

![Diagramme des cas d'utilisation](http://www.plantuml.com/plantuml/svg/RP1DJWCn34RtEONLVJa2gbJ1efiYE859JITg9WwsWpH2782ZS8vUZ4c3sep4CY_FF_usQYXMnkWYlHaOWuJZO708Gju29wUda38AZf3Hd_18BpP5WlgDwHYf4s98P5CcOB61dKDlBB3ZGaMS-ok7hH3MpayaoYbLzEa0Yf979LXjvVn30YL1lXehG6s5j5073gf1u1bzSsR2IlNvhxUDgDgR5-2WguEx-zkaJkhur-sMoKVQKLbUi2yV4WGoYxLP-qnfiG-FhsWc12CdDMdMOqs-ryxVxoLa4h0v4cMvM0-LpIkubYkirzUzEb8dzk_MkmEjpORIeOpn5m00)

Q6 - Diagramme de classes

![Diagramme de classes](http://www.plantuml.com/plantuml/uml/jLP1Rp8t4BtpAwoSQ5hu0QiAfGAQgYffrAQvL3qupW1klFPcraQj8lxxvnqCNYzUDeh49OIPjy_lZMU6lQijH-jADQhVfAuuyf8fgS7-Nm4pQBTcDAguUECROF-2OnyZneJYTSqMG5yO-rvnBG37tnLCQkj3-v7_0zgLxCcpp3sdi82ojlBTdHxwy0TRAVOhK005ww1IpC97_Hb3i6SvXFW9IuSv46aEnfwv0eTvsPCT9QDJrWEVJ6OvzwVA_C75MIb-SIMNkg1ScddeYI_L6jfnNbMgEGPNvbMkfU0M7DRZhCI___4NrfC9rZmnESd32bQsJs6t9tFpfevdzkuT84h08kIxLoEsCNSLEqJz9KFBib9SG0dQBj-ThEW_yfSs5nHqwH6JQRyXZDR0NGQJJjLb6JHKWreWpjKLLRDEaEgVBMWMIg6B5nKdzwme4ortf4jgUvMMocYDeIZi4R0sMlFDQIW4Ly8fw19_NKayWfJGJkX6ut35-ALnkFL8RIomcxyqi1s1MCKnToStZBTzPXaVZEqSFfr-yfbX597baXc_yOxwJUPxj6Cp9lBUXe5fYboSJz6naIYpChgsUBPUsM63tfiNK58NRMW761Rn43Ho_evYc6yGzYV8ZGQ72xVYAWKISb8PXmAqzJMPRutyx-B4jYPxQ3PY-VfAjm4D21ZIO-k579b3hBrEhZF19t7JwOmjeBKy35euBJHN0fhMGkj8Zue3AprDd24UYUUcVE6qAWaPlauc4Pe4VpKksRQF7AqaOL77UJKksQOochA4u_lZpiZNX2vEoRZPQ3yS5fX7niG1RzmE9P9PJnHa1sCaz5ZN-DrxIcYIE5MjO5NpEJSEkRQGKdazIUIqNVVnZRb2g44tJMOq5Kfw6bnp0Mmfa5ECvFErx-njKuGGgD28BPUQODxH0P--gDAG_BYSfU-czQEfQ_cYe2xORxxO7j1EDm_vF7Z6OwNjSvAXqzAJwF07uvhkZoLZigmKhQWwskaNJpKbNjP7E8s_N1SGLES13DM65KmqdyEK2Jpmf-v9VQzZQZ-wlI5xaQmNHnr8VTKL4QQnJuMWDAs1InVH5XddEynCceYIdn1gWttPdwKEWbcxNDDP6vwQ2OozPe1-096ia3TjfNOnCDXaoIbfwLCbKVtdEpfxSyd1aPJEpkFteplGhwvKtm00)

Q7 - On a deux couches :
* une couche présentation contenant la logique de l'interface graphique. Il s'agit des classes implémentant Ecran.
* une couche contenant la logique lié aux règles du jeu.

La couche (ie les classes) présentation utilise des classes de la couche jeu mais le contraire est vrai. On a donc une séparation fortre des deux couches.

Q8 - Les classes implémentant Ecran sont responsables de l'affichage et de la gestion des différents écrans du jeu.

Les classes du package 'jeu' sont responsables unitairement d'un aspect du jeu.

La classe ValeurCaracteristique sert à gérer les valeurs des différentes caractéristiques mais aussi la notion de bonus / malus.

Q9 - Voir cours

Q11 / Q13 - Chaque classe a sa propre responsabilité. Seule la classe Partie contient plusieurs méthodes ayant des rôles différents mais elle sert de point d'entrée à la couche 'jeu'.

Il est assez facile d'ajouter des types de classes, d'équipements, de monstres sans à avoir à toucher aux algorithmes existants. Chaque élement est contenu dans une énumération propre. On reste donc le principe Open/Closed

Globalement je n'utilise pas l'héritage donc je ne devrais pas avoir de problème à respecter le principe de substitution. Le seul point d'attention à avoir est sur l'implémentation des interfaces mais le code est pensé pour ne pas devoir tester le type des instances.

Je n'ai pas eu besoin d'utiliser le principe d'injection de dépendances. Chaque classe est capable de créer les dépendances dont elle a besoin sans apporter trop de couplage.

Q14 - TODO

Q15 - La classe Partie est la plus fortement couplée. Elle est le point d'entrée et le centre de la couche 'jeu'. Elle sert d'orchestrateur entre autres classes.

Sans lister l'ensemble des classes, elle est couplée fortement à Porte et Personnage car elle possède un attribut de chacun de ces types (la porte courante et le personnage du joueur).
Elle est couplée faiblement par exemple à la classe De car elle devrait créer et utiliser une instance de De pour générer les caractéristiques initiales du personnage.

Q16 - La classe Monstre possède une méthode statique permettant de générer les monstres. Cette méthode est appelée par la classe Porte au moment de la création de la nouvelle porte.

Q17 - Comme mentionner à la response Q11, la classe Partie est le point d'entrée de la couche 'jeu'. Elle est un controlleur GRASP.

Q18 - Pour ajouter des types de monstres, d'équipement, de race ou de classe de personnage, il faut ajouter les instances dans les différentes enumérations et spécifier comment elles impactent les caractéristiques via l'implémentation de la méthode dédiée.

Q19 - Pour ajouter le collier, il faudra ajouter un nouvel emplacement d'équipement et un nouveau type d'équipement. Comme le collier n'influence pas une caractéristique mais possède un effet spécifique, il faudra ajouter une notion d'Effet (via une interface et des implémentations en fonction de l'effet). La notion d'Effet permetta d'ajouter des hooks déclenchées aux différents moments du combat.

