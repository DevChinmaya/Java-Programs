public class B5 {
    public static void main(String[] args) {
        P p = new Q();
        R r = new S();
        r.m1(p);//here first it early binding will happen due to overloading at compile time
        //Then again it will be replaced be late binding because of overriding at run time
    }
}
class P{
    
}
class Q extends P{

}
class R{
    public void m1(P p){
        System.out.println("m1(P p)-R");
    }
    public void m1(Q q){
        System.out.println("m2(Q q)-R");
    }
}
class S extends R{
    @Override
    public void m1(P p){
        System.out.println("m1(P p)-S");
    }
    @Override
    public void m1(Q q){
        System.out.println("m2(Q q)-S");
    }
}