import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    @Test
    @After
    public void testAdd(){
        Calculator obj_a = new Calculator();
        assertEquals(10,obj_a.add(5,5));

    }

    @Test
    public void testDiv(){

        Division obj_d = new Division();
        assertThrows("Division by Zero is not Allowed",ArithmeticException.class,()->obj_d.div(10,2));
//        assertThrows(ArithmeticException.class,()->obj_d.div(10,2));
//        assertEquals("Success",5,obj_d.div(10,2));
    }

    @Test
    @Before
    public void testMult(){
        Multiplication obj_m = new Multiplication();
        assertEquals("Multiplication done",15,obj_m.mult(5,3));
    }

    @Test
    @Ignore
    public void testSub(){
        Subtraction obj_s = new Subtraction();
        assertEquals("2",obj_s.sub(6,4));
    }


}

