package Weekend0226;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Nezir");
        studentsMap.put(2, "Shah");
        studentsMap.put(3, "Tami");
        studentsMap.put(4, "Aisha");
        studentsMap.put(5, "Gul");
        studentsMap.put(6, "Bahar");
        studentsMap.put(7, "Saba");

        Collection<String> values=studentsMap.values();
        values.removeIf(x->x.contains("i"));
        System.out.println(values);
    }
}
