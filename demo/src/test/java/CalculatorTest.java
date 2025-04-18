
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.Calculatrice;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculatrice calc;

    @BeforeEach
    void setUp() {
        calc = new Calculatrice();
    }

    @Test
    void testAddition() {
        assertEquals(15, calc.addition(10, 5));
        assertEquals(0, calc.addition(-5, 5));
    }

    @Test
    void testSoustraction() {
        assertEquals(5, calc.soustraction(10, 5));
        assertEquals(-10, calc.soustraction(-5, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(50, calc.multiplication(10, 5));
        assertEquals(0, calc.multiplication(10, 0));
    }

    @Test
    void testDivision() {
        assertEquals(2, calc.division(10, 5));
        assertEquals(-2, calc.division(-10, 5));
    }

    @Test
    void testDivisionParZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.division(10, 0);
        });

        String messageAttendu = "Division par zéro impossible !";
        assertEquals(messageAttendu, exception.getMessage());
    }

    @Test
    void testResultatInattendu() {
        // Supposons qu'on s'attend à un résultat exact mais on vérifie une tolérance
        double resultat = calc.division(10, 3);
        assertNotEquals(3, resultat); // Ne doit pas être égal à 3
        assertEquals(3.333, resultat, 0.001); // Résultat attendu avec une marge d'erreur
    }

    @Test
    void testTypesLimites() {
        assertEquals(Double.POSITIVE_INFINITY, calc.division(Double.MAX_VALUE, 0.00000001));
        assertEquals(0, calc.multiplication(0, Double.MAX_VALUE));
    }
}
