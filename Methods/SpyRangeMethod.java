
import java.util.Scanner;
public class SpyRangeMethod {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i=n; i<=m; i++){
            if(isSpyNumber(i)){
                System.out.println(i+" is a Spy number");
            }
        }   
    }
    public static boolean isSpyNumber(int num) {
        int product = 1;
        int sum = 0;
        int copy = num;
        while(num>0){
            int d = num%10;
            product *= d;
            sum += d;
            num /=10;
        }
        return product == sum;
    }
}