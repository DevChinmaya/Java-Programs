import java.util.*;
public class NeonNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i=n; i<=m; i++){
            int sq=i*i;
            if(isNeon(i,sq,0)){
                System.out.println(i);
            }
        }
    }

    public static boolean isNeon(int n,int sq,int sum){
        if(sq==0){
            return sum==n;
        }
        sum += sq%10;
        return isNeon(n,sq/10,sum);
    }
}

