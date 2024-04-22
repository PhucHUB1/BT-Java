package B2;

public class Rectangle {
    private final double width;
    private final double height;

    public double getArea(){
        return width*height;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
