
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n){
        return isPalindrome(n,n,0);
    }
    public static boolean isPalindrome(int n,int m, int rev){
        if(n==0) return m==rev;
        return isPalindrome(n/10,m,rev = (rev*10) + (n%10));
    }
    
}
