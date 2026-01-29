
import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        int sp=n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
                
            }
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            sp--;
            System.out.println();
        }
    }
}
