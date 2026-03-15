
import java.util.Scanner;
public class SpyMethod {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        if(isSpyNumber(num)){
            System.out.println(num+" is a Spy number");
        }else{
            System.out.println(num+" is not a Spy number");
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