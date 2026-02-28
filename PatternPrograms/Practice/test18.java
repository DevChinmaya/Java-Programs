import java.util.Scanner;
public class test18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int d=2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(d+" ");
            }
            d += 2;
            System.out.println();
        }
    }
}