import java.util.Scanner;

public class HomeWork07part3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter quiz ,mid and fin scores");
        int quiz=input.nextInt();
        int mid=input.nextInt();
        int fin=input.nextInt();

        int avr=(quiz+mid+fin)/3;

        if (avr >= 90) {
            System.out.println("A");
        }else if(avr>=70&&avr<90){
            System.out.println("B");
        }else if(avr>=50&&avr<70){
            System.out.println("C");
        }else if(avr<50){
            System.out.println("F");
        }



    }
}
