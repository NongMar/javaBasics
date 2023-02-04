package ConstructorHM;

public class StudentAd {

    String name;
    String address;

    public StudentAd(String a,String b){
        name = a;
        address=b;
    }

    void display(){
        System.out.println("Name: "+name+", address:"+address);
    }

    public static void main(String[] args) {
     StudentAd info=new StudentAd("John Smith","222 Cedar St. Brooklyn,NYC");

     info.display();
    }
}
