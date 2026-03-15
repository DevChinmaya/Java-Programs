import java.util.Scanner;
public class PallindromeRangeMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range:");
        int n = sc.nextInt();
        int m = sc.nextInt();
            
        for(int i=n; i<=m; i++){
            if(isPallindrome(i)){
                System.out.println(i+" is a Pallindrome number");
            }
        }
    }
    public static boolean isPallindrome(int n) {
        int rev = 0;
        int copy = n;
        while(copy>0){
            int d = copy%10;
            rev = rev*10 + d;
            copy /= 10;
        }
        return rev == n;
    }
}
