package ConstructorHM;

public class Task3Tester {
    public static void main(String[] args) {
        Task3 s1=new Task3();
        Task3 s2=new Task3("public");
        Task3 s3=new Task3(7);
        Task3 s4=new Task3(3.5);

        s2.printA();
        s3.printI();
        s4.printJ();
    }
}
