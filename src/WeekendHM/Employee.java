package WeekendHM;

public class Employee {

    String name;
    String salary;
    int id;

    Employee(String name,String salary,int id){
        this.name=name;
        this.salary=salary;
        this.id=id;

    }
    public void employee(){
        System.out.println("Name "+name+" id"+ id);
    }
}
class FullTime extends Employee{
    String position;
    String hours;
    FullTime(String name,String salary,int id,String position,String hours){
        super(name,salary,id);
        this.position=position;
        this.hours=hours;
    }
    public void info(){
        System.out.println("Position "+position+" hours "+hours+" salary "+salary);
    }

}

 class PartTime extends Employee{
    String start;
    String end;
    PartTime(String name,String salary,int id,String start,String end){
        super(name,salary,id);
        this.start=start;
        this.end=end;
    }
    public void parttime(){
        System.out.println("Part time "+name+" Started on "+start+" and finished at "+end);
    }
 }
