import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int st = sc.nextInt();
        int end = sc.nextInt();
        int count=0;
        range(st,end,count);
    }
    public static void range(int st,int end,int count){
        if(st>end) return;
        if(isAutomorphic(st)){
            count++;
            if(count % 2 != 0)
            System.out.println(st);
        }
        range(st+1,end,count);
    }
    public static boolean isAutomorphic(int n){
        return isAutomorphic(n,n*n);
    }
    public static boolean isAutomorphic(int n,int sq){
        if(n==0) return true;
        if(n%10 != sq%10) return false;
        return isAutomorphic(n/10,(n*n)/10);
    }
}
