
class A{
	public void m1() {
		System.out.println("M1()-A");
	}
}
class B extends A{
	@Override
	public final void m1() {
		System.out.println("M1()-B");
	}
}
class C extends A{
	@Override
	public final void m1() {
		System.out.println("M1()-C");
	}
}
//class C extends B{//CTE because we can't override final methods.Trying to override B class final method which will throw error
//	@Override
//	public final void m1() {
//		System.out.println("M1()-C");
//	}
//}
public class Test2 {
	public static void main(String[] args) {
		C c = new C();
		c.m1();
	}
}
