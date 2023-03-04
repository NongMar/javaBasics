package MapsHomework;
import java.util.*;
import java.util.HashMap;

import java.util.Map;


class Person{
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name,String lastName,int age,double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }

    public void user(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }

}
public class PersonTest {
    /*Create a Person class with following private fields: name, lastName, age, salary.
    Variables should be initialized through constructor.
    Inside the class also create a method to print user details.
    In Test Class create a Map that will store key in ascending order.
    In that map store personId and a Person Object. Print each object details.*/
    public static void main(String[] args) {
        Map<Integer,Person> details=new HashMap<>();
        details.put(1,new Person("John","Smith",30,100000));
        details.put(2,new Person("Bob","Sakcs",40,150000));
        details.put(3,new Person("Jess","Fran",27,95000));

        for(Integer id: details.keySet()){
            System.out.println("Person ID: "+id);
            Person person=details.get(id);
            person.user();
            System.out.println();

        }




    }







}
