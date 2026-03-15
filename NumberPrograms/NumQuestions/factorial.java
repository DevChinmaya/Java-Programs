
import java.util.Scanner;
class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact=1;
        int j=n;
        while(j>0){
            fact = fact * j;
            j--;    
        }
        System.out.println("Factorial of " + n + ": " + fact);
    }
}
