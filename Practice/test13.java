import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        char ch='A';
        int num=1;
        int sp=0;
        int st=2*n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=st; j++){
                if(j==1 || i==1 || j==st){
                    System.out.print(ch+" ");
                    ch++;
                }else{
                    System.out.print(num+" ");
                    num++;
                }   
            }
            System.out.println();
            sp++;
            st-=2;
        }
    }
}
