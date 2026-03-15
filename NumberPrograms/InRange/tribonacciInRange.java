import java.util.Scanner;
public class tribonacciInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to print Tribonacci series:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 1;

        while (a <= m) {
            if (a >= n) {
                System.out.print(a + " ");
            }
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        sc.close();
    }
}