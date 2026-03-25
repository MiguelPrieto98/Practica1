package com.example.controller;

import com.example.model.Alumno;
import com.example.view.AlumnoVista;

public class AlumnoController {

    private Alumno alumno;
    private AlumnoVista vista = new AlumnoVista();

    public void insertarAlumno() {

        String nombre = vista.pedirDato("Escribe el nombre del alumno:");
        if (nombre == null) {
            return;
        }

        String apellidos = vista.pedirDato("Escribe el apellido del alumno:");
        if (apellidos == null) {
            return;
        }

        String edadTexto = vista.pedirDato("Escribe la edad del alumno:");
        if (edadTexto == null) {
            return;
        }

        int edad = Integer.parseInt(edadTexto);

        alumno = new Alumno(nombre, apellidos, edad);
    }

    public void listarAlumno() {
        if (alumno == null) {
            vista.mostrarMensaje("No hay ningún alumno que listar");
            return;
        }

        vista.mostrarAlumno(alumno.getNombre(), alumno.getApellidos(), alumno.getEdad());
    }
}
