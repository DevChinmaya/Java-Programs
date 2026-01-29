
import java.util.Scanner;
public class highestPrimeNumInRange {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to find highest prime number: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=m; i>=n; i--){
            boolean isPrime = true;
            for(int j=2; j<=i/2; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && i>1){
                System.out.println("The highest prime number in the given range is: " + i);
                break;
            }
        }
    }
}
