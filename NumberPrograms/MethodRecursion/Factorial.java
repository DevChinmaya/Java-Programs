
public class Factorial {
    public static void main(String[] args) {
        findFactorial(5,1);
    }
    public static void findFactorial(int n,int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact*=n;
        findFactorial(n-1,fact);
    }
}
