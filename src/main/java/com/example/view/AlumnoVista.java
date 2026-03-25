package com.example.view;

import javax.swing.JOptionPane;

public class AlumnoVista {

    public String pedirDato(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void mostrarAlumno(String nombre, String apellidos, int edad) {
        String msg = """
                Nombre: %s
                Apellido: %s
                Edad: %d
                """.formatted(nombre, apellidos, edad);

        JOptionPane.showMessageDialog(null, msg, "Datos del alumno", JOptionPane.INFORMATION_MESSAGE);
    }
}
