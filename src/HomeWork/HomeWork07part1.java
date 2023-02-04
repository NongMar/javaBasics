package HomeWork;

import java.util.Scanner;

public class HomeWork07part1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter height in inches");
        int h=input.nextInt();

        if(h<60){
            System.out.println("short");
        }else if(h>60&&h<72){
            System.out.println("medium");
        }else if(h>72){
            System.out.println("tall");
        }


    }
}
