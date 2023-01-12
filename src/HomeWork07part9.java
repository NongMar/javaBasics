import java.util.Scanner;

public class HomeWork07part9 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("Enter 2 numbers and make a math operation using +,-,*,/");
        int n1=i.nextInt();
        int n2=i.nextInt();
        System.out.println("Enter operator +,-,*,/");
        char op=i.next().charAt(0);

        switch(op){

            case '+':
                System.out.println(n1+"+"+n2+"="+(n1+n2));
                break;
            case '-':
                System.out.println(n1+"-"+n2+"="+(n1-n2));
                break;
            case '*':
                System.out.println(n1+"*"+n2+"="+(n1*n2));
                break;
            case '/':
                System.out.println(n1+"/"+n2+"="+(n1/n2));
                break;
        }

    }
}
