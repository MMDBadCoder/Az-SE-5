import ir.mmd.Rectangle;
import ir.mmd.Square;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class SquareTest {

    @Test
    public void areaTest() {
        Square square = new Square(12);
        Assert.assertEquals(144, square.computeArea(), 0);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double height = random.nextDouble();
            square.setHeight(height);
            Assert.assertEquals(height * height, square.computeArea(), 0);

            double width = random.nextDouble();
            square.setWidth(width);
            Assert.assertEquals(width * width, square.computeArea(), 0);

            double side = random.nextDouble();
            square.setSideLength(side);
            Assert.assertEquals(side * side, square.computeArea(), 0);
        }
    }

    @Test
    public void getterSetterTest() {
        Square square = new Square(0);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double width = random.nextDouble();
            square.setWidth(width);
            checkSideSize(square, width);

            double height = random.nextDouble();
            square.setHeight(height);
            checkSideSize(square, height);

            double side = random.nextDouble();
            square.setSideLength(side);
            checkSideSize(square, side);
        }
    }

    public void checkSideSize(Square square, double expectedSize){
        Assert.assertEquals(expectedSize, square.getSideLength(), 0);
        Assert.assertEquals(expectedSize, square.getWidth(), 0);
        Assert.assertEquals(expectedSize, square.getHeight(), 0);
    }
}
