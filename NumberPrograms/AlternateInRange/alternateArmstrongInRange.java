
import java.util.Scanner;
public class alternateArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to find alternate Armstrong numbers:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int find=0;
        for(int i=n; i<=m; i++){
            int copy = i;
            int sum = 0;
            int count = 0;
            while(i>0){//count digits
                count++;
                i /= 10;
            }

            i=copy;
            while(i>0){//calculate sum of digits raised to the power of count
                int digit = i%10;
                int prod = 1;
                for(int j=1; j<=count; j++){
                    prod *= digit;
                }
                sum += prod;
                i /= 10;
            }
            i=copy;//copy value of i back to i
            if(sum == copy){
                find++;
                if(find % 2 != 0){
                    System.out.print(copy + " ");
                }
            } 
        }
        sc.close();
    }
}
