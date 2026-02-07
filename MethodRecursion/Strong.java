import java.util.*;
public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int copy=n;
        System.out.println(isStrong(n,copy,0));
       
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

