//3rd highgest emirp number in a given range
import java.util.Scanner;
public class EmripNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int st = sc.nextInt();
        int end = sc.nextInt();
        range(st,end,0);
    }
    public static void range(int st,int end,int count){
        if(st>end) return ;
        if(isEmrip(end)){
            count++;
            if(count == 3){
                System.out.println(end);
                return; 
            } 
        }
        range(st,end-1,count);
    }
    public static boolean isEmrip(int n){
        int rev = reverse(n,0);
        if(isPrime(n,n/2)){
            return isPrime(rev,rev/2);
        }
        return false;
    }
    public static boolean isPrime(int n,int i){
        if(i==1)return true;
        if(n<=1 || n%i==0) return false;
        return isPrime(n,i-1);
    }
    public static int reverse(int n,int rev){       
        if(n==0) return rev;
        rev = (rev*10) + (n%10);
        return reverse(n/10, rev);
    }
}
