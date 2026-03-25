package com.example.view;

import javax.swing.JOptionPane;

public class AlumnoVista {

    public static final String DATOS_ALUMNO = "Datos del alumno";
    public static final String MSG = """
                Nombre: %s
                Apellido: %s
                Edad: %d
            """;

    public String pedirDato(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void mostrarAlumno(String nombre, String apellidos, int edad) {
        String msg = MSG.formatted(nombre, apellidos, edad);

        JOptionPane.showMessageDialog(null, msg, DATOS_ALUMNO, JOptionPane.INFORMATION_MESSAGE);
    }
}
