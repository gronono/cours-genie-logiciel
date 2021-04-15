# Correction

## Partie 1

### Q1 - Diagramme des cas d'utilisation

![](http://www.plantuml.com/plantuml/svg/dP0nJWCn44Lxds8wI047e4298WfQE86nVpOczingF8vO8Uu3vyZ546m4Ax85IZjFxqdpbzMyMYlPrLtYtgilb1F3XXuaQbkPWDw7dU_mQ4C6AO9vxZ9SniR8X3HrMwEOlaWITcuLJ9JMEO7DkH-1QWiAUdL4TAHqTKkNgsTf1XtnuY-zuupzBtsRz8AKuZdE9DT7elGagLRXCJkv1xyvV50MxXPqFMlG3U75mB7Ekq6Qshdo7ggWU07V_f6OFbs4sGzeUlhrFLSebFfqU0-dIpw0euAo7nlfUyqbEBQIFm40)

L'utilisateur du distributeur est l'acteur 'Client'.
Il peut soit gérer le sucre, soit passer commande, soit interagir avec le monnayeur.

Commander une boisson est générique.
Le processus ne dépend pas du type de boisson (voir diagramme de classe et diagramme de séquence).

### Q2 - Diagramme de classe

![](http://www.plantuml.com/plantuml/svg/TLJDRi964BxxAKQSeCIegTIB5Q4GS2Ea15A2ezwYnHxeDlQkkxj6IH7lqcFx77cnicERPUFc0BQ_-VbcP-RRMssOCbMH1oLBtzWEeP12i0-i51m202uCgYrB4PvBJ8t2EBSFMR2TGCF_h93SZa40aEPCQtZYcEAC6KO6WB2KFDEHpLH_PvmLQ1H6iCqbCnGD5s7X-5ikouAYAchlck2W3JCyFS9i_flt_J9VtAyzP3fV_9fC5klOH-E5xxRb8YE2gLGATIb5neJ1_hd4GGJBqd0fM7v3uDZ6XtkMOwNiIRr3GHYEtV5SenwzHaDOI66OC7EXKU6vNw4sCdsBu96LDTULjH3XKA78558UZlq1OPp25RdsI_i_Q8eHqY0elllTWDmwzYZoqj2COChojCeXHmqb__mdHGsVVqFj29f3ARNccnolQdVDXHJmnFH4Q_nhXiIku_SKgKqqjOmA2C0nmsZKDCOrvTiSS7DpVX-FuN3iPlgMtjlZYM3vXpu5NUmG35cDgluWQae2y2XeYdviS0pEgjb8hhKKS6WtzCu1th9DVebV7vQB-_-1fyjajVRnbtYrYb_ZIH8qMbBy_K9AkahLvx_HYLtcL73BFXSxXHb7OQW0oc-VDXC0F2VJ5NtVB-_YXvX8ryja_d1w9tKSpmDPOOh6j2g7zbos7QtDJS_Hkh1QyrAZlb16rvCIEjJcR2q_M5FlUZGIlKwSDuICQwFufZArg9gYPbzG2CNckKgLAoYi13UepuvS2bqhpj5TGMATBdt6DjHU5XtBawnCtyKEecwmZTsZubkEwh5MVh_fhHNiaFrnoe6A2hLBkPSyipYA7FVOnLDP54nagDeipjRU2Tu5rjeyyRk4ny2_BxmkHb7RGTefOHJ2Zu06VWwSqBq84cXJMDVYRaVFHffp2kp4UVjI3xlJvqQ0mmv-EHxoQ9S7LI9m9ZLTg4UVj5d5d-mgTgcQblKIuMzYoHHmiJifbUXwm3GihYtfbmDPzFIpRztaNGYec7FTb-AmghX5aLL5_Xy0)

La classe `Distributeur` est le point d'entrée du système.
Elle est instanciée lors de l'initialisation du système.
Le client interagit uniquement avec elle.

La classe `Distributeur` gère aussi le niveau de sucre demandé par le client.

Chaque unité de distribution est une instance de la classe `UniteDistribution`.
Il y a une instance par "ingrédients".
On considère que les gobelets et les touillettes sont des ingrédients au même titre que le café, l'eau et le sucre.

Le distributeur peut savoir quelle unité de distribution distribue un ingrédient spécifique via la méthode `findUniteDistribution` et la map `unitesDistributions`.

Concernant la gestion du monnayeur,
il n'est pas précisé comment les pièces analysées
ni comment est stocké le spectre électromagnétique.
On utilise donc des interfaces pour représenter ces deux notions.
L'implémentation sera définie plus tard lorsqu'on aura plus de précision.

Les caractéristiques (poids, diamètre, spectre) de chaque pièce sont définies dans instances de `PieceData`.
Les instances sont directement initialisées lors de la création des pièces.

Pour l'insertion des pièces et le rendu de la monnaie, le distributeur va déléguer le traitement à son instance de `Monnayeur`.

Chaque boisson est associée à une instance de la classe `Recette` initialisée au moment de l'initialisation de l'énumération `Boisson`.

Chaque recette contient une liste de `IngredientRecette` permettant de savoir dans quel ordre et en quel quantité sont distribués les ingrédients.

### Q3 - Diagramme de séquence - Café long

![](http://www.plantuml.com/plantuml/svg/jPBTRjfG3CVlynJUJHKk6Z4kaJQr3G4XTNHgoswdGuwfpfJu81zdKX-fpz4NMnpI54ZNCRHTH3gsV_xmtxa8ObYgieZImY49d7-6YGl2RbK9LZm6Hm4PEVuu74u7qMvCsI-Uo3o-0NO1fIx958-XDhuwp74Cfh4xTZ-i2IstTcIRP-gPCMmyMKE2yKPz4oDc4BKf_IRR6acQBUvx3NO7tmF_gCBeI156nsim-jyIV9ilPiTfeEGx8fWVldxnNPKpneDZiTzokIzBGnOvll8k14z9UZdDlb_VB6RlQlo0KbjYIEQgjlOWBmW5hYK2-Fdyn6xjSYFE4zWAoYsijwb3pqyHaWNDs3aGdFV6QzDwa-nJUfybES6fvtXE3unMjqrcDrVPTNO_64EbqLwL9gTpEazZiAs5l2IS-81nNuPMAMXKkCKSHHHxSVUtu2qJ5TvlNepaDVTrub2N0VYBPVcmGkAwPxSsGDFuaBG-OAY302Vg0e1a8_rC8M1tYYIqQlwy01y-mH3Epc3bdVvSBgX_ctpQJU-MwMrsiDfRlV_LQXT8jYgBNm00)

Étant donné qu'on ne se sait pas comment fonctionne l'analyse de pièces, j'ai noté `inserer(100F)` pour indiquer que le client utilise un pièce qui sera une pièce de valeur 100F.
L'instance d'`AnalyseurPiece` est chargée de déterminer que la pièce correspond à l'instance `Piece.CENT`.

Sur le diagramme, on voit que les gobelets, les touillettes et le sucre ne font pas parties des recettes.
En effet, il y a toujours des gobelets; la touillette est conditionnée au fait que la boisson est sucrée ou pas et le sucre est indépendant de la boisson.

Le diagramme peut être facilement adapté à n'importe quel type de commande.
La logique reste la même.

### Q4 - Critiques

La classe `Distributeur` contient plusieurs méthodes.
Elle contient potentiellement trop de codes et ne respecte pas le principe d'une seule responsabilité par classe.
Par contre elle agit comme controlleur.

L'algorithme de distribution d'une boisson est inclus dans la classe `Distributeur`
et il est assez complexe (3 boucles + 1 if).
Il faudrait peut être ajouter une classe se chargeant de la réelle distribution de la boisson.

Le sucre est aussi gérée directement dans la classe `Distributeur`.
Peut être aurait-il fallut ajouter une classe gérant cet aspect.

Si on sépare la gestion du sucre et l'algorithme de distribution de la classe `Distributeur`,
celle-ci serait moins une GOD class et ferait uniquement de la délagation.
On obtiendrait ainsi une meilleur conception mais au prix d'une complexité plus grande.

Les gobelets et les touillettes ne sont pas réellement des ingrédients.
Pour une meilleur compréhension, il faudrait trouver un meilleur nom.
On peut aussi séparer les vrais ingrédients des consommables et créer une interface commune.

## Partie 2

### Q5 - Ajout du chocolat

Les unités de distributions sont initialisées dans la classe `Distributeur`.
Pour ajouter une unité de distribution, il faut donc modifier cette dernière.

Pour ajouter les boissons 'Chocolat chaud' et 'Cappuccino',
il faut ajouter deux instances dans l'énumération `Boisson`
et initialiser leur recette respective toujours `Boisson`.

### Q6 - Diagramme de séquence - Cappuccino

Le diagramme est globalement identique à celui de la question Q3:
seuls le montant inséré, le nombre de sucre et la boisson commandée diffèrent.

La logique reste la même.

## Partie 3

### Q7 - Nouvelles pièces

Pour gérer les nouvelles pièces,
je pense que le mieux serait de transformer l'énumération `Piece` en une interface
possédant deux implémentations : `AnciennePiece` et `NouvellePiece`.

Cette interface définirait une notion de période de validité.
Lors de l'analyse, il faudrait parcourir l'ensemble des instances de l'interface
pour trouver la pièce correspondante (si elle existe) et vérifier la période de validité.

Voici un diagramme de classe montrant la nouvelle interface:

![](http://www.plantuml.com/plantuml/svg/lP1VQy8m5CNV-odow1Zz0cM8ejqeZEgmYZ26PCrLBkHFbzpu8ltkYuckEjZh2gN9uToUtxaJHzoILp9h9NUEBH5Qc7FYx9InyEITGU4AXfhINI1NG1OAjfU6NqJNGHkrLJgKylmnYXyq47vv2BR-cW0MZO0DboYG8ERaWXFCuTDJmSx7g_IC-YBqMI00k-Sj9COuTmhqX6tFciMwALUxr_0kgt9MhehaUly8hiS3K8W3RqSFgSdDv1wrYDQPiHPSPxJW8MdqiuWmikW8ZURoAOhZ09CGydmyB6pGVbVCG7l5fhf5q1gI3LKdGO4cTrDde9fNsxlxfgfVcZjbLjLlwsdTbFTgMKTRVenzKzi-0TJ67q7A_m4OVbIkjxi_i2QWXLVo6m00)