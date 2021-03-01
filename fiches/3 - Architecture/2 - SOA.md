# Service Oriented Architecture, Web Oriented Architecture, Microservices

* SOA = Service Oriented Architecture
* WOA = Web Oriented Architecture

## SOA

* Découpage en services cohérents 
* Chaque service est responsable d'une partie du métier
* Communication entre les services via des "Web-Services" (souvent du SOAP)
* Permet de changer "facilement" l'implémentation des services
* Chaque service peut être gérer par des équipes différentes
* Chaque service peut avoir des cycles de développement indépendant
* Chaque service peut avoir des technologies / architecture différentes
* Très souvent accompagné d'un bus
* Très souvent implémenté via une solution "usine à gaz" propriétaire
* Remplacer par WOA

## WOA

* Évolution du SOA
* Communication inter-services via REST
* Services sont stateless (pas de session HTTP)
* Pas d'usine à gaz fournis par de gros éditeurs (Oracle, IBM, ...)
* Importance des APIs

!(soa_vs_woa)[https://blog.octo.com/wp-content/uploads/2017/01/soa_woa-1.png]

# Microservices

* Nom marketing du WOA

!(microservice)[https://images1.programmersought.com/118/5d/5d5532f71cdcbfd2134d2e1671a1552e.JPEG]
