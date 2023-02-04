package ConstructorHM;

public class Book {

    String title;
    String author;

    int year;

    public Book(String t,String a,int y){
        title=t;
        author=a;
        year=y;
    }

    public Book(String t,String a){
        title=t;
        author=a;
    }

    void info(){
        if(year==0){
            System.out.println("Title:"+title+" by "+author);
        }else{
            System.out.println("Title:"+title+" by "+author+" year published "+year);
        }
    }

    public static void main(String[] args) {
        Book book1=new Book("Lord of the Rings","JRR Tolkien",1955);
        book1.info();
        Book book2=new Book("Ubik","PKD");
        book2.info();
    }
}
