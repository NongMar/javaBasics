package WeekdayClassTuesday24;

public class homeworkString {
    public static void main(String[] args) {
        //Create a String and if the String is not empty perform following:...



        String str="Hello";
        if(!str.isEmpty()){

            if(str.length()%2!=0&&str.length()>3){
                int middle=str.length()/2;
                System.out.println(str.charAt(middle));

            }
        }


    }
}
