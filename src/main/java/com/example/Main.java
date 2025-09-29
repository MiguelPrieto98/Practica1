package com.example;
import javax.swing.JOptionPane;

import com.example.Clases.Alumno;


public class Main {
 private static Alumno estudiante;

                static String nombreAlumno;
                static String apellidoAlumno;
                static int edadAlumno=0;
        public static void insertarAlumno(){
                String NOMBREALUMNO="Escribe el nombre del alumno\n";
                String APELLIDOALUMNO="Escribe el apellido del alumno\n";
                String EDADALUMNO="Escribe la edad del alumno\n";
              
                nombreAlumno=JOptionPane.showInputDialog(NOMBREALUMNO);
                apellidoAlumno = JOptionPane.showInputDialog(APELLIDOALUMNO);
                edadAlumno=Integer.parseInt(JOptionPane.showInputDialog(EDADALUMNO));
                Alumno  estudiante = new Alumno(nombreAlumno, apellidoAlumno, edadAlumno);
        }

        public static void listarAlumnos(){
                  String  NOMBRE="El nombre del Alumno: ",APELLIDO="El apellido del alumno: ",EDAD="La edad del alumno: ";
                  String ERROR="No hay nigun alumno que listar";
                if (estudiante != null){
                        JOptionPane.showMessageDialog(null, NOMBRE+estudiante.getNombre()+APELLIDO+estudiante.getApellido(),EDAD+estudiante.getEdad(), 0);
                }
                else{
                        JOptionPane.showMessageDialog(null, ERROR);
                }        
                }
        
    public static void main(String[] args) {
        
                final int OPCION_CREAR_ALUMNO = 1;
                final int OPCION_LISTAR_ALUMNO=2;
                final int OPCION_SALIR=3;
            

            int opcion=0;
            while (opcion !=3) { 
            String MENU="""
                    Selecione una opcion
                    1.Insertar Alumno
                    2.Listar alumno
                    3.Salir
                    """;
            String SALIR="has salido";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(MENU));
            switch (opcion) {
                    case OPCION_CREAR_ALUMNO:
                                insertarAlumno();
                    break;
                            case OPCION_LISTAR_ALUMNO:
                                listarAlumnos();
                    break;
                                case OPCION_SALIR:

                        JOptionPane.showMessageDialog(null, SALIR);
                    break;
                default:
                    throw new AssertionError();
            }
    }
}
}