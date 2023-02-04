package HomeWork;

public class ReverseSundayHomeWork {
    public static void main(String[] args) {
        String sunday="Sunday";
        String reversed=new StringBuilder(sunday).reverse().toString();
        System.out.println(reversed);



        //another way
        String str="Sunday";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));

        }




   }
}
