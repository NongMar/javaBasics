package ConstructorHM;

public class BookTester {
    public static void main(String[] args) {
        Book book1=new Book("Lord of the Rings","JRR Tolkien",1955);
        book1.info();
        Book book2=new Book("Ubik","PKD");
        book2.info();
    }
}
