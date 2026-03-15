import java.util.Scanner;
public class PrimeHighestMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        range(n,m);
    }
    public static void range(int st, int end){
        for(int i=end; i>=st; i--){
            if(isPrime(i)){
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
