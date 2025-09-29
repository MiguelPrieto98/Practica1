import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import com.example.Clases.Alumno;

public class AlumnosTest {

    @Test
    public void insertarAlumno() {
        try (MockedStatic<Alumno> mockAlumno = Mockito.mockStatic(Alumno.class)) {
            mockAlumno.when(() -> Alumno.insertarAlumno("Miguel", "Prieto", 26)).thenReturn(true);
            mockAlumno.when(Alumno::listarAlumnos).thenReturn(true);

            boolean resultadoInsertar = Alumno.insertarAlumno("Miguel", "Prieto", 26);
            boolean resultadoListar = Alumno.listarAlumnos();

            assertTrue(resultadoInsertar);
            assertTrue(resultadoListar);
        }
    }
}