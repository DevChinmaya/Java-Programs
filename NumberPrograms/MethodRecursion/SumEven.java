
public class SumEven {
    public static void main(String[] args) {
        findEvenSum(1,10,0);
    }
    public static void findEvenSum(int i,int j,int sum){
        if(i>j){
            System.out.println(sum);
            return;
        }
        if(i%2==0){
            sum+=i;
        }
        findEvenSum(++i,j,sum);
    }
}
