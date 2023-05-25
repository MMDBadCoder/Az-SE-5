import org.junit.Assert;
import org.junit.Test;
import ir.mmd.Rectangle;

import java.util.Random;


public class RectangleTest {

    @Test
    public void areaTest() {
        Rectangle rectangle = new Rectangle(10, 12);
        Assert.assertEquals(120, rectangle.computeArea(), 0);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double width = random.nextDouble();
            double height = random.nextDouble();
            rectangle.setHeight(height);
            rectangle.setWidth(width);
            Assert.assertEquals(width * height, rectangle.computeArea(), 0);
        }
    }

    @Test
    public void getterSetterTest(){
        Rectangle rectangle = new Rectangle(0, 0);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double width = random.nextDouble();
            rectangle.setWidth(width);
            Assert.assertEquals(width, rectangle.getWidth(),0);

            double height = random.nextDouble();
            rectangle.setHeight(height);
            Assert.assertEquals(height, rectangle.getHeight(), 0);
        }
    }
}
