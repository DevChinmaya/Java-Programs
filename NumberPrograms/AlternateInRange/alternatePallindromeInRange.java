
import java.util.*;
public class alternatePallindromeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to find pallindrome numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count=0;
        for(int i=n; i<=m; i++){
            int rev = 0;
            int copy = i;
            while(copy>0){
                int d = copy%10;
                rev = rev*10 + d;
                copy /= 10;
            }
            if(rev == i){
                count++;
                if(count % 2 != 0)
                System.out.println(i+" is a Pallindrome number");
            }
        }
    }
}
