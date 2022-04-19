import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeDemoTest {
    @Test
    public void testArea(){
        //arrange
        ShapeDemo shapeDemo = new ShapeDemo();

        //act
        int expected =12;
        int actual = (int) shapeDemo.area(2);

        //assert
        assertEquals(expected, actual);

    }
}
