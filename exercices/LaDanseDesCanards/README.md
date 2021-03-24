# La Danse des Canards

## Énoncé

### Partie 1: 

Considérons les espèces de canards suivantes : les canards colverts et les canards fuligules à tête rouge.

Un canard possède un nom d'espèce et peut cancaner, nager et voler.

Les colverts et les fuligules cancanent avec le cri "coin-coin".

Ils nagent en palmant et volent en battant des ailes.

Coder la / les classes modélisant les canards.

Vous pouvez utiliser la classe suivante pour tester votre code ou une autre.

L'important est d'appeler l'ensemble des méthodes : cancaner, nager, voler et afficher.

Au fur et à mesure de l'exercice vous serez peut être amener à modifier cette classe.
Ce n'est pas parce qu'elle est fournie qu'il faut obligatoirement l'utiliser ou ne pas la toucher.

Par contre les sorties fournies est ce que doit absolument afficher le programme.

```java
public class LaDanseDesCanards {
  public static void main(String [] args) {
    List<Canard> canards = new ArrayList<>();
    // TODO ajouter à la liste des canards un canard de chaque espèce.
   
    for (Canard canard : canards) {
      System.out.println("Je suis un canard " + canard.getEspece() + " :");
      canard.cancaner();
      canard.nager();
      canard.voler();
      System.out.println("-------");
    }
  }
}
```

Le programme doit produire : 

```
Je suis un canard colvert :
coin-coin
je palme
je bat des ailes
-------
je suis un canard fuligule :
coin-coin
je palme
je bat des ailes
-------
```

### Partie 2:

Une nouvelle espèce de canard fait son apparition : le canard en plastique.
Il ne sait pas voler et il ne fait pas le même bruit ("pouic-pouic") qu'un canard "classique".

Faire évoluer le code
Ajouter le canard en plastique dans la méthode main

La sortie du programme pour le canard en plastique doit être:

```
Je suis un canard en plastique :
pouik-pouik
je flotte
-------
```

### Partie 3

Un ami chasseur m'a montré un canard en bois : un leurre
Il ne peut pas voler, ni cancaner

Faire évoluer le code
Ajouter le leurre dans la méthode main

La sortie du programme pour le leurre doit être:

```
Je suis un canard en bois :
je flotte
-------
```

### Partie 4
Ajout une méthode permettant de blesser un canard (de n'importe quel type; oui on peut blesser les canards en plastique et les leurres).
Un canard blessé ne peut plus voler, et devient silencieux.

La sortie du programme pour un canard colvert blessé doit être

```
Je suis un canard colvert blessé :
je palme
-------
```
