import java.util.Scanner;
public class StrongMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n=sc.nextInt();

        if(isStrong(n)){
            System.out.println(n+" is a Strong number");
        }else{
            System.out.println(n+" is not a Strong number");
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


