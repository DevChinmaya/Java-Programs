import java.util.Scanner;
public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        boolean flag = true;
            for(int j=2; j<n; j++){
                if(n%j == 0){
                    flag = false;
                    break;
                }
            }
            if(n>1 &&flag){
                System.out.println(n + " is a prime number.");
            }else{
                System.out.println(n + " is not a prime number.");
            }    
    }
}
