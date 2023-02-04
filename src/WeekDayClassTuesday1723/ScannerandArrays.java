package WeekDayClassTuesday1723;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerandArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");

        int[] num=new int[5];

        for(int i=0;i<num.length;i++){
            num[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(num));

    }
}
