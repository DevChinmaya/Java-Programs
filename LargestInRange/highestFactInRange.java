
import java.util.Scanner;
class highestFactInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to find factorial: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=m; i>=n; i--){
            int fact=1;
            int j=i;
            while(j>0){
                fact = fact * j;
                j--;    
            }
            System.out.println("Largest Factorial in range " + i + ": " + fact);
            break;
        }
        sc.close();
    }
}
