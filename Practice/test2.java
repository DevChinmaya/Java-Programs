import java.util.*;
public class test2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int n = sc.nextInt();
        int sp=0;
        int st=2*n-1;
        for(int i=1; i<=n; i++){
            //sp
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            //st
            for(int j=1; j<=st; j++){
                if(i==1 || j==1 || j==st){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            st -= 2;
            sp ++ ;
        }
    }
}
