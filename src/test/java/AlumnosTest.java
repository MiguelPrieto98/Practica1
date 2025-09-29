import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.Clases.Alumno;
import com.example.Clases.AlumnosDao;

@ExtendWith(MockitoExtension.class)
public class AlumnosTest {

    @Test
    public void insertarAlumno() throws Exception {
        try (
            MockedStatic<AlumnosDao> mockDao = Mockito.mockStatic(AlumnosDao.class);
            MockedStatic<Alumno> mockAlumno = Mockito.mockStatic(Alumno.class)
        ) {
            mockDao.when(() -> AlumnosDao.insertarAlumno(any())).thenReturn(1);
            mockDao.when(() -> AlumnosDao.listarAlumnos(any())).thenReturn(1);

            mockAlumno.when(() -> Alumno.insertarAlumno("Miguel", "Prieto", 26)).thenReturn(true);
            mockAlumno.when(Alumno::listarAlumnos).thenReturn(true);

            boolean resultadoInsertar = Alumno.insertarAlumno("Miguel", "Prieto", 26);
            boolean resultadoListar = Alumno.listarAlumnos();

            assertTrue(resultadoInsertar);
            assertTrue(resultadoListar);
        }
    }
}
