
import java.util.Scanner;
class FactorialAlternateMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range to find alternate Factorial numbers:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt=0;
        for(int i=n; i<=m; i++) {
            if(isFactorial(i) >= 0) {
                cnt++;
                if(cnt % 2 != 0) {
                    System.out.println( i + ": " + isFactorial(i));
                }
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
