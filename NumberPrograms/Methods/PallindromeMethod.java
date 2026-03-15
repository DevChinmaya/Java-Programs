import java.util.Scanner;
public class PallindromeMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
            
        if(isPallindrome(n)){
            System.out.println(n+" is a Pallindrome number");
        }else{
            System.out.println(n+" is not a pallindrome number");
        }
    }
    public static boolean isPallindrome(int n) {
        int rev = 0;
        int copy = n;
        while(copy>0){
            int d = copy%10;
            rev = rev*10 + d;
            copy /= 10;
        }
        return rev == n;
    }
}
