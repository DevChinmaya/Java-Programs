
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int sp1=0;
        int st1=n;

        //upperhalf
        for(int i=1; i<=n; i++){
            //st
            for(int j=1; j<=st1; j++){
                System.out.print("* ");
            }
            //sp
            for(int j=1; j<=sp1; j++){
                System.out.print("  ");
            }
            //st
            for(int j=1; j<=st1; j++){
                System.out.print("* ");
            }
            System.out.println();
            st1--;
            sp1+=2;
        }
        //lowerhalf
        int sp2=2*n-2;
        int st2=1;
        for(int i=1; i<=n; i++){
            //st
            for(int j=1; j<=st2; j++){
                System.out.print("* ");
            }
            //sp
            for(int j=1; j<=sp2; j++){
                System.out.print("  ");
            }
            //st
            for(int j=1; j<=st2; j++){
                System.out.print("* ");
            }
            System.out.println();
            sp2-=2;
            st2++;
        }
    }
}
