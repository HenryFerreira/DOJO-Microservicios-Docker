# DOJO-Microservicios-Docker
# Integrantes: Fernando Quiceno Gomez y Henry Ferreira

# Parte 1
Lo primero que se hizo fue crear los dos Microservicios, Fernando haciendo el Microservicio 2 y Henry haciendo el Microservicio 1.
Se creo un Modelo de Usuario con (Id, Nombre, Celular y Documento de identidad) junto a sus respectivos Controller, Repository y Services.
Se implemento Arquitectura limpia, separando los archivos en Application, Domain, Infraestructure.

# Parte 2
Luego se Dockerizo ambos Microservicios y se los subio a Docker Hub.

# Parte 3
Finalmente nos conectamos mediante Putty a la terminal de AWS, actualizamos los paquetes con "sudo apt update y sudo apt upgrade".
Luego clonamos el repositorio de GIT e instalamos Docker para clonar las imagenes de Docker Hub.
