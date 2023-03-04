package Weekend0225;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "James");
        studentsMap.put(2, "George");
        studentsMap.put(3, "Jess");

        System.out.println(studentsMap);

        System.out.println(studentsMap.get(3));
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(1));
        System.out.println(studentsMap.containsValue("James"));
        System.out.println(studentsMap.remove(2));
        System.out.println(studentsMap);

    }
}
