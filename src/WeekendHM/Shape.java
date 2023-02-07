package WeekendHM;

public class Shape {

     int radius;
      Shape(int r){
          this.radius=r;
      }
}
class Circle extends Shape{

    double area;
    double pi;
    Circle(int radius,double pi){
        super(radius);
        this.pi=pi;
    }

     void areofCircle(){
        double areaofCircle= this.area=pi*radius*radius;
         System.out.println("Area of circle = "+ areaofCircle);
     }
}
