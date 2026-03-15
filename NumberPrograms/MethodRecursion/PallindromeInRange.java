
import java.util.*;
public class PallindromeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        range(n,m);
    }
    public static void range(int st,int end){
        if(st>end)return;
        if(isPalindrome(st))System.out.println(st);
        range(st+2,end);
    }
    public static boolean isPalindrome(int n){
        return isPalindrome(n,n,0);
    }
    public static boolean isPalindrome(int n,int m, int rev){
        if(n==0) return m==rev;
        return isPalindrome(n/10,m,rev = (rev*10) + (n%10));
    }
    
}
