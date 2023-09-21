import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void suma() {
        assertEquals(Main.suma(2, -3.5), -1.5, 0.0001);
        assertEquals(Main.suma(10.33, 999999), 1000009.33, 0.0001);
    }

    @Test
    void resta() {
        assertEquals(Main.resta(-13,0.002), -13.002, 0.0001);
        assertEquals(Main.resta(324.22, 10.22), 314, 0.0001);
    }

    @Test
    void multiplicacion() {
        assertEquals(Main.multiplicacion(-2, 3.205), -6.41, 0.0001);
        assertEquals(Main.multiplicacion(2.2, 3.23), 7.106, 0.0001);
    }

    @Test
    void division() {
        assertEquals(Main.division(10, 0.02), 500, 0.0001);
        double resultado = Main.division(5, 0);
        assertTrue(Double.isInfinite(resultado));
        assertFalse(Double.isNaN(resultado));
    }

    @Test
    void potencia() {
        double resultado = Main.potencia(0.0,0.0);
        assertEquals(1.0, resultado, 0.0001);
        // Ya que es una operacion , se considera que 0^0 es 1 por convencion matematica
        assertEquals(Main.potencia(2, 1.5), 2.8284, 0.0001);
    }

    @Test
    void porcentaje() {
        assertEquals(Main.porcentaje(94,22), 20.68, 0.0001);
        assertEquals(Main.porcentaje(55.4, 35.2), 19.5008, 0.0001);
    }
}