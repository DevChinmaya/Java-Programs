
import java.util.Scanner;
class FactorialRangeMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=n; i<=m; i++) {
            if(isFactorial(i) >= 0) {
                System.out.println("Factorial of " + i + ": " + isFactorial(i));
            }
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
