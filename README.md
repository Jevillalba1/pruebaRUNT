# Repositorio Prueba Técnica - vacante desarrollador Junior RUNT

## Paquete Back

En esta carpeta de archivos se encuentra el desarrollo de la parte requerida para el backend, el IDE de desarrollo utilizado para el desarrollo fue [Eclipse](https://www.eclipse.org/).
El proyecto fue realizado bajo el Framework de Spring Boot, está desarrollado bajo la arquitectura de MVC. Para la creación de los modelos de la base de datos se utilizó
el framework JPA y el administrador de base de datos utilizado es H2. Se publicaron únicamente dos servicios los cuales permiten obtener todos los profesores y el segundo
que consulta las asignaturas que tiene el profesor seleccionado. Adicionalmente se implementa el patrón DTO para lograr dar solución a un inconveniente presentado al momento de
trabajar directamente en el modelo el cual era que la respuesta obtenida quedaba en un bucle infinito debido al modelo relacional, logrando así crear una estructura de datos independiente
del modelo.

## Paquete Front

En esta carpeta de archivos se encuentra el desarrollo de la parte requerida para el front, el proyecto fue realizado bajo el framework de [Angular](https://angular.io/)
en ese caso la versión 11.1.2. Se crea un nuevo proyecto con la ayuda del [CLI](https://github.com/angular/angular-cli) de angular, se crean sus respectivas rutas en este caso dos la de profesor
y el detalle de profesor, en el cual se visualizan las materias que tiene asignadas como sus respectivos estudiantes. Se crean dos servicios los cuales permiten obtener todos los
profesores y sus respectivos detalles.

Para poder ejecutar el proyecto únicamente se debe correr inicialmente el comando `npm install` para descargar las respectivas dependencias, una vez instaladas las dependencia se
corre con el comando `ng serve`, paso seguido navegar hacia `http://localhost:4200/`.

## Desarrollo

Proyecto realizado por Julian Esteban Villalba - Desarrollador Junior
