public class Test3 {
    static final int i;
    static{
        i = 10;
    }
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.print();
    }
    private void print(){
        System.out.println(i);
    }
}