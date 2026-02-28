

public class B {
	static {
		System.out.println("StaticBlock-1");
	}
	public static void main(String args[]) {
		System.out.println("Main Executed");
	}
	static {
		System.out.println("StaticBlock-2");
	}
}
