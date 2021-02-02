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

![attributs](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLl2jT0RHDgvs2jLSkhcLZYKbHPb9fIMf0KMPPOabgGfM2i50aRnq1Li59O_Kd9ny9Ivb56Nv9Qd99QafG8MUUIMfwQb5N7N8yed9sOdf86DyCejBWDPmQIFBbYRbP2P76yS2vLs0jd7LSZcavgK0dGS0)

### Les méthodes

* syntaxe : \[\<visibilite>] \<nom> ([argument1: type1, argument2: type2] : \<type> \[= \<valeur par défaut>]
* visibilité : + = public, # protected, ~ package, - private

![methodes](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLl2jT0RHDgvs2jLSskcf9NxvkHgQLWh19KMPUUbSkic9EScbEQb5Zkcf6Yc99QakfLxvfKLM2Yv0Db1PPbu9bt9gSOblObPgQH58Or9-VavgOXvNBPT3QbuAq280)

### Attributs & méthodes statiques

* l'attribut ou la méthode est soulignée

![statique](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLl2jT0RJrLpLG9cIpEHQ1MrFl-0GHpzdLokOB5SjbqDgNWfG5m00)

## Relations entre les classes

### Association

* Relation structurelle entre les classes
* Utilisée pour représenter les attributs qui sont des classes
* trait simple si birectionnelle
* trait fléché si unidirectionnelle
* possède une cardinalité (omise = 1). Peut être borné
* peut posséder un nom = nom de l'attribut
* peut être associée à une classe d'association. Le trait de liaison est en pointillé

![associations](http://www.plantuml.com/plantuml/svg/TO-n2i8m54NtznKXanORxEeW1N4N_O9WKmca2UJTDud_RhIn2E9suHmut9vXCsGAT0sMMHsIP5PtQds4XmItKnTa7s_qgCOffz4nEyalBQRfnpX21cyZ_l6pOmcmbQCanf0i2gSvtxPxfRV6TFghLfdkZ6bqKTv6evSQhJvhCxzOAxEag7TnA2-V)

### Aggrégation

* Notion de "composé de"

![aggregation](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLd3BByfDBCdCprEevkAgvOAAkcGMvEJdfWB5u4BE-QL5nH01X1vTNJi59GCzFKCbc1OaIIL3FJqj9OLyNLqe4s86bqDgNWhG0G00)

### Composition

* Aggrégation avec une notion de cycle de vie.
* L'objet ne peut pas vivre sans l'autre
* le losange est plein

![composition](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLWX8BIhEpyjBLQZcughbWWewfXIb5XS3nK12S1LQkdOm6Iw7rBmKe240)

### Héritage

* Flêche en triangle pleine si "extends", pointillé si "implements"

![héritage](http://www.plantuml.com/plantuml/svg/VO_DIaGn34RtVOfmL_xGucnd8IFYLWPyWjfcXa2QIfAA8BwxNCGwW-8wvno-xCop-cWSI1pra0l27jMw2C9xk3wYF_PsSRc59rUIO_W8eN0sWxjdSyt59qtjXR6Xk9qMelJsMzvhFw0P3WLySvHwrfkkPSwak0Nkf_Q3ZqfP_3ztmlTzgAqn4YSVZ7-yKdKTiq8wVkxnbVWSd_ru-os5EMQvIMcpG8oma5XHSjYaTBLyBGWxb3eQVm80)

### Dépendance

* Trait en pointillé. Peut être fléché
* Ne se traduit pas avec un attribut de classe

![dependance](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLd0jAKt9JCmhKQZcqar9B4drIymiBaxCIqwrKd01ShcqanDpaajpKeiSqrCrDAqKClDAk6gve9g1OivWwSII_2A5QbJ5QKNvkK0Ze0OXjC9jrDEpGpM1oo4rBmNeD000)

## Autres notions

* Packaque
* Stéréotype
* Notes

![autres](http://www.plantuml.com/plantuml/svg/POv1QYin44JtEaNj_3yX5p36s93iWWda11rDUI8YjIPI2m9c3fHpv6A95XQ6x9egkjuxL9DYBKMtY7-NcLXOQbObBWu8QYndySJpRGpSpxHJJl_-R_5Y9UZiWDK1FagjEBvMA-9jFErs8yD-Zv2Mo4IrUhExkdL8qDeKH0sNiVbuZVXfrEaFP9XDOZn9g5NKSui7CVO2TrwYRv7bEBDx1pK7TAfc8qgOtmpvF40EJvlkOe5gy3ajHZGD7us9lPw8k17Lxo_sMwzCHvtGDztXzsef_W00)

### Exemple complet

![example](http://www.plantuml.com/plantuml/svg/dL9DRzim3BthLn0v9TbYRDSSYWPkDWpeHv7cDkoWohGdJ9O2YXe63FtlaoF8iJNaqal4q8zyxv6yzIo9Gs-4mPQ17P3kVZ8qcb2nTbQSfFebEuGJadVM8lmL0DeoKYiLmlCq3V2XGtvq_NArXHScRRkOVHFnHndfFUmQGkypU4C1CoubVcjZy4hfgsUIYaT2tPyCzcZP5o8srlMp7W02BfZrPdEJXOX8a0ssZdevM2uS7b25MXeLZ6H7sITw7Zui3-Y3OSdVrp-syEgSGMbNPzOi_5uhj0gBDXFr9S6bz45wHdfFvPrJCIFvFRMr2-JpYhHbpQ5OIaP-cOtiAXXjwE4hoIOl_lvRlN-iz-VuOVTot1_EuTrJVNmwx8upZcToxR2gG81_66tp_oaayHSnSS69Ja1wpvd5vqLXMi2aUyAWzQWxY_2fMY_I90IaDpQeXcG4vd2a56_Z6Mdh5UdJE9NaOi-XqTBoLG_bNQt6QvfD8vzRNezrZ5jeZPESS2DJykE3PaXYavaIaEH6pDGDm3AZFgQw5LHLDR97ksENc2_7Elyx86ukfRVHVkZDFm00)

## TD : Diagramme de classe de Schotten Totten
