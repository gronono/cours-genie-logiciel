# D.R.Y.

* Don't Repeat Yourself
* Évitez la duplication de code
* S'applique au code mais aussi aux algos
* Ne pas réinventer la route : utiliser des librairies
* Technique pour éviter la répition:
- Héritage
- Délégation
- methodes "utilitaires"

## Héritage vs Délégation

![](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuIf8JCvEJ4zLo4WjoYm1CQgv51IISnABYnK2yZFpIWp10Wgw5M2o4aHgfwUMH6XemfYHO6OjN9jpPb5oJggXGcf5IMfU2fenHOafcQN5CAr1O9w69XvJQxdWJan9pKbDJop9pCz3TwGHcOuqmkigQvY0SsfUIMgHXgOLr3PhY55mGtHrxQ0oGESw03qD35W0)

* Préférer la délagation à l'héritage
* Utiliser l'héritage que lorsque la sous-classe est réellement un sous-type
* Est-ce qu'un cercle est un point ? Si franchement oui => héritage, sinon délégation
