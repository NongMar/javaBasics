package ConstructorHM;


 public class Task3 {

     String a;
     int i;
     double j;
    Task3(){
        System.out.println("default");
    }

    public Task3(String str){
        a=str;
    }

    private Task3(int x){
       i=x;
    }

    protected Task3(double y){
       j=y;

    }
    void printA(){
        System.out.println(a);
    }
    void printI(){
        System.out.println(i);
    }

    void printJ(){
        System.out.println(j);
    }
     public static void main(String[] args) {
         Task3 s1=new Task3();
         Task3 s2=new Task3("public");
         Task3 s3=new Task3(7);
         Task3 s4=new Task3(3.5);

         s2.printA();
         s3.printI();
         s4.printJ();
     }

}


