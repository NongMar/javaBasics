package ClassProject;

public class CarTester {
    public static void main(String[] args) {
      Sedan sedan=new Sedan(40.4,"Red",4);

      double price=sedan.calculateSalePrice();
        System.out.println(price);


        Truck truck=new Truck(100.99,"black",3000);
        double truckPrice=truck.calculateSalePrice();
        System.out.println(truckPrice);


    }


}
