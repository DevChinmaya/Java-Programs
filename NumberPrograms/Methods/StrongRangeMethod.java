import java.util.Scanner;
public class StrongRangeMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n=sc.nextInt();
        int m=sc.nextInt();

        for(int i=n; i<=m; i++){
            if(isStrong(i)){
                System.out.println(i+" is a Strong number");
            }
        }            
    }
    public static boolean isStrong(int num) {
        int sum=0;
        int copy=num;
        while(copy>0){
            int d=copy%10;
            int fact=1;
            for(int j=d; j>=1; j--){
                fact *= j;
            }
            sum += fact;
            copy /= 10;
        }
        return sum == num;
    }
}


