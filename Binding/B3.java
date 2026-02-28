public class B3 {
    public static void main(String[] args) {
        C c = new D();
        c.m1();//Late binding
        c.m1(10); //Late Binding
    }
}
class C{
    public void m1(){
        System.out.println("m1()-A ");
    }
    public void m1(int i){
        System.out.println("m1(int i)-A "+i);
    }
}

class D extends C{
    @Override
    public void m1(){
        System.out.println("m1()-B");
    }
    @Override
    public void m1(int i){
        System.out.println("m1(int i)-B"+i);
    }
}
