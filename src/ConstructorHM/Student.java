package ConstructorHM;

public class Student {

   double math;
    double history;
    double english;
    String name;

    double average;

    Student(String sName,double sMath,double sHistory,double sEnglish){
        math=sMath;
        history=sHistory;
        english=sEnglish;
        name=sName;

        average=(sMath+sHistory+sEnglish)/3;
    }
    void printAvr(){
        System.out.println(name+" :an average is "+ average);
    }

    public static void main(String[] args) {
        Student student1=new Student("John",88,89,89);
        student1.printAvr();
        Student student2=new Student("Paul",90,88,100);
        student2.printAvr();
        Student student3=new Student("George",90,90,89);
        student3.printAvr();
        Student student4=new Student("Ringo",77,80,90);
        student4.printAvr();
        Student student5=new Student("G.Martin",100,100,100);
        student5.printAvr();
    }
}
