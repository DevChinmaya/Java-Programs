import java.util.Scanner;
public class Tribonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(findTribonnaci(i)+" ");
        }
    }
    public static int findTribonnaci(int n){
        if(n==0) return 0;
        if(n==1) return 0;
        if(n==2) return 1;
        return findTribonnaci(n-1) + findTribonnaci(n-2) + findTribonnaci(n-3);
    }
}
