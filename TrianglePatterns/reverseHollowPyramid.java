
import java.util.Scanner;
public class reverseHollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int sp = 0;
        int st = 2*n - 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=st; k++){
                if(i==1 || k==1 || k == st){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            sp ++;
            st -= 2;
        }
    }
}