package com.example.Clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AlumnoTest2 {

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

    @Test
    public void testAlumnoMock() {
        Alumno mockAlumno = Mockito.mock(Alumno.class);

        when(mockAlumno.getNombre()).thenReturn("MockNombre");
        when(mockAlumno.getApellido()).thenReturn("MockApellido");
        when(mockAlumno.getEdad()).thenReturn(99);

        assertEquals("MockNombre", mockAlumno.getNombre());
        assertEquals("MockApellido", mockAlumno.getApellido());
        assertEquals(99, mockAlumno.getEdad());

        verify(mockAlumno).getNombre();
        verify(mockAlumno).getApellido();
        verify(mockAlumno).getEdad();
    }
}

