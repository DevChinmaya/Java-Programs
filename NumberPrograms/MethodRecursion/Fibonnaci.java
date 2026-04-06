
import java.util.Scanner;
public class Fibonnaci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;  
        int c=1;     
        // System.out.print(a+" "+b+" ");
        // fibo(n-2,a,b);
        System.out.print(a+" "+b+" "+c+" ");
        trib(n-3,a,b,c);
        
    }
    public static void fibo(int n,int a,int b){
        if(n == 0) return ;      
        int c = a+b;
        System.out.print(c+" ");
        fibo(n-1,b,c);
    }
    public static void trib(int n,int a,int b,int c){
        if(n==0)return;
        int d=a+b+c;
        System.out.print(d+" ");
        trib(n-1,b,c,d);
    }
} 

