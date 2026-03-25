package com.example.controller;

import com.example.model.Alumno;
import com.example.view.AlumnoVista;

public class AlumnoController {

    public static final String NOMBRE_ALUMNO = "Escribe el nombre del alumno";
    public static final String APELLIDO_ALMNO = "Escribe el apellido del alumno";
    public static final String EDAD_ALUMNO = "Escribe la edad del alumno";
    public static final String LISTA_VACIA = "No hay alumno que listar";

    private Alumno alumno;
    private final AlumnoVista vista = new AlumnoVista();

    public void insertarAlumno() {

        String nombre = vista.pedirDato(NOMBRE_ALUMNO);
        if (nombre == null) {
            return;
        }

        String apellidos = vista.pedirDato(APELLIDO_ALMNO);
        if (apellidos == null) {
            return;
        }

        String edadTexto = vista.pedirDato(EDAD_ALUMNO);
        if (edadTexto == null) {
            return;
        }

        int edad = Integer.parseInt(edadTexto);

        alumno = new Alumno(nombre, apellidos, edad);
    }

    public void listarAlumno() {
        if (alumno == null) {
            vista.mostrarMensaje(LISTA_VACIA);
            return;
        }

        vista.mostrarAlumno(alumno.getNombre(), alumno.getApellidos(), alumno.getEdad());
    }
}
