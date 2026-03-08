public class A1 {
    public static void main(String[] args) {
        A a = new B();
        a.m1();//m1()-B
        a.m1(10);
    }
}
abstract class A{
    abstract public void m1();
    abstract public void m1(int i);//We can Overload the abstract class
    abstract public void m2();
}
class B extends A{
    @Override
    public void m1(){
        System.out.println("m1()-B");
    }
    @Override
    public void m1(int i){
        System.out.println("m1(int i)-B");
    }
     @Override
    public void m2(){
        System.out.println("m1()-B");
    } 
}
