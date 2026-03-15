
public class R1 {
    public static void main(String[] args) {
        m1(10,100);
    }
    public static void m1(int i,int j){
        if(i>j) return;
        if(i%2==0){
            System.out.println(i);
        }
        m1(i+1,j);
    }
}
