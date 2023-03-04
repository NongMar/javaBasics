package Weekend0226;

import java.util.HashMap;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<Integer,String> building=new HashMap<>();

        building.put(1,"Google");
        building.put(2,"BoA");
        building.put(3,"Law Firm");
        building.put(4,"PR Firm");
        building.put(5,"Law Firm");
        building.put(6,"Toy co.");
        building.put(7,"Trading co.");

        System.out.println(building.size());
        System.out.println(building.replace(4,"Ad agency"));
        System.out.println(building.remove(7));
        System.out.println(building);
    }
}
