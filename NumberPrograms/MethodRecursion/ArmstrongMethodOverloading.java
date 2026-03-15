import java.util.*;
public class ArmstrongMethodOverloading {
    static int l;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        l = (n+"").length();
        System.out.println(isArmstrong(n));
    }
    public static boolean isArmstrong(int n){
        return isArmstrong(n,n,0);
    }
    public static boolean isArmstrong(int n,int m,int sum){      
        if(n==0){
            return sum == m;
        }  
        return isArmstrong(n/10,m,sum += Math.pow(n%10,l));
    }
}

