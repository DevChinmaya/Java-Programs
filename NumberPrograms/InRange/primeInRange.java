
import java.util.Scanner;

class primeInRange{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to find prime numbers:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=n; i<=m; i++){
            boolean flag = true;
            for(int j=2; j<i; j++){
                
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(i>1 &&flag){
                System.out.println(i + " is a prime number.");
            }else{
                System.out.println(i + " is not a prime number.");
            }
        }
    }
}