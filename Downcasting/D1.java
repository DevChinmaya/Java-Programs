public class D1 {
    public static void main(String[] args) {
        A a = new B();//Upcasting (B to A)
        System.out.println(a.i);//10
        //System.out.println(a.j);//CTE
        a.m1();//m1()-A
        a.m2();//m2()-B
        //a.m3();//CTE

        B b = (B)a;//Downcasting(A to B)
        System.out.println(b.i);//20
        System.out.println(b.j);//30
        b.m1();//m1()B
        b.m2();//m1
    }
}
class A{
    int i=10;
    public static void m1(){
        System.out.println("m1()-A");
    }
    public void m2(){
        System.out.println("m2()-B");
    }
}
class B extends A{
    int i=20;
    int j=30;
    public static void m1(){
        System.out.println("m1()-B");
    }
    @Override
    public void m2(){
        System.out.println("m2()-B");
    }
    public void m3(){
        System.out.println("m3()-B");
    }
}