package HomeWork;

public class StringHMTask4Jan24 {
    public static void main(String[] args) {


       String original="This is sentence I want to reverse";
       String[] str1=original.split(" ");

       String reverse=" ";
       for(String newStr:str1){

           StringBuilder sentence=new StringBuilder(newStr);
           sentence.reverse();
           reverse=reverse+sentence.toString()+" ";
       }
        System.out.println(reverse+" ");



    }
}