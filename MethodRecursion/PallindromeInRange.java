

public class PallindromeInRange {
    public static void main(String[] args) {
        range(10,100);
    }
    public static void range(int st,int end){
        if(st>end)return;
        if(isPalindrome(st))System.out.println(st);
        range(st+1,end);
    }
    public static boolean isPalindrome(int n){
        return isPalindrome(n,n,0);
    }
    public static boolean isPalindrome(int n,int m, int rev){
        if(n==0) return m==rev;
        return isPalindrome(n/10,m,rev = (rev*10) + (n%10));
    }
    
}
