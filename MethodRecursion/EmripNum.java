import java.util.*;
public class EmripNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        range(n,m);
    }
    public static void range(int n,int m){
        if(n>m){
            return;
        }
        if(isEmrip(n)){
            System.out.println(n);
        }
        range(n+1, m);
    }
    public static boolean isEmrip(int n){
        if(!isPrime(n,n/2)) return false;
        int rev = reverse(n);
        
        return isPrime(rev,rev/2);
    }
    public static boolean isPrime(int n,int i){
        if(i == 1) return true;
        if(n<=1 || n%i==0) return false;
        return isPrime(n,i-1);
    }
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int d = n%10;
            rev = rev*10 + d;
            n/=10;
        }
        return rev;
    }
    
}

