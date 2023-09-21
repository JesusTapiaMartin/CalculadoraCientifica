import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolucionTest {

    @Test
    public void testEcCuadraticaDiscriminanteNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            Solucion.ecCuadratica(1, 1, 1); // Esta ecuación tiene un discriminante negativo
        });
    }

    @Test
    public void testEcCuadraticaDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            Solucion.ecCuadratica(0, 1, 1); // Esta ecuación tiene una división por cero
        });
    }

    @Test
    public void testSolucionSistemaLinealmenteDependientes() {
        assertThrows(IllegalArgumentException.class, () -> {
            Solucion.solucionSistema(1, 2, 3, 2, 4, 6); // Estas ecuaciones son linealmente dependientes
        });
    }

    @Test
    public void testSolucionSistemaValoresNulos() {
        assertThrows(IllegalArgumentException.class, () -> {
            Solucion.solucionSistema(0, 0, 0, 0, 0, 0); // Estos valores son nulos
        });
    }

    @Test
    public void testEcuacionRectaDivisionPorCero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Solucion.ecuacionRecta(1, 1, 1, 1); // Estos puntos hacen que el denominador sea igual a cero
        });
    }

    @Test
    public void testEcuacionRectaValoresNulos() {
        assertThrows(IllegalArgumentException.class, () -> {
            Solucion.ecuacionRecta(0, 0, 0, 0); // Estos valores son nulos
        });
    }
}
