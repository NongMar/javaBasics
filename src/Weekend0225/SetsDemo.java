package Weekend0225;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(130);
        num.add(10);
        num.add(50);
        num.add(10);


        LinkedHashSet<Integer>uniqueNumbers=new LinkedHashSet<>(num);
        System.out.println(uniqueNumbers);


    }
}
