package WeekdayClassTuesday24;

public class StringRecap {
    public static void main(String[] args) {
        //Print all the letters from this String one by one
        String str="Java is Great";
        System.out.println(str.chars());

        for (int i = 0; i <str.length(); i++) {

            System.out.println(str.charAt(i));
        }
        // what is the input to the charAt() method?: int , output is char.

        int counter=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                counter++;
            }

        }
        System.out.println("Letter a has appeared "+ counter);



    }
}
