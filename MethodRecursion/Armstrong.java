import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int l = length(n,0);
        int copy = n;
        System.out.println(isArmstrong(153,copy, 0, 0,l));
    }
    public static boolean isArmstrong(int n,int copy,int sum,int prod,int l){      
        if(n==0){
            return sum == copy;
        }
        sum += Math.pow(n%10,l);
        return isArmstrong(n/10,copy,sum,prod,l);
    }
    public static int length(int n,int count){
        if(n==0){
            return count;
        }
        return length(n/10,++count);
    }
}

