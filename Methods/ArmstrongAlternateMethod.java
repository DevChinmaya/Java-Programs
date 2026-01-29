
import java.util.Scanner;
public class ArmstrongAlternateMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range to find alternate Armstrong numbers:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count=0;
        for(int i=n; i<=m; i++){
            if(isArmstrong(i)){
                count++;
                if(count % 2 !=0){
                    System.out.println(i + " is an Armstrong number.");
                }
                
            }
        }
    }
    public static boolean isArmstrong(int n) {
        int copy = n;
        int sum = 0;
        int count = 0;
        while(n>0){//count digits
            count++;
            n /= 10;
        }
        n=copy;
        while(n>0){//calculate sum of digits raised to the power of count
            int digit = n%10;
            int prod = 1;
            for(int j=1; j<=count; j++){
                prod *= digit;
            }
            sum += prod;
            n /= 10;
        }
        n=copy;//copy value of i back to i
        return sum == copy;
    }
}
