package Weekend0226;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class EntryDemo {
    public static void main(String[] args) {

        Set<Entry> entrySet= new LinkedHashSet<>();

        entrySet.add(new Entry(1,"John"));
        entrySet.add(new Entry(2,"Paul"));
        entrySet.add(new Entry(3,"George"));
        entrySet.add(new Entry(4,"Ringo"));

        entrySet.removeIf(x->x.getKey()>2 && x.getValue().contains("i") );
        System.out.println(entrySet);
    }

}
