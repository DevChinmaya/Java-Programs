
import java.util.Scanner;
public class neonNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        int sum=0;
        int sq = n*n;
        while(sq>0){//count digits
            int d = sq%10;
            sum += d;
            sq /= 10;
        }
        if(sum == n){
            System.out.println(n + " is a neon num");
        }else{
            System.out.println(n + " is not a neon num");
        }
    }
}
