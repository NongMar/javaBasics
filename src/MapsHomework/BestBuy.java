package MapsHomework;
import Weekend0226.Entry;

import java.util.*;

public class BestBuy {
    public static void main(String[] args) {
        /*Create a map of Best Buy store. Place
        item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        Retrieve all keys and values from a Best Buy map using EntrySet.*/

       Map<Integer,String> bestBuy= new HashMap<>();

       bestBuy.put(12312,"TV");
       bestBuy.put(42334,"Laptop");
       bestBuy.put(54522,"Speakers");

        System.out.println(bestBuy.entrySet());











    }
}
