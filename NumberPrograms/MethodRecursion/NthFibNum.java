
import java.util.Scanner;

public class NthFibNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();  
        System.out.println(FibNum(n-1));
    }
    public static int FibNum(int n){
        if(n == 0)return 0;
        if(n == 1)return 1; 
        return FibNum(n-1)+FibNum(n-2);
    }
}
