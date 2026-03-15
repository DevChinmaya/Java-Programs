
import java.util.Scanner;
public class spyNum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int product = 1;
        int sum = 0;
        int copy = num;
        while(num>0){
            int d = num%10;
            product *= d;
            sum += d;
            num /=10;
        }
        if(product == sum){
            System.out.println(copy+" is a Spy number");
        }else{
            System.out.println(copy+" is not a Spy number");
        }
    }
    
}
