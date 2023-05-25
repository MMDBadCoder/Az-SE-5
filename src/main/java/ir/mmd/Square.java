package ir.mmd;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public void setSideLength(double size) {
        super.setWidth(size);
        super.setHeight(size);
    }

    public double getSideLength(){
        return this.getHeight();
    }

    @Override
    public void setWidth(double width) {
        this.setSideLength(width);
    }

    @Override
    public void setHeight(double height) {
        this.setSideLength(height);
    }
}
