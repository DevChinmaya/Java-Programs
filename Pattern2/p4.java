
import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int sp=0;
        int st = 2*n-1;

        char ch='A';
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=st; k++){
                if(k==1 || k==st || i==1){
                    System.out.print(ch);
                    ch += 1;
                }else{
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();
            sp++;
            st -= 2;
        }
    }
}