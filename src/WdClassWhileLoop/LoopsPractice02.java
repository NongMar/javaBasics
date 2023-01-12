package WdClassWhileLoop;

public class LoopsPractice02 {
    public static void main(String[] args) {
        int number=0;
        while(number<10){
            System.out.println((number));
            number++;
        }

        /*
        init number=0;
        number<10;
        System.out.println(number);
        number++;
        after again condition number<10; is checked
        if true we excecute again.

         */

        System.out.println("********");
        int i=0;
        for(i=0;i<10;i++){
            System.out.println(i);
        }
        /*
        When you know exactly how many times you want to loop through a block of code,
        use the for loop instead the while loop
           int i=0
           i<10
           System.out.println(i)
           i++
           i<10
           System.out.println(i)
         */


    }
}
