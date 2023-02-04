package WeekDayClassTuesday1723;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        System.out.println(arr[4]);
        System.out.println("****");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("*******");
        //Enhanced fo loop
        //whenever possible use below loop
        for(int number:arr){
            System.out.println(number);
        }

    }
}
