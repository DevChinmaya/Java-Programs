
import java.util.Scanner;
public class Fibonnaci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;       
        System.out.print(a+" "+b+" ");
        fibo(n-2,a,b);
    }
    public static void fibo(int n,int a,int b){
        if(n == 0) return ;      
        int c = a+b;
        System.out.print(c+" ");
        fibo(n-1,b,c);
    }
} 

