package ClassProject;

interface Shape{
    void calculateArea();
    void calculatePerimeter();


}
class Circle implements Shape{
      static double radius;
      public Circle(double radius){
          this.radius=radius;
      }
    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter() {
       double perimeter= 2*Math.PI*radius;
        System.out.println(perimeter);
    }
}

class Square implements Shape{
    static double sideLength;
    public Square(double sideLength){
        this.sideLength=sideLength;
    }

    public void calculateArea(){
        double area=sideLength*sideLength;
        System.out.println(area);

    }

    public void calculatePerimeter(){
        double perimeter=4*sideLength;
        System.out.println(perimeter);
    }
}
