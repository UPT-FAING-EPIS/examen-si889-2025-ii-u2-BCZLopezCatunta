import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    private Calculadora calculadora = new Calculadora();
    
    @Test
    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
        assertEquals(0, calculadora.sumar(-2, 2));
    }
    
    @Test
    public void testRestar() {
        assertEquals(1, calculadora.restar(3, 2));
        assertEquals(-5, calculadora.restar(0, 5));
    }
    
    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(0, calculadora.multiplicar(5, 0));
    }
    
    @Test
    public void testDividir() {
        assertEquals(2.0, calculadora.dividir(6, 3), 0.001);
        assertEquals(2.5, calculadora.dividir(5, 2), 0.001);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDividirPorCero() {
        calculadora.dividir(5, 0);
    }
    
    @Test
    public void testEsPar() {
        assertTrue(calculadora.esPar(2));
        assertTrue(calculadora.esPar(0));
        assertFalse(calculadora.esPar(3));
        assertFalse(calculadora.esPar(-1));
    }
}