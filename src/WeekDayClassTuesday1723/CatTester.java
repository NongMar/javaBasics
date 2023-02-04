package WeekDayClassTuesday1723;

public class CatTester {
    public static void main(String[] args) {
        //creating an object from Cat class
        Cat cat1= new Cat();
        cat1.eat();
        cat1.name="Tom";
        cat1.breed="Persian";
        cat1.age=2;
        cat1.color="Black";
        cat1.attitude=false;


        Cat cat2=new Cat();

        cat2.name="Frank";
        cat2.breed="Street";
        cat2.age=4;
        cat2.color="Red";
        cat2.attitude=true;
        cat2.eat();

    }
}
