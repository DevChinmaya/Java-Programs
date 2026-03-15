
import java.util.*;
public class highestPallindromeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to find pallindrome numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=m; i>=n; i--){
            int rev = 0;
            int copy = i;
            while(copy>0){
                int d = copy%10;
                rev = rev*10 + d;
                copy /= 10;
            }
            if(rev == i){
                System.out.println("Highest Pallindrome number in range: " + i);
                break;
            }
        }
    }
}
