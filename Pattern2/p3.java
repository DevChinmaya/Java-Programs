
import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int sp=n-1;
        int st = 1;

        char ch='A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=st; k++){
                if(i==n || k==1 || k== st){
                    System.out.print(ch);
                    ch += 1;
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            sp--;
            st += 2;
        }
    }
}