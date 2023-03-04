package Weekend0226;

import java.util.Map;
import java.util.TreeMap;

public class MapsDemo8 {
    public static void main(String[] args) {

        Map<String, String> countries=new TreeMap<>();
        countries.put("Egypt", "Cairo");
        countries.put("France", "Paris");
        countries.put("Kyrgyzstan", "Bishkek");
        countries.put("USA", "Washington DC");
        countries.put("Italy", "Rome");

        //Set<Map.Entry<String,String>>entrySet=countries.entrySet();

        var entrySet= countries.entrySet();

        for(var entry:entrySet){

            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        var  iterator= countries.entrySet().iterator();
        while(iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }





    }
}
