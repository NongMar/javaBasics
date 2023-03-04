package Weekend0225;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {


        Dog d1=new Dog("Jacky","Persian",2);
        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog("Jacky","Persian",2));
        dogs.add(new Dog("Bob","German",2));
        dogs.add(new Dog("Tom","Terrier",2));
        dogs.add(new Dog("Fifi","Poodle",2));

        for(Dog d:dogs){
            d.printDogName();
        }

    }
}
