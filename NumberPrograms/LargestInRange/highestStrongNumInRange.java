
import java.util.Scanner;
public class highestStrongNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n=sc.nextInt();
        int m=sc.nextInt();

        for(int i=m; i>=n; i--){
            int sum=0;
            int copy=i;
            while(copy>0){
                int d=copy%10;
                int fact=1;
                for(int j=d; j>=1; j--){
                    fact *= j;
                }
                sum += fact;
                copy /= 10;
            }
            if(sum == i){
                System.out.println("Highest Strong number in range: " + i);
                break;
            }
        }
    }
}
