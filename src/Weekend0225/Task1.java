package Weekend0225;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("John");
        names.add("Paul");
        names.add("George");
        names.add("Ringo");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Jimi"));
        System.out.println(names.contains("Paul"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
