import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class areasVolumenesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void perimetroCuadrado() {
        //             resultado esperado                     variable a escoger    tolerancia
        assertEquals( 4.0, areasVolumenes.perimetroCuadrado(1.0),    0.001);
        assertEquals(12.0, areasVolumenes.perimetroCuadrado(3.0),    0.001);
        assertEquals(12.0, areasVolumenes.perimetroCuadrado(-3.0),   0.001);

        //con negativo deberia dar error ya que los lados si o si son positivos     (excepcion)
        //con 0 tambien debe dar error ya que no puede existir un lado 0            (excepcion)
    }

    @Test
    void areaCuadrado() {
        //             resultado esperado                  variable a escoger      tolerancia
        assertEquals(1.0, areasVolumenes.areaCuadrado(1.0),         0.001);
        assertEquals(25.0, areasVolumenes.areaCuadrado(-5.0),       0.001);
        assertEquals(0.0, areasVolumenes.areaCuadrado(0.0),         0.001);

        //con negativo deberia dar error ya que los lados si o si son positivos     (excepcion)
        //con 0 tambien debe dar error ya que no puede existir un lado 0            (excepcion)
    }

    @Test
    void perimetroRectangulo() {
        //             resultado esperado                  variable a escoger         tolerancia
        assertEquals(12.0, areasVolumenes.perimetroRectangulo(2.0,4.0),     0.001);
        assertEquals(12.0, areasVolumenes.perimetroRectangulo(-2.0,8.0),    0.001);

        //con negativo deberia dar error ya que los lados si o si son positivos     (excepcion)
        //con 0 tambien debe dar error ya que no puede existir un lado 0            (excepcion)
    }

    @Test
    void areaRectangulo() {
        //             resultado esperado                  variable a escoger         tolerancia
        assertEquals(16.0, areasVolumenes.areaRectangulo(2.0, 8.0),         0.001);
        assertEquals(16.0, areasVolumenes.areaRectangulo(-2.0, -8.0),       0.001);

        //con negativo deberia dar error ya que los lados si o si son positivos     (excepcion)
        //con 0 tambien debe dar error ya que no puede existir un lado 0            (excepcion)
    }

    @Test
    void perimetroCirculo() {
        //             resultado esperado                  variable a escoger               tolerancia
        assertEquals(6.284, areasVolumenes.perimetroCirculo(1.0),           0.001);
        assertEquals(-6.284, areasVolumenes.perimetroCirculo(-1.0),         0.001);

        //con negativo deberia dar error ya que los lados si o si son positivos     (excepcion)
        //con 0 tambien debe dar error ya que no puede existir un lado 0            (excepcion)
    }

    @Test
    void areaCirculo() {
        //             resultado esperado                  variable a escoger               tolerancia
        assertEquals(3.142, areasVolumenes.areaCirculo(1.0),                0.001);
        assertEquals(3.142, areasVolumenes.areaCirculo(-1.0),               0.001);

        //con negativo deberia dar error ya que los lados si o si son positivos     (excepcion)
        //con 0 tambien debe dar error ya que no puede existir un lado 0            (excepcion)
    }

    @Test
    void superficieEsfera() {
        //             resultado esperado                    variable a escoger             tolerancia
        assertEquals(12.566, areasVolumenes.superficieEsfera(1.0),          0.001);
        assertEquals(12.566, areasVolumenes.superficieEsfera(-1.0),         0.001);
        assertEquals(0.0, areasVolumenes.superficieEsfera(0.0),             0.001);

        //con negativo deberia dar error ya que los lados si o si son positivos     (excepcion)
        //con 0 tambien debe dar error ya que no puede existir un lado 0            (excepcion)
    }

    @Test
    void volumenEsfera() {
        //             resultado esperado                    variable a escoger             tolerancia
        assertEquals(84.82300, areasVolumenes.volumenEsfera(3.0),          0.00001);
        assertEquals(0.0, areasVolumenes.volumenEsfera(0.0),               0.00001);

        //con negativo deberia dar error ya que los lados si o si son positivos     (excepcion)
        //con 0 tambien debe dar error ya que no puede existir un lado 0            (excepcion)
    }

    @Test
    void superficieCubo() {
        //             resultado esperado                    variable a escoger            tolerancia
        assertEquals(24.0, areasVolumenes.superficieCubo(2.0),              0.001);
        assertEquals(24.0, areasVolumenes.superficieCubo(-2.0),             0.001);

        //con negativo deberia dar error ya que los lados si o si son positivos     (excepcion)
        //con 0 tambien debe dar error ya que no puede existir un lado 0            (excepcion)
    }

    @Test
    void volumenCubo() {
        //             resultado esperado                  variable a escoger              tolerancia
        assertEquals(8.0, areasVolumenes.volumenCubo(2.0),                  0.001);
        assertEquals(-8.0, areasVolumenes.volumenCubo(-2.0),                0.001);
        assertEquals(0.0, areasVolumenes.volumenCubo(0.0),                  0.001);

        //con negativo deberia dar error ya que los lados si o si son positivos     (excepcion)
        //con 0 tambien debe dar error ya que no puede existir un lado 0            (excepcion)
    }

    @Test
    void superficieCono() {
        //             resultado esperado                  variable a escoger                 tolerancia
        assertEquals(43.982, areasVolumenes.superficieCono(2.0,6.0),    0.001);
        assertEquals(-43.982, areasVolumenes.superficieCono(-2.0,6.0),  0.001);
        assertEquals(0.0, areasVolumenes.superficieCono(0.0,0.0),       0.001);

        //con negativo deberia dar error ya que los lados si o si son positivos     (excepcion)
        //con 0 tambien debe dar error ya que no puede existir un lado 0            (excepcion)
    }

    @Test
    void volumenCono() {
        //             resultado esperado                  variable a escoger                tolerancia
        assertEquals(0.0, areasVolumenes.volumenCono(0.0,0.0),         0.001);

        //con negativo deberia dar error ya que los lados si o si son positivos     (excepcion)
        //con 0 tambien debe dar error ya que no puede existir un lado 0            (excepcion)
    }
}