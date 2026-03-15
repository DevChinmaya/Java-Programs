public class Fib {
    public static void main(String[] args) {
        int n=5;
        Range(0, n-1);
    }
    public static void Range(int start,int end){
        if(start > end) return;
        System.out.println(fib(start));
        Range(start+1, end);
    }
    public static int fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
}
