# Use Cases (Cas d'utilisation)

* Plus trop utilisé.
* Remplacé les User Story en gestion de projet Scrum

## Intérêts

* Identifier les fonctionnalités
* Identifier les acteurs
* Identifier qui fait quoi
* Identifier les relations entre les fonctionnalités

## Exemple

![example](http://www.plantuml.com/plantuml/svg/JSp1Yi8m4CRnUvxYe_SUjhqlXUvw5i476AQJ6amJcKn04TzTAa9x--0t_ncAaLfT8YgtSfVb5iL5yGRBq31V35DGOGivEMBBYkQGyuHHWmLkG0MUtNf1QOw2anIZgfGCJmVK8an5qFoJOGq_nNdysTkH7l1Pzzxj_Kz3kdwXTo_d6MtxktxPPhVDtWsIfhh4Dm00)


## Cas d'utilisation / Fonctionnalité

* Intéractions des acteurs avec le système
* S'accompagne d'une description détaillé.


![uc](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuIejJarEB4vLK799pKtCIqbLI4ajLiXFIojABLRYSaZDIm4g0W00)

![description](https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Description_d%27un_cas_d%27utilisation.jpg/297px-Description_d%27un_cas_d%27utilisation.jpg)

## Acteur

* Représente un utilisateur du logiciel
* Peut être un être humain ou un autre logicel
* Très souvent les acteurs sont des rôles/profils des utilisateurs

![actor](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuR9oJCv8BKajBRBYSaZDIm4A0G00)

## Relation acteur / cas d'utilisation

* Trait plein avec pointe de flèche simple vers le cas d'utilisation
* Représente l'interraction entre l'acteur et le cas d'utilisation
* Peut être accompagné de préconditions entre [] sur la flêche

![link](http://www.plantuml.com/plantuml/svg/1S6n3GCX30NGdYb-cHGiG16H8bD4AH1O2Zfidx1zyzzxrRnj3rwflFkVd68NvFp2uoENJe8rT6LkCkY9Wgzh61OPpgqZfXjCnK42S-t7BrMI4Rnk)

## Généralisation des acteurs

* Un acteur peut être un sous-type d'une autre catégorie d'acteurs
* L'acteur enfant possède les mêmes interractions avec les CUs liés à l'acteur parent
* Trait plein avec un point de flèche en triangle vers l'acteur parent

![heritage acteurs](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuR9oJoqkoSpFoqlCB4fLICxFBIX9JCf9jLBGrRLJq0XEp2pEB578IIrMI4jCBYajIYtMnAt5faPNLy7A1rcC2y55c1gMc9EPaWeqLI4fCoSn3o6loUMGcfS2T1O0)

## Généralisation des cas d'utilisation

* Permet de décrire des cas particuliers d'un autre CU.
* Même flèche que la généralisation des acteurs

![heritage CU](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuNBEoKpDAr7GjLFG24ejoInABL98IIrMI2qkEBmYERLO4rc1o-6L1Vd562eqt1A1-XHAyr8LIeeIyueJaqioy_CKaXBpaa4IcWesDRgwKEF9qupJQeVKl1IWBm00)

## Inclusions d'un autre CU

* Permet d'extraire des comportements communs 
* Trait pointillé avec flèche en triangle vers le cas d'utilisation commun avec la mention "includes"

![includes](http://www.plantuml.com/plantuml/svg/VOwn3i8m34JtVCLjq27zW0YXRYniIEnkwqgMN1SbpiR70rCOeADzUkzkA4xPwweXNRYuR6OacJ5jwyDfL4w8yOpZZQI8GxbWeSbhvjBzHqxF696ktx_GpcQzayhCKCOeIjRoBlniHDz_jXpUaBaimXqIn2QjCuST6tQmWMskgxu0)

## Composition des cas d'utilisation

* Permet d'ajouter des fonctionnalités à autre CU
* Trait pointillé avec flèche en triangle vers le cas d'utilisation commun avec la mention "extends"

![extends](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuNBEoKpDAr7GjLFG24ejoInABL98IIrMI2qkEBmYERLOaql3CIUrg0Gih92ZdfbNN9gMbbcSc9US2X8fpiz9ITLKqCEbNS5A8RMY93KlfPZB0KW2RGG0)

## Regroupement des cas d'utilisation

* Rectangle contenant le nom du groupe
* Regroupe les fonctionnalités qui ont un sens en commun

![groupement](http://www.plantuml.com/plantuml/svg/ZT1DYW8n50JWVKvHkvbUp1mW2sbNkku-GKXU910JoNiHGJoGv_1YnXyK51jt8PNw2jApc29r7PLU44l8APbG28x0DaTJWfoE-YKSbbeLicBIAXB6npli5J3bu6-6txdthKk8nDYKx8cPQc6OkeFDxTIfmvDlO-zikxnP0zbIxzRMM2ENz0fyCOF_9em_mL6Iu0Drq0Z9nkg8rITwijHJSkqlpm00)

## Ajouter des notes

* S'applique à l'ensemble des diagrammes
* Boite rectangulaire avec le coin supérieur droit corné
* Lié à un "objet" (acteur ou cas d'utilisation dans le diagramme d'UC)
* Lié à une relation (une flèche)

![notes](http://www.plantuml.com/plantuml/svg/VOwnJKGn38PxJ_6NKB305UYe6809JCvvYkJ44Di82J4GSx0OUG9HNF6wJzRtsJvxy8piIgT7yMWs1hSfk0YycF9iyVrreYabU6mgUFgVueE0emftzxXvg7Mr0XN7oxGgxfBJmVcEOejkwPDes5AUBS8whEBm5w2DeXdGbUGKpjrGnblx4_U80BbIjj-b2nsTNrCYn4d61VjvEY_AhZy0)

## Stéréotype

* S'applique à l'ensemble des diagramme
* Identifie un particularité commune à plusieurs objets
* Doit faire l'objet d'une description pour expliciter quelle est la particularité.

![sterotype](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuR8AhYmkERmYDrKXoCDAmSOcAp_9pauXiLYXA8FBoZsrk2GpFoylCRCe5IIPKPgRc9a7aIzEpi_XAifGqBLJq73CoYyjILKepLCeIqnEB04fr-G2AS0jwv2QbmAq7m00)
