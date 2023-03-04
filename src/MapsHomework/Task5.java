package MapsHomework;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {

        ArrayList<Integer> sum=new ArrayList<>();

        sum.add(25);
        sum.add(10);
        sum.add(10);
        sum.add(20);
        sum.add(10);
        sum.add(11);
        sum.add(35);

        int add=0;
        for(int x:sum){
            add=add+x;

        }
        System.out.println(add);
    }
}
