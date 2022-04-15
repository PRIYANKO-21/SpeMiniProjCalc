import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
//testing for SQRT
    @Test
    public void testSqrt(){
        Calculator calculator=new Calculator();
        double actual=calculator.squareroot(36.0);
        double expected=6.0;
        Assertions.assertEquals(expected,actual);
    }
//testing for natural log
    @Test
    public void testNaturalLog(){
        Calculator calculator=new Calculator();
        double num=145.256;
        double actual= calculator.naturalLog(num);
        double expected=4.978497702968366;
        Assertions.assertEquals(expected,actual);
    }
//testing for factorial
    @Test
    public void testFactorial(){
        Calculator calculator=new Calculator();
        int actual= calculator.factorial(4);
        int expected=24;
         Assertions.assertEquals(expected,actual);
    }
//testing for power
    @Test
    public void testPower(){
        Calculator calculator=new Calculator();
        double num=2.0;
        double actual=calculator.power(num,num);
        double expected=4.0;
        Assertions.assertEquals(expected,actual);
    }
}