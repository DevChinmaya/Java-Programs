
import java.util.Scanner;
class Book {
    String name;
    String author;
    double price;

    public void addBook(String name,String author,double price){
        this.name = name;
        this.author = author;
        this.price = price;

    }

    public void display(){
        System.out.println("Book Name: "+name);
        System.out.println("Book Author: "+author);
        System.out.println("Book Price: "+price);
    }

    public static Book getBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book details: ");
        String name = sc.next();
        String author = sc.next();
        double price = sc.nextDouble();
        Book b = new Book();
        b.addBook(name, author, price);
        return b;
    }
    public static void main(String[] args) {
        Book b = getBook();
        b.display();
    }
}
