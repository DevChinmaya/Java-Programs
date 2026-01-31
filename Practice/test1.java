import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int n = sc.nextInt();
        int sp=n-1;
        int st=1;
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=sp; j++){
                System.out.print("  ");             
            }
            //stars
            for(int j=1; j<=st; j++){
                if(i==n || j == 1 || j==st){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            sp--;
            st+=2;
        }
    }
}
