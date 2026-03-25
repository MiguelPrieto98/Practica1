package com.example;

import javax.swing.JOptionPane;

import com.example.controller.AlumnoController;

public class Menu {

    public static void main(String[] args) {

        AlumnoController controller = new AlumnoController();

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
                break;
            }

            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case OPCION_CREAR_ALUMNO ->
                    controller.insertarAlumno();
                case OPCION_LISTAR_ALUMNO ->
                    controller.listarAlumno();
                case OPCION_SALIR ->
                    JOptionPane.showMessageDialog(null, "Has salido");
                default ->
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}
