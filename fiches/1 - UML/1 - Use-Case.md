# Use Cases (Cas d'utilisation)

## Intérêts

* Identifier les fonctionnalités
* Identifier les acteurs
* Identifier qui fait quoi
* Identifier les relations entre les fonctionnalités

## Exemple

```
@startuml exemple
left to right direction
actor "Food Critic" as fc
rectangle Restaurant {
  usecase "Eat Food" as UC1
  usecase "Pay for Food" as UC2
  usecase "Drink" as UC3
}
fc --> UC1
fc --> UC2
fc --> UC3
@enduml
```

![example](http://www.plantuml.com/plantuml/svg/JSp1Yi8m4CRnUvxYe_SUjhqlXUvw5i476AQJ6amJcKn04TzTAa9x--0t_ncAaLfT8YgtSfVb5iL5yGRBq31V35DGOGivEMBBYkQGyuHHWmLkG0MUtNf1QOw2anIZgfGCJmVK8an5qFoJOGq_nNdysTkH7l1Pzzxj_Kz3kdwXTo_d6MtxktxPPhVDtWsIfhh4Dm00)
