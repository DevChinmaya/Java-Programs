import java.util.*;
public class StrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        range(n,m );     
    }
    public static void range(int st,int end){
        if(st>end) return;
        if(isStrong(st)) System.out.println(st);
        range(st+1,end);
    }
    public static boolean isStrong(int n){
        return isStrong(n,n,0);
    }
    public static boolean isStrong(int n,int copy,int sum){
        if(copy==0){
            return sum == n;
        }
        sum+=findFact(copy%10,1);
        return isStrong(n, copy/10, sum);
    }
    public static int findFact(int d,int fact){
        if(d==0){
            return fact;
        }
        fact *= d;
        return findFact(d-1,fact);
    }
}

