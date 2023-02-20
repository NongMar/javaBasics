package ClassProject;

public class ShapeTester {
    public static void main(String[] args) {

        Circle circle = new Circle(2.4);
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square=new Square(5.0);

        square.calculateArea();
        square.calculatePerimeter();
    }

}
