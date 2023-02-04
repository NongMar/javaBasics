package WeekdayClassTuesday24;

public class MethodsDemo01 {
    public static void main(String[] args) {


        int[] array2={10,10,10,20,50};
        addArrayElements(array2);
        int[] anotherArr={132,54,23,67};
        addArrayElements(anotherArr);
    }


    static void addArrayElements(int[] arr){
        int sum=0;
        for(int num:arr){

            sum+=num;
        }
        System.out.println(sum);
    }




}
