package HomeWork;

import java.util.Scanner;

public class HomeWork07part6 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        System.out.println("Enter 3 numbers");

        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();

        if(n1>n2&&n1>n3){
            System.out.println("The largest is "+n1);
        }else if(n2>n1&&n2>n3){
            System.out.println("The largest is "+n2);
        }else if(n3>n1&&n3>n2){
            System.out.println("The largest is "+n3);
        }




    }
}
