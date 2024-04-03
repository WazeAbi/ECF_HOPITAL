# ECF_HOPITAL 🏥

# Application de Gestion des Séjours des Patients 👀

Ce projet consiste au développement d'une application de gestion des séjours des patients dans un établissement de santé. L'application permet de gérer l'admission, le suivi et la sortie des patients, ainsi que l'allocation des lits dans les chambres.

## Fonctionnalités principales 🚀

L'application offre les fonctionnalités suivantes :

- Ajout et modification des informations des patients.
- Enregistrement de l'arrivée et de la sortie des patients dans les différents services.
- Allocation et libération des lits dans les chambres.
- Affichage des patients affectés à un service donné.
- Affichage des lits actuellement libres.

## Outils utilisés 🛠️

- **Organisation du travail** : Trello pour la gestion des tâches, Git pour le versionnage du code.
- **Conception MERISE** : Modélisation des données.
- **Conception UML** : Diagrammes de cas d'utilisation et de classes et Séquence.
- **Base de données** : PostgreSQL.
- **Développement Back-end** : Java SpringBoot.
- **Tests** :tests unitaires.
- **Architecture Multi-couches** : Séparation claire entre les couches de présentation, logique métier et accès aux données.
- **Environnement Docker** : Utilisation de Docker pour la gestion de l'environnement de développement et de déploiement.

## Installation

### 1. Clonez le dépôt depuis GitHub 🧑🏻‍💻  : 
````bash
https://github.com/WazeAbi/ECF_HOPITAL.git
````
### 2. Lancez le Docker Compose 🐳 :
````bash
docker compose up
````
### 3. Connectez vous à la base de données 🛜 :
- POSTGRES_USER = user
- POSTGRES_PASSWORD = pwd
- POSTGRES_DB = db

### 4. Lancez l'application 🏁

### 5. Lancez ce Script ⬇ :
````postgresql
INSERT INTO service (nomdeservice) VALUES ('Service dentaire');
INSERT INTO service (nomdeservice) VALUES ('Urgence');
INSERT INTO service (nomdeservice) VALUES ('Service de cardiologie');
INSERT INTO chambre (numerodechambre, idservice) VALUES (101, 1);
INSERT INTO chambre (numerodechambre, idservice) VALUES (102, 2);
INSERT INTO chambre (numerodechambre, idservice) VALUES (103, 2);
INSERT INTO lit (occupe, idchambre) VALUES (false, 1);
INSERT INTO lit (occupe, idchambre) VALUES (true, 2);
INSERT INTO lit (occupe, idchambre) VALUES (true, 3);
INSERT INTO patient (nom, prenom, numsecuritesocial,idlit) VALUES ('Doe', 'John', 123456789,null);
INSERT INTO patient (nom, prenom, numsecuritesocial,idlit) VALUES ('Smith', 'Alice', 987654321,3);
INSERT INTO patient (nom, prenom, numsecuritesocial,idlit) VALUES ('Johnson', 'Bob', 456789123,2); 
````

## Les Requêtes Sql ⚙️ :

### Afficher les noms et prénoms de tous les patients affectés au service "Urgences" :

````postgresql
SELECT p.nom, p.prenom
FROM patient p
JOIN lit l ON p.idlit = l.id_lit
JOIN chambre c ON l.idchambre = c.idchambre
JOIN service s ON c.idservice = s.idservice
WHERE s.nomdeservice = 'Urgence’;
````

### Afficher tous les lits actuellements libre :
````postgresql
select * from lit where occupe =false ;
````
