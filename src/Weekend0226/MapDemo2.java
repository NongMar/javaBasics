package Weekend0226;

import java.util.HashMap;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String,Double>fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Banana",1.0);
        fruit.put("Apple",2.99);
        fruit.put("Orange",2.99);
        fruit.put(null,null);


        HashMap<String, Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("Foundation",40.99);
        makeup.put("Mascara",70.00);
        makeup.put("Eyeliner",12.99);
        makeup.put("Blushon",12.99);

        HashMap<String,Double> groceries=new HashMap<>();

        groceries.putAll(fruit);
        groceries.putAll(makeup);
        System.out.println(groceries);




    }
}
