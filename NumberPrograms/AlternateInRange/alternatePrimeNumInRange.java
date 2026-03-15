
import java.util.Scanner;

class alternatePrimeNumInRange{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to find prime numbers:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int count=0;
        for(int i=n; i<=m; i++){
            boolean flag = true;
            for(int j=2; j<i; j++){
                
                if(i%j == 0){
                    flag = false;
                    break;
                }
                count++;
            }
            if(i>1 && flag && count % 2 != 0){
                System.out.println(i);
            }
        }
    }
}