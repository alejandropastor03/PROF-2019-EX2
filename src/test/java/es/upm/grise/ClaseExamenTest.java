package es.upm.grise;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ClaseExamenTest {

    @Test
    public void test6() throws EntradaInvalida {
        List<Integer> esperado = Arrays.asList(2, 3);
        assertEquals(esperado, ClaseExamen.primos(6));
    }

    @Test
    public void test13() throws EntradaInvalida {
        List<Integer> esperado = Arrays.asList(13);
        assertEquals(esperado, ClaseExamen.primos(13));
    }

    @Test
    public void test15() throws EntradaInvalida {
        List<Integer> esperado = Arrays.asList(3, 5);
        assertEquals(esperado, ClaseExamen.primos(15));
    }

    @Test
    public void test25() throws EntradaInvalida {
        List<Integer> esperado = Arrays.asList(5, 5);
        assertEquals(esperado, ClaseExamen.primos(25));
    }

    @Test
    public void testEntradaInvalida() {
        assertThrows(EntradaInvalida.class, () -> {
            ClaseExamen.primos(1);
        });
    }
}
