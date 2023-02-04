package HomeWork;

public class StringHMTask5Jan24 {
    public static void main(String[] args) {

       String str="aba";
       String pal="";

       for(int i=str.length()-1;i>=0;i--){

           pal=pal+str.charAt(i);
       }if(pal.equals(str)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str+ " is not a palindrome");
        }







    }
}
