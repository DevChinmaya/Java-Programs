

public class C {
	static int i;
	int j;
	static {
		i=10;
	}
	public static void main(String args[]) {
		System.out.println("Main Executed");
		C c = new C();
		System.out.println(i);
		System.out.println(c.j);
		System.out.println("Main Ends");
	}
	static {
		i=30;
		int j=40;
	}
}

