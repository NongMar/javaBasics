package WeekdayClassTuesday24;

public class MethodsDemo02 {

        /*
        Creating methods, */


    //defining a method,it will print anything inside the code block
    void printHello(){
        System.out.println("Hello World");
    }

    void printHelloManyTimes(int times){

        for (int i = 0; i <times ; i++) {
            System.out.println("Hello World");
        }
    }

    void printManyTimes(int num, String word) {
        for (int i = 0; i <num ; i++) {
            System.out.println(word);

        }
    }
}
