
import java.util.Scanner;

public class NeonNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int st = sc.nextInt();
        int end = sc.nextInt();
        range(st, end);
    }
    public static void range(int st,int end){
        if(st > end) return ;
        if(isNeon(st,st*st)){
            System.out.println(st);
        }
        range(st+1,end);
    }
    public static boolean isNeon(int n,int sq){
        return sumOfDigits(sq) == n;      
    }
    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
//find sq
//sum of digits of sq
//check if sum of digits of sq is equal to n or not