package com.example.Clases;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AlumnoTest {

    @Test
    public void testConstructorAndGetters() {
        Alumno alumno = new Alumno("Miguel", "Prieto", 26);

        assertEquals("Miguel", alumno.getNombre());
        assertEquals("Prieto", alumno.getApellido());
        assertEquals(26, alumno.getEdad());
    }

    @Test
    public void testSetNombre() {
        Alumno alumno = new Alumno("Miguel", "Prieto", 26);
        alumno.setNombre("Luis");

        assertEquals("Luis", alumno.getNombre());
    }

    @Test
    public void testSetApellido() {
        Alumno alumno = new Alumno("Miguel", "Prieto", 26);
        alumno.setApellidos("García");

        assertEquals("García", alumno.getApellido());
    }

    @Test
    public void testSetEdad() {
        Alumno alumno = new Alumno("Miguel", "Prieto", 26);
        alumno.setEdad(30);

        assertEquals(30, alumno.getEdad());
    }
}