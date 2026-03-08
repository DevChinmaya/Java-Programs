public class Demo {
    public static void main(String[] args) {
        A a1 = new A.getObject();
        A a2 = new A.getObject();
    }
}
class A{
    int i;
    private A(){
        i=15;
        System.out.println("i="+i);
    }
    public static A getObject(){
        return new A();
    }
}