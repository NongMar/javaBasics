package HomeWork;

import java.util.Scanner;

public class ArrayHomeWork1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter item name: ");
            String item = scanner.nextLine();
            System.out.print("Enter item price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            totalPrice += price;
            System.out.println("Total price so far: " + totalPrice);
        }

        System.out.print("Enter amount to pay: ");
        double payment = scanner.nextDouble();
        scanner.nextLine();

        if (payment > totalPrice) {
            System.out.println("Change: " + (payment - totalPrice));
        }
            System.out.println("Thank you for shopping!");








        }





    }

