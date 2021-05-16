# Architecture héxagonale

* Observation : le métier et la technique évoluent à des rythmes différents
* But séparer la logique métier de la logique technique

*Règles*
* pas de code technique au coeur de l'héxagone. Uniquement du métier.
* le code métier dépend uniquement du language
* le code métier ne dépend pas du code métier (utilisation de SPI)

![](https://vaadin.com/static/content/learning-center/learn/tutorials/ddd/03__ddd_and_hexagonal/images/hexagonal.png)

*Exemple*

![](http://www.plantuml.com/plantuml/svg/TP5DKWCX48Ntd88B94T89QKkNBZH4xHCHodveQ1ZQQNcxagXp7GFsR1u_NXy_JWMWamNxrG2ym5lg3CMqbTb79IYdx7GNGoKetEOzNLUwKznGbSbOThl3ylyptyVFTXmcY1HY-42loBoThi3lw_c3lkENz1XcwbZsK2Ops1Gdr9orW3P65umVrg3TJvGAqTFwV1RuwDFJjlV0pq66Zbk0r3C_7cUMhULTYM4BUWyA6r09MgNARrM6yvvwVKXaANlrUSnGQOCfatv_oKWU8M2RH5HeYo9cUjI78O1RlphjsTrn31TlFi1)

