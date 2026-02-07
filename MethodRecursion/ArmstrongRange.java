import java.util.*;
public class ArmstrongRange {
    static int l;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = sc.nextInt();
        int m=sc.nextInt();
        
        range(n,m);
    }
    public static void range(int st,int end){
        if(st>end) return;
        if(isArmstrong(st)) System.out.println(st);
        range(st+1,end);
    }
    public static boolean isArmstrong(int n){
        int l = (n+"").length();
        return isArmstrong(n,n,0,l);
    }
    public static boolean isArmstrong(int n,int m,int sum,int l){      
        if(n==0){
            return sum == m;
        }  
        return isArmstrong(n/10,m,sum += Math.pow(n%10,l),l);
    }
}