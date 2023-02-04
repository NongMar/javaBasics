package WeekdayClassTuesday24;

public class SPlitmethod {
    public static void main(String[] args) {
        String str="I like java. I write a lot of code daily.I am from batch 15";

        String[] strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[0].trim());
        //when we work with arreys we use .length and if we work with strings we use .length()




        //End
    }
}
