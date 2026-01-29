class pallindromeByMethods {
    public static void main(String[] args) { 
       int n = 121;
       if(isPalindrome(n) == true){
        System.out.println(n+" is pallindrome number");
       }else{
        System.out.println(n+" is not pallindrome number");
       }
            
    }
    public static boolean isPalindrome(int n){
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
