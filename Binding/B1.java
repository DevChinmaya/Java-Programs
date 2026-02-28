public class B1 {
    public static void main(String[] args) {
        A a = new B();
        a.m1();//m1()A -- Early Binding
        a.m2();//m2()B -- Late Binding
    }
}
class A{
    public static void m1(){
        System.out.println("m1()-A");
    } 
    public void m2(){
        System.out.println("m2()-A");
    } 
}
class B extends A{
    public static void m1(){
        System.out.println("m1()-B");
    } 
    @Override
    public void m2(){
        System.out.println("m2()-B");
    } 
}
