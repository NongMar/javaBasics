package WeekDayClassTuesday1723;
import java.util.Arrays;
public class TwoDArraysDemo3 {
    public static void main(String[] args) {
        int [][] matrix={{10,20,30},
                         {30,44,55,74,34},
                         {43,77,78,34,789}
        };

        System.out.println(matrix[2][0]);
        System.out.println(Arrays.toString(matrix[0]));
        for(int i=0;i<matrix[0].length;i++){
            System.out.print(matrix[0][i]+" ");
        }
        System.out.println("*****");
        int[] arr=matrix[2];
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("******************");
        // matrix.length tells us how many 1 D arrays are present in 2D array
        for(int i=0;i<matrix.length;i++){

            //matrix[i].length the size of each 1D array
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("************");
        for(int[] mtrx:matrix){
            for(int number:mtrx){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
