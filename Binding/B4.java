public class B4 {
    public static void main(String[] args) {
        X x = new Y();
        System.out.println(x.i);
        System.out.println(x.j);
        x.m1();
        x.m2();
        x.m3();
    }
}
class X{
    static int i=10;
    int j=20;
    public void m1(){
        System.out.println("m1()-X");
    }
    public static void m2(){
        System.out.println("m2()-X");
    }
    public final void m3(){
        System.out.println("m3()-X");
    }
}
class Y extends X{
    static int i=30;
    int j=10;
    @Override
    public void m1(){
        System.out.println("m1()-Y");
    }
    public static void m2(){
        System.out.println("m2()-Y");
    }
}
