# TALLER 1: APLICACIONES DISTRIBUIDAS
Se construye una aplicación que consulta el api gratuito de https://www.omdbapi.com/, un api sobre películas. La aplicación recibe como parámetro el título de la película y mostrara por pantalla los datos correspondientes en formato JSON.

---
### Prerrequisitos
Para elaborar este proyecto requerimos de las siguientes tecnologias:

 - **[Maven](https://openwebinars.net/blog/que-es-apache-maven/)**: Apache Maven es una herramienta que estandariza la configuración de un proyecto en todo su ciclo de vida.
 - **[Git](https://learn.microsoft.com/es-es/devops/develop/git/what-is-git)**: Es un sistema de control de versiones distribuido (VCS).

---
###  Instalación
Primero clonamos el repositorio

     git clone https://github.com/jorge-stack/Taller_01.git
    
Se accede al repositorio que acabamos de clonar

	 cd Taller_01

Hacemos la construccion del proyecto

	 mvn package
---
### Corriendo
Primero corremos los siguientes comando
	
	 mvn clean package install
	 mvn clean install

Ahora corremos el servidor
	
**Windows**

	 mvn exec:java -"Dexec.mainClass"="org.myorg.HttpServer"

**Linux/MacOs**

	 mvn exec:java -Dexec.mainClass="org.myorg.HttpServer"

Por ultimo accedemos a Firefox con la siguiente URL

	 https://localhost:32000/

Aqui nos debera de cargar la siguiente pagina, con la cual podemos empezar a hacer las busquedas que necesitemos

![Page](https://i.imgur.com/OP1tDqd.png)

---
### Corriendo test

Ejecutamos el comando

	mvn Test
	
---
## Construido con

* [Maven](https://maven.apache.org/): Apache Maven es una herramienta que estandariza la configuración de un proyecto en todo su ciclo de vida.
* [Git](https://rometools.github.io/rome/):  Es un sistema de control de versiones distribuido (VCS).
* [IntelliJ](https://www.jetbrains.com/idea/): Es un entorno de desarrollo integrado para el desarrollo de programas informáticos.
* [Java 19](https://www.java.com/es/): Lenguaje de programación de propósito general, es decir, que sirve para muchas cosas, para web, servidores, aplicaciones móviles, entre otros. Java también es un lenguaje orientado a objetos, y con un fuerte tipado de variables.
* [Html](https://developer.mozilla.org/es/docs/Learn/Getting_started_with_the_web/HTML_basics): Es el código que se utiliza para estructurar y desplegar una página web y sus contenidos.
* [JavaScript](https://developer.mozilla.org/es/docs/Learn/JavaScript/First_steps/What_is_JavaScript):JavaScript es un lenguaje de programación o de secuencias de comandos que te permite implementar funciones complejas en páginas web

## Autor
* **[Jorge David Saenz Diaz](https://co.linkedin.com/in/jorgedsaenzd/en)**  - [Jorge-Stack](https://github.com/jorge-stack?tab=repositories)

## Licencia
**©** Jorge David Saenz Diaz, Estudiante de Ingeniería de Sistemas de la Escuela Colombiana de Ingeniería Julio Garavito.
