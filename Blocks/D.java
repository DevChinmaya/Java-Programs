
public class D {
	int i;
	{
		i=10;
		System.out.println("Non-StaticBlock Executed");
	}
	public static void main(String args[]) {
		System.out.println("Main Executed");
		D d = new D();
		System.out.println(d.i);
	}
	
}
