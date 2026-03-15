import java.util.Scanner;
public class PrimePalindromeMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Prime Pallindrome: ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a Prime Palindrome.");
        } else {
            System.out.println(num + " is not a Prime Palindrome.");
        }
    }
    public static int isPrime(int num) {
        if (num <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return num;
    }
    public static boolean isPalindrome(int num) {
        if(isPrime(num) == 0) {
            return false;
        }else{
            int originalNum = num;
            int reversedNum = 0;
            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }
            return originalNum == reversedNum;
        }
        
    }
}
