
import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isPerfect(n,n/2,0));
    }
    public static boolean isPerfect(int i,int d,int sum){
        if(d==0){
            return i==sum;
        }
        if(i%d==0){
            sum+=d;
        }
        return isPerfect(i,d-1,sum);
    }
}
