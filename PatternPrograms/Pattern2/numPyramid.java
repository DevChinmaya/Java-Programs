
import java.util.Scanner;
public class numPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int sp=n-1;
        int st = 1;

        for(int i=1; i<=n; i++){
            
            int p=0;
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=st; j++){
                if(j<=i){
                    System.out.print(j);
                    p=j;
                }
                else{
                    System.out.print(--p);           
                }
            }
            System.out.println();
            sp--;
            st += 2;
        }
    }
}


/*
              1
            121
          12321
        1234321
      123454321
    12345654321
  1234567654321
123456787654321
 */