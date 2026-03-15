import java.util.Scanner;

public class fibonacciInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to print Fibonacci series:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a = 0;
        int b = 1;

        while (a <= m) {
            if (a >= n) {
                System.out.print(a + " ");
            }
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
