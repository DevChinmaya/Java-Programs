import java.util.Scanner;
public class EmricNumMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        isEmric(n);
    }
    public static void isEmric(int n){
        int p=0;
        if(isPrime(n) == 0) {//Is prime
            System.out.println("Not a Emric num");
            return ;
        }else{
             p = isPrime(n);
        }  
        reverse(p);//Reverse   
        if(isPrime(p) == p){
            System.out.println(p+" is an Emric Num");
        }else{
            System.out.println("Not an Emric Num");
        }
    }
    public static int isPrime(int n) {
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return n;
    }
    public static int reverse(int n){
        int rev = 0;
        int copy = n;
        while(copy>0){
            int d = copy%10;
            rev = rev*10 + d;
            copy /= 10;
        }
        return rev;
    }
    
}
