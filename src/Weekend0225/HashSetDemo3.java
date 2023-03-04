package Weekend0225;

import java.util.TreeSet;

public class HashSetDemo3 {
    public static void main(String[] args) {
        TreeSet<String>fruit=new TreeSet<>();
        fruit.add("mango");
        fruit.add("banana");
        fruit.add("mango");
        fruit.add("orange");
        fruit.add("apple");
        System.out.println(fruit);
    }
}
