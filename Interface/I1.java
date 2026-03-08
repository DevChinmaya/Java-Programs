public class I1 {
    public static void main(String[] args) {
        
    }
}

interface A{
    void m1();
}
interface B{
    void m2();
}
class C {
    public void m2(){
        System.out.println("class C");
    }
}
class D extends C implements A,B {
    @Override
    public void m1(){
        System.out.println("A");
    }
    @Override
    public void m2(){
        System.out.println("B");
    }
    // @Override
    // void m2(){

    // }
}
