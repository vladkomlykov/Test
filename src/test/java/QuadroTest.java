import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadroTest {
    @Test
    public void executeTest(){
        QuadraticEquation quadraticEquation = new QuadraticEquation(3,-14,-5);
        quadraticEquation.countRadicals();
        Assertions.assertEquals(-3,quadraticEquation.getX1());
    }
    @Test
    public void failExecuteTest(){
        QuadraticEquation quadraticEquation = new QuadraticEquation(5,4,3);
        Assertions.assertThrows(QuadraticException.class, () -> quadraticEquation.countRadicals());
    }
}
