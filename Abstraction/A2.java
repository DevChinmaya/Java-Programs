public class A2 {
    public static void main(String[] args) {
        X a = new Y();
        a.m1();
        a.m2();
        a.m3();
    }
}
abstract class X{
    abstract public void m1();
    abstract public void m2();
    public void m3(){
        System.out.println("m3()-A");
    }
}
class Y extends X{
    @Override
    public void m1(){
        System.out.println("m1()-B");
    }
    @Override
    public void m2(){
        System.out.println("m2()-B");
    }
}