
import java.util.Scanner;
public class alternateSpyNumInRange {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
        for(int i=a; i<=b; i++){
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
                count++;
                if(count % 2 != 0){
                    System.out.print(i+" ");
                }
                
            }
        }
    }
}
