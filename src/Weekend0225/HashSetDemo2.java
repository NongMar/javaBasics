package Weekend0225;

import java.util.LinkedHashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {

        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("mango");
        fruit.add("orange");
        fruit.add("mango");
        fruit.add("banana");
        System.out.println(fruit);


    }
}
