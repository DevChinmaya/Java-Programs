
import java.util.Scanner;

public class Demo {
    int id;
    String name;
    String author;
    public void addBook(int id,String name,String author){
        this.id=id;
        this.name=name;
        this.author=author;
    }
    public void display(){
        System.out.println("Book id: "+id);
        System.out.println("Book name: "+name);
        System.out.println("Book author: "+author);
    }
    public static Demo getBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book details:");
        int id=sc.nextInt();
        String name=sc.next();
        String author = sc.next();
        Demo d1 = new Demo();
        d1.addBook(id,name,author);
        return d1;
    }
    public static void main(String[] args) {
        Demo d = getBook();
        d.display();
    }
}
