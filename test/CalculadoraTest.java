

import holamundo.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;



public class CalculadoraTest {

    @Test
    public void testSumarVariosNumeros() {
        Calculadora calc = new Calculadora();
        double resultado = calc.sumar(1, 2, 3, 4, 5); // 1 + 2 + 3 + 4 + 5 = 15
        assertEquals(15.0, resultado, 0.001); 
    }

    @Test
    public void testRestarVariosNumeros() {
        Calculadora calc = new Calculadora();
        double resultado = calc.restar(10, 3, 2); // 10 - 3 - 2 = 5
        assertEquals(5.0, resultado, 0.001); // Verificar resultado
    }

    @Test
    public void testMultiplicarVariosNumeros() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicar(1, 2, 3, 4); // 1 * 2 * 3 * 4 = 24
        assertEquals(24.0, resultado, 0.001); 
    }

    @Test
    public void testDividirVariosNumeros() {
        Calculadora calc = new Calculadora();
        double resultado = calc.dividir(100, 2, 2.5); // 100 / 2 / 2.5 = 20
        assertEquals(20.0, resultado, 0.001); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRestarSinNumeros() {
        Calculadora calc = new Calculadora();
        calc.restar(); // Debería lanzar excepción por falta de operandos
    }

    @Test
    public void testMultiplicacionPorCero() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicar(10, 0); // 10 * 0 = 0
        assertEquals(0.0, resultado, 0.001);
    }
    @Test
    public void testSumarNumerosNegativos() {
        Calculadora calc = new Calculadora();
        double resultado = calc.sumar(-5, -10, -3); // -5 -10 -3 = -18
        assertEquals(-18.0, resultado, 0.001); 
    }

    @Test
    public void testRestaConResultadoNegativo() {
        Calculadora calc = new Calculadora();
        double resultado = calc.restar(10, 20); // 10 - 20 = -10
        assertEquals(-10.0, resultado, 0.001); 
    }

    @Test
    public void testMultiplicarNumerosNegativos() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicar(-2, -3, -4); // -2 * -3 * -4 = -24
        assertEquals(-24.0, resultado, 0.001); 
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirPorCero() {
        Calculadora calc = new Calculadora();
        calc.dividir(10, 0); // División por cero, debe lanzar ArithmeticException
    }

    @Test
    public void testDividirNumerosNegativos() {
        Calculadora calc = new Calculadora();
        double resultado = calc.dividir(-100, -2); // -100 / -2 = 50
        assertEquals(50.0, resultado, 0.001); 
    }

   

    @Test
    public void testSumaMultiplicacionJuntos() {
        Calculadora calc = new Calculadora();
        double resultado = calc.sumar(10, calc.multiplicar(3, 4)); // 10 + (3 * 4) = 22
        assertEquals(22.0, resultado, 0.001); 
    }

    @Test
    public void testSumaConDivision() {
        Calculadora calc = new Calculadora();
        double resultado = calc.sumar(10, calc.dividir(50, 2)); // 10 + (50 / 2) = 35
        assertEquals(35.0, resultado, 0.001); 
    }

    @Test
    public void testRestarConMultiplicacion() {
        Calculadora calc = new Calculadora();
        double resultado = calc.restar(100, calc.multiplicar(3, 4)); // 100 - (3 * 4) = 88
        assertEquals(88.0, resultado, 0.001); 
    }

    
}