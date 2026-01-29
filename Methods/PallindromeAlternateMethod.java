import java.util.Scanner;
public class PallindromeAlternateMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt=0;
            
        for(int i=n; i<=m; i++){
            if(isPallindrome(i)){
                cnt++;
                if(cnt % 2 != 0) {
                    System.out.print(i+" ");
                }
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
