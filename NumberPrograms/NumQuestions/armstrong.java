
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
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
        if(sum == copy){
            System.out.println(copy + " is an Armstrong number.");
        }else{
            System.out.println(copy + " is not an Armstrong number.");
        }
    }
}
