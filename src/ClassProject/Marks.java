package ClassProject;

 abstract class Marks {
    abstract void getPercentage();
}

class StudentA extends Marks{
     private double math,history,java;

     public StudentA(double math,double history,double java){
         this.math=math;
         this.history=history;
         this.java=java;
     }
    @Override
    void getPercentage() {
         double total=math+history+java;
        System.out.println(total/3.0);

    }
 }

class StudentB extends Marks{
    private double python,math,selenium,java;
    public StudentB(double python,double math,double selenium,double java){
        this.python=python;
        this.math=math;
        this.selenium=selenium;
        this.java=java;
    }

    void getPercentage(){
        double total=python+math+selenium+java;
        System.out.println(total/4.0);

    }
}
