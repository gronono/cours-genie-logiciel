# Loi de Déméter

* Law of Demeter (LoD)
* Loi de la connaissance minimale
* Un objet ne connaitre que ses voisins
* On ne parle pas à des inconnus

*Ne pas faire *

![](http://www.plantuml.com/plantuml/svg/DOwn3W8n241tleBnBkQ-mCISkuE3Fz2qU3Qfa036mVZlNXjSUUy1gtbIVpqRDBexkg3MxU5OgbBsAWov9JEyafemVk2maPzBKJARPlW6ZadmcxnvceyxZMnPJdybWgw4VP6S-gMnBgnHT0TMuhA_zmC0)

```
person.getAddress().getTown().getLocation()
```

*Faire*

![](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuSf9JIjHACbNACfCpoXHICaiIaqkoSpFuqhEIImkLWX8BIhEprEevj9EJornJ4afIYqkrj04ytpoanD1Ae7SMgXgg0Aeyf3yyZniQg5cwkhQmJH0jOCqA5HZQe2g0ka0g-5oICrB0ReT0000)

```
person.getLocation() 
```
![](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEoKpDAr7GrRLJ24WjAixFKx1II4yjySbFJYp9pC_JqEI228DLEAQa5AKM5sCeWOa3bOJabsCQuP2QbmAq3000)

