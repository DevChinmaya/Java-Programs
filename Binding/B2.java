public class B2 {
    public static void main(String[] args) {
        AA a = new BB();
        System.out.println(a.i);//10 - Early Binding
        System.out.println(a.j);//20 - Late Binding
    }
}

class AA{
    static int i=10;
    int j=20;
}
class BB extends AA{
    static int i=30;
    int j=40;
}
