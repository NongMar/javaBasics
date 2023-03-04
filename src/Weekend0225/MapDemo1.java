package Weekend0225;

import java.util.HashMap;

public class MapDemo1 {

    public static void main(String[] args) {

        HashMap<String,Integer>groceries=new HashMap<>();
        groceries.put("Eggs",10);
        groceries.put("Milk",5);
        groceries.put("Bread",6);

        System.out.println(groceries.get("Milk"));
        System.out.println(groceries);

        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        groceries.remove("Bread");
        System.out.println(groceries);

    }


}
