
import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isSpy(n,0,1));
    }
    public static boolean isSpy(int n,int sum,int prod){
        if(n==0){
            return prod==sum;
        }
        sum += n%10;
        prod *= n%10;
        return isSpy(n/10,sum,prod);
    }
}
