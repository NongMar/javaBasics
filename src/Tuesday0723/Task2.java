package Tuesday0723;

public class Task2 {

    static void method(String str1){
        System.out.println("Method 1");
    }

    static void method(String str1,String str2){
        System.out.println("Method 2");
    }

    static void method(String str1,String str2,String str3){
        System.out.println("Method 3");
    }

    public static void main(String[] args) {
        method("Java","Python");
    }
}
