
import java.util.Scanner;
class FactorialMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(isFactorial(n) >= 0) {
            System.out.println("Factorial of " + n + ": " + isFactorial(n));
        } else {
            System.out.println("Invalid input for factorial.");
        }
    }
    public static int isFactorial(int n) {
        if (n < 0) {
            return -1;
        }
        int fact = 1;
        for (int j = n; j > 0; j--) {
            fact = fact * j;
        }
        return fact;
    }
}
