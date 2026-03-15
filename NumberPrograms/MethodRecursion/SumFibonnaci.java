
import java.util.Scanner;

public class SumFibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;       
        int sum = a+b;
        System.out.println(SumFibo(n-2,a,b,sum));
    }

    public static int SumFibo(int n,int a,int b,int sum) {
        if(n==0){
            return sum;
        }
        int c = a+b;
        a = b;
        b = c;
        sum += c;
        return SumFibo(n-1,a,b,sum);
    }
}
