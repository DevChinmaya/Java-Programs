
class A{
	public void m1() {
		System.out.println("m1()-A");
	}
}

class B extends A{
	@Override
	public void m1() {
		System.out.println("m1()-B");
	}

}
public class Demo {
	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}
}
