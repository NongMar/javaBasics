package Wd0823;

public class Animal {
    String name;
    String color;
    int age;
    double weight;
    void speak (){
        System.out.println("Animal can speak");
    }
    void eat(){
        System.out.println("Animals eat");
    }
}

class Cat extends Animal{
    void speak (){
        System.out.println("Cat says: meow meow");
    }
}

class Dog extends Animal{

}

class Tester{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.speak();
    }
}