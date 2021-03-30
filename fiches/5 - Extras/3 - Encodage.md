# Encodage

Un ordinateur ne traite que des nombres. Tout est un nombre même les caractères.

## Tables de caractères

* Associations birectionnelles entre un nombre et un caractère.
* Appelée "Code Page"
* Il existe beaucoup normalisé en fonction des fabriquants systèmes d'exploitations (IBM, Microsoft, ...) et des pays.
* L'information sur quel codage est utilisé n'est pas indiqué dans le fichier !
* Il faut connaitre l'encodage pour pouvoir décoder !

### US-ASCII

* 7 bits 
* Simple mais pas caractères accentués, pas caractères Cyrillic, ....

![](https://fr.wikipedia.org/wiki/Fichier:ASCII-Table-wide.svg)

* Exemple (en hexa) A = 41, É, œ, € n'existent pas, 

### Windows 1252 (ou CP1252)

* Utilisé par défaut sous Windows dans les pays d'Europe de l'Ouest
* Ajout de quelques caractères européens notamment les accents.
* 8 bits
* Compatible avec l'ASCII sauf pour la longeur
* A = 41, É = C9, œ = 9C, € n'existe pas

https://en.wikipedia.org/wiki/Windows-1252#Character_set


Si on lit un fichier encodé avec US-ASCII avec CP1252, on a décalage d'un bit à chaque caractère

### ISO-8859-1

* Aussi appelé "latin-1" (nommage nom officiel)
* Presque identique CP1252 sauf quelques caractères spéciaux
* A = 41, É = C9, œ, € n'exitent pas

https://fr.wikipedia.org/wiki/ISO/CEI_8859-1#ISO/CEI_8859-1_par_rapport_%C3%A0_ISO-8859-1

Si on lit un fichier encodé avec CP1252 avec ISO-8859-1, on a quelques caractères de différents dont certains ne sont pas reconnus.

### ISO-8859-15

* Aussi appelé "latin-9"
* Extension de ISO-8859-1 sauf pour quelques caractères 
* A = 41, É = C9, œ = BD, € = A4

https://fr.wikipedia.org/wiki/ISO/CEI_8859-15

Si on lit un fichier encodé avec ISO-8859-1 avec ISO-8859-15, globalement ça marche sauf pour 8 caractères

## Unicode

* Nouveaux standards
* Tables de caractères + classement des caractères + équivalence (collation)
* collation : symbôles "équivalents" ex : e = é = è = ê = ë
* Plusieurs normes UTF-8, UTF-16, UTF-32

### UTF-8

* Norme la plus utilisée
* Taille variable : codage de 1 à 4 octets
* A = 41, É = C9, œ = c593 (2 octets), € = e282ac (3 octets)
* Plus d'un millions de caractères


#### BOM (Byte Order Mark)

* Caractère spécial qu'on trouve au début du fichier pour indiquer qu'il est encodé en UTF-8 : EF BB BF
* Facultatif : du coup il faut savoir s'il est présent ou non !
* Si on lit le BOM avec ISO-8859-1, on obtient ï»¿

### UTF-16

* Chaque caractère est codé sur 2 ou 4 octets
* L'ordre de lecture des deux octets n'est pas défini
* Utilisation d'un BOM : big endian FE FF ou little endian FF FE

## Quel encodage utilisé ?

* UTF-8 sans BOM
* Les nouveaux formats de fichiers (ex JSON, YAML) imposent l'UTF-8.

## Pb du XML/HTML

* XML et HTML indique à l'intérieur du fichier quel encodage doit être utilisé pour les lire
* XML : &lt;?xml version="1.0" encoding="UTF-8"?&gt;
* HTML : header HTTP "Content-Type: text/html; charset=UTF-8" et/ou "<meta charset="UTF-8">"
* mais attention à ce que l'information soit juste !!

## Diagnostique

* Souvent difficile !
* Si le fichier commence ï»¿ => lecture d'un fichier UTF-8
* Regarder chacun des éléments depuis la source de données (exemple base de données) jusqu'au producteur du fichier (exemple serveur web)
* Essayer d'identifier les caractères spéciaux (souvent les accents, les trémas, les retours à la ligne, ...) 
* En Java: ne jamais utiliser les méthodes qui convertissent un byte [] en String (et vise versa) sans spécifier l'encodage ! (Idem pour les InputStream / OutStream).

