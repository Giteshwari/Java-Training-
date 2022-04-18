import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator obj_a = new Calculator();
    @Test
    public void testAdd(){
        assertEquals(10,obj_a.add(5,5));

    }
    @Test
    public void testDiv(){
        Division obj_d = new Division();
        assertEquals("Success",5,obj_d.div(10,2));
    }
    @Test
    public void testMult(){
        Multiplication obj_m = new Multiplication();
        assertEquals("Multiplication done",15,obj_m.mult(5,3));
    }
    @Test
    public void testSub(){
        Subtraction obj_s = new Subtraction();
        assertEquals(2,obj_s.sub(6,4));

    }


}

