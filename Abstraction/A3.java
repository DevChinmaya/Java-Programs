public class A3 {
    static abstract class P{
        abstract void m1();
        abstract void m2();
        public void m3(){
            System.out.println("m3()-P");
        }
    }
    static class Q extends P{
        @Override
        void m1(){
            System.out.println("m1()-Q");
        }
        @Override
        void m2(){
            System.out.println("m2()-Q");
        }
    }
    public static void main(String[] args) {
        P p = new Q();
        p.m1();
        p.m2();
        p.m3();
    }
}
