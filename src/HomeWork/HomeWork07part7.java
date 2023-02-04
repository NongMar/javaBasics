package HomeWork;

import java.util.Scanner;

public class HomeWork07part7 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);

        System.out.println("Enter a country");

        String c=i.next();

        switch(c){
            case "Germany":
                System.out.println("German");
                break;
            case "Russia":
                System.out.println("Russian");
                break;
            case "Uk":
                System.out.println("English");
                break;
            case "France":
                System.out.println("French");
                break;
            case "Spain":
                System.out.println("Spanish");
                break;


        }



    }
}
