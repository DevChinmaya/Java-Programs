
public class B {
	{
		System.out.println("Non Static Block-1");
	}
	static{
		new B();
		System.out.println("Static Block");
	}
	B(){
		System.out.println("B()-cons");
	}
	public static void main(String args[]) {
		System.out.println("Main start");
		System.out.println("Main ends");
	}
	{
		System.out.println("Non Static Block-2");
	}
}
