package Tuesday0723;

public class Task3 {

    private void method(String str1){
        System.out.println("method");
    }

    private void method(String str1,String str2){
        System.out.println("method");
    }
    private void method(String str1,String str2,int num){
        System.out.println("method");
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        task3.method("Java");
        task3.method("Java","Python");
    }
}
