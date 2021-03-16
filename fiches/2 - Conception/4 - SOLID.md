# Soyons S.O.L.I.D.

* acronyme pour :
- Single-Reponsibility Principle
- Open-closed Principle
- Liskov Substitution Principle
- Interface Segregation Principle
- Dependency Inversion Principle 

## Single Responsibility Principle (SRP)

* Une classe/méthode/variable doit avoir une et une seule responsabilité
* Elle doit faire une et une seule chose
* En pratique une classe doit avoir une et une seule raison d'être modifiée
* Séparer aussi les aspects métiers des aspects techniques

*Ne pas faire*

![](http://www.plantuml.com/plantuml/svg/LOzB2a8n34NdNKM7YhY71tw63dG5fRsy5-Yd9Eb0nBrRuaGdRSu9bqiMqS0wIdOn1n5_qP4eLFKlvu-rbVbIbSZKbLeLamhxHm6tqqpZCVeKqdA2iVE7RuYnsqz8a3zUKS7WAyKDTyZ86bH-DsVgkHMOaa12V9kjXeou1Lx1rcIgXoTuJc-teAPvomS0)

*Mais plutôt*

![](http://www.plantuml.com/plantuml/svg/RPBFQiCm38VlUOeS4zRs0SOeXNKTWpB6SjdL95fhy9yWouCn-kwpWnsKEbTzFqbVv1mS2IIlLTKhuLpzGdwGmb3zLzLROtLrI-3Dk1xbIDAQn0W2vENjTZ_tbrqTu8_i8JO_oAcCqEJufZvPr2BcsaVU5S83k3dFI1lGjpG3AxbvNXXobewU6DmpMwQps-tvlkJz2Suh4iIbdP1EuhkbGkC21X3m9Fihv4xNj67X_PnuebAYYArBBUO7fTjQ_JMw2B8OdPEQ8FWudff5hkNqwzmjQNHV7pkvBL1XNoQIw56EocfWHvrlbz3yW560nVFOZE_P-btptcU119qVfsSqNWFQ-9vM3V4NpdJj_yrieOpGNmLU02VQvCn6MqDHFMP6yGjO8hQEVrQkLGSmWzVg7m00)

## Open-closed Principle

* Ouvert aux extensions
* Fermé aux modifications
* L'ajout de fonctionnalités ne doit modifier le code existant

*Ne pas faire*

```java
class Calculator {
    public double calculate(char operator, double a, double b) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            default: throw new IllegalArgumentException("Operator not suppported: " + operator);
        }
    }
}
```

*Mais*

```java
interface Operator {
    double perform(double a, double b);
}
class AddOperator implements Operator {
    double perform(double a, double b) { return a + b; }
}
class SubstractOperator implements Operator {
    double perform(double a, double b) { return a - b; }
}
class Calculator {
    public double calculate(Operator operator, double a, double b) {
        return operator.perform(a, b);
    }
}
```

# Liskov Substitution Principle (LSP)

Si B est une sous-classe de A, alors on peut utiliser B partout où A est attendu et toujours avoir le même comportement.

*Exemple de non-respect :*

```java
class Rectangle {
    private int width;
    private int height;
    // getter / setter
}
public int calculateArea(Rectangle rect) {
    return rect.getWidth() * rect.getHeight();
}
main(String [] args) {
    Rectangle r = new Rectangle();
    r.setWidth(10):
    r.setHeight(5);
    System.out.println(calculateArea(r)); // Affiche 50
}
class Carre extends Rectangle {
// l'implementation est caché
}
main(String [] args) {
    Rectangle r = new Carre();
    r.setWidth(10):
    r.setHeight(5);
    System.out.println(calculateArea(r)); // Affiche ??
}
```

* Utiliser le type de plus haut niveau dans les paramètres des méthodes
* Utiliser le type de plus haut niveau dans les paramètres de retours
* Ne pas lever des exceptions que le type parent ne lèvent pas.
* Détection : if instanceof pattern.

# Interface Segregation Principle (ISP)

* Les interfaces doivent être découpées par utilisation "cliente".
* Les clients (utilisateurs de l'interface) ne doivent pas dépendre de méthodes qui n'utilisent pas
* Se mettre à la place de celui qui va utiliser l'interface et de celui qui va l'implémenter

*Ne pas faire :*

![](http://www.plantuml.com/plantuml/svg/DSn12W8n38NXVK-HfU8bPk7MGuJsZHQIE3I96_7kLegxxy7ZtpnuHAgKRe6nSmNTdWrAxq9qQPtbTFxfmNRFOzbXRMcWehymnwUKAknEL-oS4YlIzH0eBFnVdSSDrbBb2m00)

*Faire :*

![](http://www.plantuml.com/plantuml/svg/RSun3i8m38NXFQVm2893L8ALGrZfArYodIfnM53lJYa34h2zvVlrXXPSevicyK2TE8CkPOITYZjoI75w9AB3AAox_MlTsAzzNlVoQyowI-OFQ_3npIeov8xDfQpS6fqnSTVOB8dD2eD7-pvm_5zVqh36k-aJ)

# Dependency Inversion Principle (DIP)

* les classes de haut niveau ne devraient pas dépendre directement des classes de bas niveau, mais d’abstractions (interfaces)
* les abstractions ne doivent pas dépendre des détails. Les détails (implémentation) doivent dépendre des abstractions

*Exemple*

![](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLd1Ep4akpKaiIIqj2aciI5Mevb9Gq4u62wOMQUJcvvKavfLOAQJaboRbf6h265orKEqkJcxvfKLvcSN5O0DAAo06f6NcfO1u6iWwqAtIrRN3rC_ba9gN0dGU0000)

CalculateurTaxe va récupérer le taux à appliquer via la classe DBFournisseurTaux (respect du SPR).
Mais violation du DIP : CalculateurTaxe dépend d'une classe de bas niveau (DBFournisseurTaux qui va chercher le taux en base de données)

Il faut rajouter un niveau d'abstraction (interface FournisseurTaux) pour éviter que notre classe de haut niveau (CalculateurTaxe) dépende d'une classe de base niveau.

![](http://www.plantuml.com/plantuml/svg/bOvD2i9038NtSueiMwGNS255nHDuWJXDSJ2JAJC9LCIxIwk2pCvTNdW_NryKirfaLsv19imOWOEGtYU2bFMQd6Si1Gx8tXYLB9zn9dWuW4trR4x9ieHILcrpktZywg7Sn2IAebiOabsOsk_XdYw8KXxH4rGDxvanoB2evZTJ0tNThawx3_jnNzU6E3554Yr_BFOaWqL-0G00)

L'implémentation de FournisseurTaux à utiliser dans CalculateurTaxe est donnée par le constructeur.

```java
interface FournisseurTaux {
    double findTaux();
}
class DBFournisseurTaux implements FournisseurTaux {
    double findTaux() {
        // va chercher en base le taux
    }
}
class CalculateurTaxe {
    private final FournisseurTaux fournisseurTaux;

    public CalculateurTaxe(FournisseurTaux fournisseurTaux) {
        this.fournisseurTaux = fournisseurTaux;
    }

    public double calculer(double montant) {
        return this.fournisseurTaux * montant;
    }
}
```

Voir aussi le design pattern : Dependency Injection.


