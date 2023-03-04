package MapsHomework;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    public static void main(String[] args) {
        Map<String,Integer> emp=new HashMap<>();

        emp.put("John Smith",100000);
        emp.put("Bob Doe",102000);
        emp.put("Jane Lee",130000);
        emp.put("Bruce Wayne",1000000000);
        emp.put("Shane Flick",50000);

        String name = "";
        int highestSalary = 0;

        for(Map.Entry<String,Integer> entry:emp.entrySet()){
            if(entry.getValue()>highestSalary){
                highestSalary=entry.getValue();
                name=entry.getKey();

            }
        }
        System.out.println(name+"=$"+highestSalary);




    }






}
