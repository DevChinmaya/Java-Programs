
public class A {
	static int i;
	int a;
	public static void main(String args[]) {
		System.out.println("Main Executed");
		System.out.println(i);
	}
	static {
		i=10;
		int j=210;
		System.out.println("StaticBlock Executed");
	}
}