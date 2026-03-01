public class A4 {
    private final int i;
    public A4() {
        this.i = 10;
    }

    // public void m1(){
    //     i=10;
    // }
    
    // public static void m2(){
    //     i=20;
    // }

    public A4(int i) {
        this.i = i;
    }
    
    public static void main(String[] args) {
        A4 b = new A4();
        System.out.println(b.i);
        A4 b1 = new A4(20);
        System.out.println(b1.i);
        
    }
}

