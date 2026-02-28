
class A{
	A(){
		System.out.println("AA()-cons");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("BB()-cons");
	}
}
class C extends B{
	C(){
		super();
		System.out.println("CC()-cons");
	}
}
public class Demo1 {
	public static void main(String[] args) {
		new C();
	}
}
