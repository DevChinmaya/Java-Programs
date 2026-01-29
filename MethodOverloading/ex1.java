

public class ex1 {
    public static void main(String[] args) {
        m1();
        m1(3);
        m1(2+3);
        ex1 d = new ex1();
        d.m1(2,5+7);
        m1(3,6,7);
    }
    public static void m1(){
        System.out.println("m1()");
    }
    public static void m1(int i){
        System.out.println("m1(int i) :"+i);
    }
    public void m1(int i,int j){
        System.out.println("m1(int i,int j) :"+i+" "+j);
    }
    public static void m1(int i,int j, int k){
        System.out.println("m1(int i,int j,int k) :"+i+" "+j+" "+k);
    }
}
