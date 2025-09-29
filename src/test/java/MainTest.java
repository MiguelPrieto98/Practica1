

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.mockStatic;

import com.example.Main;

public class MainTest {

    @Test
    public void testInsertarYListarAlumno() {
        try (MockedStatic<JOptionPane> mock = mockStatic(JOptionPane.class)) {
            // Simular inputs del usuario
            mock.when(() -> JOptionPane.showInputDialog("Escribe el nombre del alumno\n"))
                .thenReturn("Miguel");
            mock.when(() -> JOptionPane.showInputDialog("Escribe el apellido del alumno\n"))
                .thenReturn("Prieto");
            mock.when(() -> JOptionPane.showInputDialog("Escribe la edad del alumno\n"))
                .thenReturn("26");

            // Simular salida del listado
            mock.when(() -> JOptionPane.showMessageDialog(null, "El nombre del Alumno: MiguelEl apellido del alumno: Prieto", "La edad del alumno: 26", 0))
                .thenAnswer(invocation -> null);

            // Ejecutar métodos reales
            Main.insertarAlumno();
            Main.listarAlumnos();
        }
    }
}