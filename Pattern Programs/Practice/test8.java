
import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int sp1=0;
        int st1=n;

        //upperhalf
        for(int i=1; i<=2*n; i++){
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
            if(i<=n){
                st1--;
                sp1+=2;
                if(i==n){
                    sp1=2*n-2;
                    st1=1;
                }
            }else{
                st1++;
                sp1-=2;
            }
            
        }
        
    }
}

/*
Enter the number of rows: 11
* * * * * * * * * * * * * * * * * * * * * * 
* * * * * * * * * *     * * * * * * * * * * 
* * * * * * * * *         * * * * * * * * * 
* * * * * * * *             * * * * * * * * 
* * * * * * *                 * * * * * * * 
* * * * * *                     * * * * * * 
* * * * *                         * * * * * 
* * * *                             * * * * 
* * *                                 * * * 
* *                                     * * 
*                                         * 
*                                         * 
* *                                     * * 
* * *                                 * * * 
* * * *                             * * * * 
* * * * *                         * * * * * 
* * * * * *                     * * * * * * 
* * * * * * *                 * * * * * * *
* * * * * * * *             * * * * * * * *
* * * * * * * * *         * * * * * * * * *
* * * * * * * * * *     * * * * * * * * * * 
* * * * * * * * * * * * * * * * * * * * * *
*/