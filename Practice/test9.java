
import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int sp=0;
        int st=n;

        for(int i=1; i<=n; i++){
            //sp
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            //st
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }       
            System.out.println(); 
            if(i<=n/2){
                sp++;
                st-=2;
            }else{
                sp--;
                st+=2;
            }
        }       
    }
}
