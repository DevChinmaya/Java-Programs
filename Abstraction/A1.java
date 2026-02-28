public class A1 {
    public static void main(String[] args) {
        A a = new B();
        a.m1();//m1()-B
    }
}
abstract class A{
    abstract public void m1();
}
class B extends A{
    @Override
    public void m1(){
        System.out.println("m1()-B");
    }
}
