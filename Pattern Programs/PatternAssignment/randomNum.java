import java.util.*;

public class randomNum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = sc.next();
        for(int i=1; i<=5; i++){
            System.out.println((double)(Math.random()));
        }

    }
}
