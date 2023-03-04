package Weekend0226;

import java.util.HashMap;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("Foundation",40.99);
        makeup.put("Mascara",70.00);
        makeup.put("Eyeliner",12.99);
        makeup.put("Blushon",12.99);

        //To get all the keys we can use keySet Method from Map interface
        Set<String> allKeys=makeup.keySet();
        System.out.println(allKeys);

       allKeys.removeIf(x->x.length()>7);
        System.out.println(allKeys);
        System.out.println(makeup);



    }
}
