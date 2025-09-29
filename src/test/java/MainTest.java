

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.mockStatic;

import com.example.Main;

public class MainTest {

    static final String NOMBREALUMNO = "Escribe el nombre del alumno\n";
    static final String APELLIDOALUMNO = "Escribe el apellido del alumno\n";
    static final String EDADALUMNO = "Escribe la edad del alumno\n";

    @Test
    public void testInsertarYListarAlumno() {
        try (MockedStatic<JOptionPane> mock = mockStatic(JOptionPane.class)) {
            mock.when(() -> JOptionPane.showInputDialog(NOMBREALUMNO)).thenReturn("Miguel");
            mock.when(() -> JOptionPane.showInputDialog(APELLIDOALUMNO)).thenReturn("Prieto");
            mock.when(() -> JOptionPane.showInputDialog(EDADALUMNO)).thenReturn("26");

            mock.when(() -> JOptionPane.showMessageDialog(null, null, null, 0))
                .thenAnswer(inv -> null);

            Main.insertarAlumno();
            Main.listarAlumnos();
        }
    }
}