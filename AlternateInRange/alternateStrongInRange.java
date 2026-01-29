
import java.util.Scanner;
public class alternateStrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n=sc.nextInt();
        int m=sc.nextInt();

        int count=0;
        for(int i=n; i<=m; i++){
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
                count++;
                if(count % 2 != 0){
                   System.out.print(i+" ");
                }
            }
        }
    }
}
