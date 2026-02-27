import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int num=1;
        int sp=n/2;
        int st=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=st; j++){
                if(j<=(st+1)/2){
                    System.out.print(j+" ");
                }else{
                    System.out.print(st-j+" ");
                }
            }
            System.out.println();
            if(i<=n/2){
                st+=2;
                sp--;
            }else{
                st-=2;
                sp++;
            }
        }
    }
}