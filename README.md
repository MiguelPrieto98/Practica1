# Ejercicio de Pruebas de Miguel Ángel

Este proyecto comenzó como un ejercicio sencillo para crear un objeto Alumno y un programa principal que permitiera insertarlo y mostrarlo mediante cuadros de diálogo. La parte más sencilla fue crear el objeto Alumno y el main. La parte de pruebas y el mock me costó instalarlo y configurarlo, y diseñar las pruebas también llevó tiempo. Al principio estaba haciendo pruebas de lo que no era y más adelante ya eran las pruebas correctas.

A continuación se describen el estado inicial del código, los problemas detectados, las mejoras aplicadas y el paso intermedio antes de implementar MVC.

---

## Estado inicial del código

El proyecto comenzó con:

- Una clase Alumno con atributos básicos.
- Un método main que contenía toda la lógica del programa.
- Métodos insertarAlumno y listarAlumnos dentro del main.
- Uso de JOptionPane para pedir y mostrar datos.
- Sin validación de entradas.
- Sin separación de responsabilidades.
- Sin pruebas unitarias.
- Sin DAO.
- Sin Mockito.

### Problemas detectados

- El método insertarAlumno no creaba realmente el objeto Alumno.
- El método listarAlumnos usaba incorrectamente showMessageDialog, colocando la edad como título.
- El menú se generaba en cada iteración del bucle.
- No había manejo de cancelación en los diálogos, lo que provocaba errores.
- No existía ninguna estructura de pruebas.
- Se creó un test llamado AlumnoTest2 que mockeaba un POJO, lo cual no tenía sentido.

---

## Mejoras aplicadas al código

Se realizaron varias mejoras manteniendo la estructura original del proyecto:

- Corrección del método insertarAlumno para que realmente cree el objeto Alumno.
- Corrección del método listarAlumnos para mostrar los datos correctamente.
- Manejo de cancelación en los diálogos para evitar errores.
- Limpieza del menú, convirtiéndolo en una constante.
- Eliminación de código innecesario, incluyendo AlumnoTest2.
- Preparación del proyecto para una futura implementación del patrón MVC.
- Reorganización del código para hacerlo más claro y estable.

---

## Pruebas unitarias

Se añadieron pruebas unitarias para el modelo Alumno:

- Pruebas del constructor.
- Pruebas de getters.
- Pruebas de setters.

Estas pruebas se realizaron sin mocks, ya que Alumno es un POJO y no necesita ser simulado.

---

## Simulación del DAO con Mockito

Se añadió una clase AlumnosDao que simula acceso a base de datos mediante una excepción.  
Para esta clase sí se utilizaron mocks, ya que es el caso correcto para usar Mockito.

Se añadieron pruebas para:

- Simular una inserción correcta.
- Simular una excepción de base de datos.

Estas pruebas verifican el comportamiento esperado del DAO sin necesidad de una base de datos real.

---

## Herramientas utilizadas

- Visual Studio Code
- GitHub
- JUnit 5
- Mockito
- Copilot para asistencia en la configuración de Mockito y detección de errores

---

## Estado final antes de implementar MVC

El proyecto queda en un punto estable:

- Código funcional.
- Lógica corregida.
- Pruebas unitarias del modelo.
- Pruebas del DAO con Mockito.
- Código limpio y preparado para separar en Modelo, Vista y Controlador.

Este estado sirve como punto de control antes de aplicar el patrón MVC.
