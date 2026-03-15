
public class Sum {
    public static void main(String[] args) {
        findSum(10,0);
    }
    public static void findSum(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum+=n;
        findSum(n-1,sum);
    }
}
