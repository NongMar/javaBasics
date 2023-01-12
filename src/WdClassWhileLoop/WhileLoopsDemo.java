package WdClassWhileLoop;

import java.util.Scanner;

public class WhileLoopsDemo {
    public static void main(String[] args) {

        /*boolean workDay=true;
        int day=1;
        while (workDay){
            if(day<=5){
                System.out.println("I need a day off");
            }else {
                System.out.println("I don't need a day off anymore");
                workDay=false;
            }
            day++;
        }*/
          boolean condition=true;
        Scanner sc=new Scanner(System.in);
          int num=10;
        System.out.println("Please enter a number between 10 to 20");
        while(condition){

              int userInput=sc.nextInt();
              if(userInput>num){
                  System.out.println("Your entered number is greater");
              }else if(userInput<num){
                  System.out.println("Your entered a smaller number");
              }else{
                  System.out.println("You won");
                  condition=false;
              }
          }





    }
}
