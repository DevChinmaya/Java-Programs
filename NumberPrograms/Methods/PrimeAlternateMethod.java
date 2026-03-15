import java.util.Scanner;
public class PrimeAlternateMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        findAlternate(n,m);
    }
    public static void findAlternate(int st,int end){
        int cnt=0;
        for(int i=st; i<=end; i++){
            if(isPrime(i)){
                cnt++;
                if(cnt % 2 != 0) {
                    System.out.print(i + " ");
                }
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
