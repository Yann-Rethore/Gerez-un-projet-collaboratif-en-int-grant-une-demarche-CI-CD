# BobApp

Clone project:

> git clone XXXXX

## Front-end 

Go inside folder the front folder:

> cd front

Install dependencies:

> npm install

Launch Front-end:

> npm run start;

### Docker

L'image du front-end est push sur docker hub à chaque merge sur la branche main.
L'image est récupérable à cette adresse :
https://hub.docker.com/repository/docker/yannrethore.
Utilisez Docker Desktop et faite un pull à partir du répertoire frontend. 
Puis lancer le build.

## Back-end

Go inside folder the back folder:

> cd back

Install dependencies:

> mvn clean install

Launch Back-end:

>  mvn spring-boot:run

Launch the tests:

> mvn verify


### Docker

L'image du back-end est push sur docker hub à chaque merge sur la branche main.
L'image est récupérable à cette adresse :
https://hub.docker.com/repository/docker/yannrethore.
Utilisez Docker Desktop et faite un pull à partir du répertoire backend. 
Puis lancer le build. 

## Sonar 

Lien vers le sonar du projet :
https://sonarcloud.io/summary/overall?id=Yann-Rethore_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD&branch=main

#### Qualité du projet

[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=Yann-Rethore_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Yann-Rethore_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=Yann-Rethore_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD&metric=coverage)](https://sonarcloud.io/component_measures?id=Yann-Rethore_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD&metric=coverage)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Yann-Rethore_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD&metric=code_smells)](https://sonarcloud.io/component_measures?id=Yann-Rethore_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD&metric=code_smells)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Yann-Rethore_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD&metric=bugs)](https://sonarcloud.io/component_measures?id=Yann-Rethore_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD&metric=bugs)
[![Sécurité](https://sonarcloud.io/api/project_badges/measure?project=Yann-Rethore_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD&metric=security_rating)](https://sonarcloud.io/component_measures?id=Yann-Rethore_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD&metric=security_rating)



L'indicateur de sécurité n'est pour l'instant pas fiable, aucune sécurité n'est réellement présente dans l'application.


