import java.util.Scanner;
public class strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n=sc.nextInt();

        int sum=0;
        int copy=n;
        while(copy>0){
            int d=copy%10;
            int fact=1;
            for(int j=d; j>=1; j--){
                fact *= j;
            }
            sum += fact;
            copy /= 10;
        }
        if(sum == n){
            System.out.println(n+" is a Strong number");
        }
    }
}