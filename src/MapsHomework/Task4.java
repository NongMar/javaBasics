package MapsHomework;

import com.sun.source.doctree.SeeTree;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {

        Set<String> ingridients = new LinkedHashSet<>();

        ingridients.add(" Water, ");
        ingridients.add(" Flour, ");
        ingridients.add(" Salt, ");

        StringBuilder sb = new StringBuilder();
        for (String str : ingridients) {
            sb.append(str);
        }
        String concat = sb.toString();

        System.out.println("To make bread you need mix" + concat);

    }
}
