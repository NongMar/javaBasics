package HomeWork;

import java.util.Arrays;

public class ArrayHomeWork02 {
    public static void main(String[] args) {


        char[] letters={'A','B','C','D','E','F'};

        char grade='B';

        for(int i=0;i<letters.length;i++){
         Arrays.sort(letters);
        }
        System.out.println(grade);

        char[] arr=new char[6];
        arr[0]='A';
        arr[1]='B';
        arr[2]='C';
        arr[3]='D';
        arr[4]='E';
        arr[5]='F';

        for(int i=0;i<arr.length;i++){

            if(arr[i]=='B'){
                System.out.println(arr[i]);
            }
        }










    }
}
