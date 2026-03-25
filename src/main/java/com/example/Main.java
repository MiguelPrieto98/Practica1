package com.example;

import javax.swing.JOptionPane;

import com.example.model.Alumno;

public class Main {

    private static Alumno estudiante;
    private static final String NOMBRE_ALUMNO = "Escribe el nombre del alumno\n";
    private static final String APELLIDO_ALUMNO = "Escribe el apellido del alumno\n";
    private static final String EDAD_ALUMNO = "Escribe la edad del alumno\n";

    public static void insertarAlumno() {
        String nombreAlumno = JOptionPane.showInputDialog(NOMBRE_ALUMNO);
        String apellidoAlumno = JOptionPane.showInputDialog(APELLIDO_ALUMNO);

        String edadTexto = JOptionPane.showInputDialog(EDAD_ALUMNO);
        int edadAlumno = Integer.parseInt(edadTexto);

        // AQUÍ ESTABA EL PROBLEMA
        estudiante = new Alumno(nombreAlumno, apellidoAlumno, edadAlumno);
    }

    public static void listarAlumnos() {
        if (estudiante != null) {

            String mensaje = "Nombre: " + estudiante.getNombre() + "\n"
                    + "Apellido: " + estudiante.getApellidos() + "\n"
                    + "Edad: " + estudiante.getEdad();

            JOptionPane.showMessageDialog(null, mensaje, "Datos del alumno", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "No hay ningún alumno que listar");
        }
    }

    public static void main(String[] args) {

        final int OPCION_CREAR_ALUMNO = 1;
        final int OPCION_LISTAR_ALUMNO = 2;
        final int OPCION_SALIR = 3;

        int opcion = 0;

        while (opcion != OPCION_SALIR) {

            String MENU = """
                    Seleccione una opción:
                    1. Insertar Alumno
                    2. Listar alumno
                    3. Salir
                    """;

            String entrada = JOptionPane.showInputDialog(MENU);
            if (entrada == null) {
                break; // usuario canceló
            }
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case OPCION_CREAR_ALUMNO ->
                    insertarAlumno();
                case OPCION_LISTAR_ALUMNO ->
                    listarAlumnos();
                case OPCION_SALIR ->
                    JOptionPane.showMessageDialog(null, "Has salido");
                default ->
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}
