
import java.util.Scanner;
public class highestSpyNumInRange {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=b; i>=a; i--){
            int product = 1;
            int sum = 0;
            int copy = i;
            while(copy>0){
                int d = copy%10;
                product *= d;
                sum += d;
                copy /=10;
            }
            if(product == sum){
                System.out.print("Highest Spy Number in range: " + i);
                break;
            }
        }
    }
}