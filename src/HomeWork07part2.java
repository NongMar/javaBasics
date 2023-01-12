import java.util.Scanner;

public class HomeWork07part2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int day=8;

        if(day<=5){
            System.out.println("it's a weekday");
        }else if(day==6||day==7){
            System.out.println("its a weekend");
        }else{
            System.out.println("Invalid day");
        }

    }
}
