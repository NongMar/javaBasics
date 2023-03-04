package Weekend0225;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> things=new ArrayList<>();
        things.add("Fire");
        things.add("Snow");
        things.add("Table");
        things.add("Car");

        things.removeIf((x->x.endsWith("e")));
        System.out.println(things);
    }


}
